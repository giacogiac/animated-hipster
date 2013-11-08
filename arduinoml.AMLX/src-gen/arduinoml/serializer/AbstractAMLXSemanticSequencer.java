package arduinoml.serializer;

import arduinoml.Actuator;
import arduinoml.ArduinomlPackage;
import arduinoml.DigitalAction;
import arduinoml.DigitalSensorCondition;
import arduinoml.Machine;
import arduinoml.Sensor;
import arduinoml.State;
import arduinoml.TimeCondition;
import arduinoml.Transition;
import arduinoml.services.AMLXGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractAMLXSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AMLXGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ArduinomlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ArduinomlPackage.ACTUATOR:
				if(context == grammarAccess.getActuatorRule() ||
				   context == grammarAccess.getBrickRule()) {
					sequence_Actuator(context, (Actuator) semanticObject); 
					return; 
				}
				else break;
			case ArduinomlPackage.DIGITAL_ACTION:
				if(context == grammarAccess.getDigitalActionRule()) {
					sequence_DigitalAction(context, (DigitalAction) semanticObject); 
					return; 
				}
				else break;
			case ArduinomlPackage.DIGITAL_SENSOR_CONDITION:
				if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getDigitalSensorConditionRule()) {
					sequence_DigitalSensorCondition(context, (DigitalSensorCondition) semanticObject); 
					return; 
				}
				else break;
			case ArduinomlPackage.MACHINE:
				if(context == grammarAccess.getMachineRule()) {
					sequence_Machine(context, (Machine) semanticObject); 
					return; 
				}
				else break;
			case ArduinomlPackage.SENSOR:
				if(context == grammarAccess.getBrickRule() ||
				   context == grammarAccess.getSensorRule()) {
					sequence_Sensor(context, (Sensor) semanticObject); 
					return; 
				}
				else break;
			case ArduinomlPackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case ArduinomlPackage.TIME_CONDITION:
				if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getTimeConditionRule()) {
					sequence_TimeCondition(context, (TimeCondition) semanticObject); 
					return; 
				}
				else break;
			case ArduinomlPackage.TRANSITION:
				if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString pin=EInt)
	 */
	protected void sequence_Actuator(EObject context, Actuator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArduinomlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinomlPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ArduinomlPackage.Literals.BRICK__PIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinomlPackage.Literals.BRICK__PIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActuatorAccess().getPinEIntParserRuleCall_4_0(), semanticObject.getPin());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (bState=DigitalBrickState actuator=[Actuator|EString])
	 */
	protected void sequence_DigitalAction(EObject context, DigitalAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArduinomlPackage.Literals.DIGITAL_ACTION__BSTATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinomlPackage.Literals.DIGITAL_ACTION__BSTATE));
			if(transientValues.isValueTransient(semanticObject, ArduinomlPackage.Literals.DIGITAL_ACTION__ACTUATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinomlPackage.Literals.DIGITAL_ACTION__ACTUATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDigitalActionAccess().getBStateDigitalBrickStateParserRuleCall_3_0(), semanticObject.getBState());
		feeder.accept(grammarAccess.getDigitalActionAccess().getActuatorActuatorEStringParserRuleCall_5_0_1(), semanticObject.getActuator());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (bState=DigitalBrickState sensor=[Sensor|EString])
	 */
	protected void sequence_DigitalSensorCondition(EObject context, DigitalSensorCondition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArduinomlPackage.Literals.DIGITAL_SENSOR_CONDITION__BSTATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinomlPackage.Literals.DIGITAL_SENSOR_CONDITION__BSTATE));
			if(transientValues.isValueTransient(semanticObject, ArduinomlPackage.Literals.DIGITAL_SENSOR_CONDITION__SENSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinomlPackage.Literals.DIGITAL_SENSOR_CONDITION__SENSOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDigitalSensorConditionAccess().getBStateDigitalBrickStateParserRuleCall_3_0(), semanticObject.getBState());
		feeder.accept(grammarAccess.getDigitalSensorConditionAccess().getSensorSensorEStringParserRuleCall_5_0_1(), semanticObject.getSensor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (start=[State|EString] (bricks+=Brick bricks+=Brick*)? states+=State states+=State*)
	 */
	protected void sequence_Machine(EObject context, Machine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString pin=EInt)
	 */
	protected void sequence_Sensor(EObject context, Sensor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArduinomlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinomlPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ArduinomlPackage.Literals.BRICK__PIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinomlPackage.Literals.BRICK__PIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSensorAccess().getPinEIntParserRuleCall_4_0(), semanticObject.getPin());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (transitions+=Transition transitions+=Transition*)? (actions+=DigitalAction actions+=DigitalAction*)?)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (time=EInt tComp=Comparison)
	 */
	protected void sequence_TimeCondition(EObject context, TimeCondition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArduinomlPackage.Literals.TIME_CONDITION__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinomlPackage.Literals.TIME_CONDITION__TIME));
			if(transientValues.isValueTransient(semanticObject, ArduinomlPackage.Literals.TIME_CONDITION__TCOMP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinomlPackage.Literals.TIME_CONDITION__TCOMP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTimeConditionAccess().getTimeEIntParserRuleCall_3_0(), semanticObject.getTime());
		feeder.accept(grammarAccess.getTimeConditionAccess().getTCompComparisonParserRuleCall_5_0(), semanticObject.getTComp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (goto=[State|EString] conditions+=Condition conditions+=Condition*)
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
