package arduinoml.generator

import arduinoml.AMLMachine
import arduinoml.AMLState
import arduinoml.Action
import arduinoml.AnalogAction
import arduinoml.AnalogActionSensor
import arduinoml.AnalogActionValue
import arduinoml.AnalogActuator
import arduinoml.AnalogComparison
import arduinoml.AnalogCondition
import arduinoml.AnalogSensor
import arduinoml.Brick
import arduinoml.Condition
import arduinoml.DigitalAction
import arduinoml.DigitalActuator
import arduinoml.DigitalCondition
import arduinoml.DigitalSensor
import arduinoml.DigitalState
import arduinoml.TimeComparison
import arduinoml.TimeCondition
import arduinoml.Transition
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class AMLXGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (m : resource.allContents.toIterable.filter(AMLMachine)) {
			fsa.generateFile(resource.URI.trimFileExtension.lastSegment + ".arduino", m.compile);
			fsa.generateFile(resource.URI.trimFileExtension.lastSegment + ".blueprint", m.blueprint);
		}
	}

	def compile(AMLMachine m) '''
		unsigned long prev;
		unsigned long elapsed;
		
		void frequency()
		{
			«IF m.eIsSet(m.eClass.getEStructuralFeature("frequency")) && m.frequency < 1000»
				wait(«1000/m.frequency»);
			«ENDIF»
		}
		
		void setup()
		{
			«FOR b : m.bricks»
				«b.compile»
			«ENDFOR»
		}
		
		«FOR s : m.states»
			«s.compile»
		«ENDFOR»
		void loop()
		{
			prev = millis();
			return «m.start.name»();
		}
	'''
	
	def CharSequence compile(Brick b) {
		switch b {
			DigitalSensor : b.compile
			DigitalActuator : b.compile
			AnalogSensor : b.compile
			AnalogActuator : b.compile
		}
	}
	
	def compile(DigitalSensor s) '''
		pinMode(«s.pin», INPUT);
	'''
	
	def compile(DigitalActuator a) '''
		pinMode(«a.pin», OUTPUT);
	'''
	
	def compile(AMLState s) '''
		void «s.name»()
		{
			«FOR a : s.actions»
				«a.compile»
			«ENDFOR»
			frequency();
			elapsed = millis() - prev;
			«FOR t : s.transitions»
				«t.compile»
			«ENDFOR»
			return «s.name»();
		}
		
	'''
	
	def CharSequence compile(Action a) {
		switch a {
			DigitalAction : a.compile
			AnalogAction : a.compile
		}
	}
	
	def compile(DigitalAction a) '''
		digitalWrite(«a.actuator.pin», «a.DState.compile»);
	'''
	
	def compile(DigitalState s) '''
		«IF s == DigitalState.ON»HIGH«ELSEIF s == DigitalState.OFF»LOW«ENDIF»
	'''
	
	def CharSequence compile(AnalogAction a) {
		switch a {
			AnalogActionSensor : a.compile
			AnalogActionValue : a.compile
		}
	}
	
	def compile(AnalogActionValue a) '''
		analogWrite(«a.actuator.pin», «a.value»);
	'''
	
	def compile(AnalogActionSensor a) '''
		analogWrite(«a.actuator.pin», map(analogRead(«a.sensor.pin»), 0, 1023, 0, 255));
	'''
	
	def compile(Transition t) '''
		if («t.conditions.head.compile»«FOR c : t.conditions.tail» && «c.compile»«ENDFOR»)
		{
			prev = millis();
			return «t.goto.name»();
		}
	'''
	
	def CharSequence compile(Condition c) {
		switch c {
			TimeCondition : c.compile
			DigitalCondition : c.compile
			AnalogCondition : c.compile
		}
	}
	
	def compile(DigitalCondition c) '''
		(digitalRead(«c.sensor.pin») == «c.DState.compile»)
	'''
	
	def compile(AnalogCondition c) '''
		(digitalRead(«c.sensor.pin») «c.AComp.compile» «c.value»)
	'''
	
	def compile(TimeCondition tc) '''
		(elapsed «tc.TComp.compile» «tc.time»)
	'''
	
	def compile(TimeComparison c) '''
		«IF c == TimeComparison.^BEFORE»<«ELSEIF c == TimeComparison.^AFTER»>«ENDIF»
	'''
	
	def CharSequence compile(AnalogComparison c) {
		switch c {
			case AnalogComparison.GREATER : '>'
			case AnalogComparison.GREATEREQ : '>='
			case AnalogComparison.EQUAL : '=='
			case AnalogComparison.LOWEREQ : '<='
			case AnalogComparison.LOWER : '<'
		}
	}
	
	def blueprint(AMLMachine m) '''
	
	        +----------------------- A1. «IF m.bricks.exists[it.pin == 1]»«m.bricks.findFirst[it.pin == 1].name»«ENDIF»
	        |  
	        |  +-------------------- A2. «IF m.bricks.exists[it.pin == 2]»«m.bricks.findFirst[it.pin == 2].name»«ENDIF»
	        |  |  
	        |  |  +----------------- A3. «IF m.bricks.exists[it.pin == 3]»«m.bricks.findFirst[it.pin == 3].name»«ENDIF»
	        |  |  |  
	        |  |  |  +-------------- A4. «IF m.bricks.exists[it.pin == 4]»«m.bricks.findFirst[it.pin == 4].name»«ENDIF»
	        |  |  |  |  
	        |  |  |  |  +----------- A5. «IF m.bricks.exists[it.pin == 5]»«m.bricks.findFirst[it.pin == 5].name»«ENDIF»
	     ___|__|__|__|__|___  
	    /  |_||_||_||_||_| _\ 
	    |         a       |_+------ D12. «IF m.bricks.exists[it.pin == 12]»«m.bricks.findFirst[it.pin == 12].name»«ENDIF»
	    |         r        _| 
	    |         d       |_+------ D11. «IF m.bricks.exists[it.pin == 11]»«m.bricks.findFirst[it.pin == 11].name»«ENDIF»
	    |         u        _| 
	    |         i       |_+------ D10. «IF m.bricks.exists[it.pin == 10]»«m.bricks.findFirst[it.pin == 10].name»«ENDIF»
	    |         n        _| 
	    |         o       |_+------- D9. «IF m.bricks.exists[it.pin == 9]»«m.bricks.findFirst[it.pin == 9].name»«ENDIF»
	    |         M        _| 
	    |         L       |_+------- D8. «IF m.bricks.exists[it.pin == 8]»«m.bricks.findFirst[it.pin == 8].name»«ENDIF»
	    \___________________/ 
	    
	'''
}