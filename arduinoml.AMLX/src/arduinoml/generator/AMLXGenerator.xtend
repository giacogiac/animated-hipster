package arduinoml.generator

import arduinoml.Actuator
import arduinoml.Brick
import arduinoml.Condition
import arduinoml.DigitalAction
import arduinoml.DigitalBrickState
import arduinoml.AMLMachine
import arduinoml.Sensor
import arduinoml.AMLState
import arduinoml.Transition
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import arduinoml.DigitalSensorCondition
import arduinoml.TimeCondition
import arduinoml.Comparison

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
	
	def compile(Brick b) '''
		«IF Sensor.isInstance(b)»
			«Sensor.cast(b).compile»
		«ELSEIF Actuator.isInstance(b)»
			«Actuator.cast(b).compile»
		«ENDIF»
	'''
	
	def compile(Sensor s) '''
		pinMode(«s.pin», INPUT);
	'''
	
	def compile(Actuator a) '''
		pinMode(«a.pin», OUTPUT);
	'''
	
	def compile(AMLState s) '''
		«FOR e : s.eClass.EAllStructuralFeatures»
			«e.featureID» «e.toString» «e.name»
		«ENDFOR»
		void «s.name»()
		{
			«FOR a : s.actions»
				«a.compile»
			«ENDFOR»
			elapsed = millis() - prev;
			«FOR t : s.transitions»
				«t.compile»
			«ENDFOR»
			return «s.name»();
		}
		
	'''
	
	def compile(DigitalAction d) '''
		digitalWrite(«d.actuator.pin», «d.BState.compile»);
	'''
	
	def compile(DigitalBrickState dbs) '''
		«IF dbs == DigitalBrickState.ON»
			HIGH
		«ELSEIF dbs == DigitalBrickState.OFF»
			LOW
		«ENDIF»
	'''
	
	def compile(Transition t) '''
		if («t.conditions.head.compile»«FOR c : t.conditions.tail» && «c.compile»«ENDFOR»)
		{
			prev = millis();
			return «t.goto.name»();
		}
	'''
	
	def compile(Condition c) '''
		«IF DigitalSensorCondition.isInstance(c)»
			«DigitalSensorCondition.cast(c).compile»
		«ELSEIF TimeCondition.isInstance(c)»
			«TimeCondition.cast(c).compile»
		«ENDIF»
	'''
	
	def compile(DigitalSensorCondition dc) '''
		(digitalRead(«dc.sensor.pin») == «dc.BState.compile»)
	'''
	
	def compile(TimeCondition tc) '''
		(elapsed «tc.TComp.compile» «tc.time»)
	'''
	
	def compile(Comparison c) '''
		«IF c == Comparison.INFERIOR»
			<
		«ELSEIF c == Comparison.SUPERIOR»
			>
		«ELSEIF c == Comparison.EQUAL»
			==
		«ENDIF»
	'''
	
	def blueprint(AMLMachine m) '''
		           
		           
		           
		            ---------------
		           |       a       | ----- D12. «m.bricks.findFirst[it.pin == 12].name»
		           |       r       | 
		           |       d       | ----- D11. «m.bricks.findFirst[it.pin == 11].name»
		           |       u       | 
		           |       i       | ----- D10. «m.bricks.findFirst[it.pin == 10].name»
		           |       n       | 
		           |       o       | ------ D9. «m.bricks.findFirst[it.pin == 9].name»
		           |       M       | 
		           |       L       | ------ D8. «m.bricks.findFirst[it.pin == 8].name»
		            ---------------
		           
	'''
}