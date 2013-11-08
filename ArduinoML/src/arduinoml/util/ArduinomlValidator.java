/**
 */
package arduinoml.util;

import arduinoml.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see arduinoml.ArduinomlPackage
 * @generated
 */
public class ArduinomlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ArduinomlValidator INSTANCE = new ArduinomlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "arduinoml";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinomlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ArduinomlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ArduinomlPackage.MACHINE:
				return validateMachine((Machine)value, diagnostics, context);
			case ArduinomlPackage.STATE:
				return validateState((State)value, diagnostics, context);
			case ArduinomlPackage.BRICK:
				return validateBrick((Brick)value, diagnostics, context);
			case ArduinomlPackage.SENSOR:
				return validateSensor((Sensor)value, diagnostics, context);
			case ArduinomlPackage.ACTUATOR:
				return validateActuator((Actuator)value, diagnostics, context);
			case ArduinomlPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case ArduinomlPackage.DIGITAL_SENSOR_CONDITION:
				return validateDigitalSensorCondition((DigitalSensorCondition)value, diagnostics, context);
			case ArduinomlPackage.DIGITAL_ACTION:
				return validateDigitalAction((DigitalAction)value, diagnostics, context);
			case ArduinomlPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case ArduinomlPackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case ArduinomlPackage.TIME_CONDITION:
				return validateTimeCondition((TimeCondition)value, diagnostics, context);
			case ArduinomlPackage.DIGITAL_BRICK_STATE:
				return validateDigitalBrickState((DigitalBrickState)value, diagnostics, context);
			case ArduinomlPackage.COMPARISON:
				return validateComparison((Comparison)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine(Machine machine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(machine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(state, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBrick(Brick brick, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(brick, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(brick, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(brick, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(brick, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(brick, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(brick, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(brick, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(brick, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(brick, diagnostics, context);
		if (result || diagnostics != null) result &= validateBrick_PinNumber(brick, diagnostics, context);
		if (result || diagnostics != null) result &= validateBrick_UniquePin(brick, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PinNumber constraint of '<em>Brick</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BRICK__PIN_NUMBER__EEXPRESSION = "\n" +
		"\t\t\tself.pin >= 8 and self.pin <= 12";

	/**
	 * Validates the PinNumber constraint of '<em>Brick</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBrick_PinNumber(Brick brick, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ArduinomlPackage.Literals.BRICK,
				 brick,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PinNumber",
				 BRICK__PIN_NUMBER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniquePin constraint of '<em>Brick</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BRICK__UNIQUE_PIN__EEXPRESSION = "\n" +
		"\t\t\tBrick.allInstances()->one(b | b.pin = self.pin)";

	/**
	 * Validates the UniquePin constraint of '<em>Brick</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBrick_UniquePin(Brick brick, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ArduinomlPackage.Literals.BRICK,
				 brick,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniquePin",
				 BRICK__UNIQUE_PIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sensor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validateBrick_PinNumber(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validateBrick_UniquePin(sensor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuator(Actuator actuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actuator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actuator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actuator, diagnostics, context);
		if (result || diagnostics != null) result &= validateBrick_PinNumber(actuator, diagnostics, context);
		if (result || diagnostics != null) result &= validateBrick_UniquePin(actuator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDigitalSensorCondition(DigitalSensorCondition digitalSensorCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(digitalSensorCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDigitalAction(DigitalAction digitalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(digitalAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeCondition(TimeCondition timeCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDigitalBrickState(DigitalBrickState digitalBrickState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparison(Comparison comparison, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ArduinomlValidator
