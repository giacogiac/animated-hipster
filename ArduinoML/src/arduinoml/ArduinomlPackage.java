/**
 */
package arduinoml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see arduinoml.ArduinomlFactory
 * @model kind="package"
 * @generated
 */
public interface ArduinomlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arduinoml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://arduinoml/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arduinoml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinomlPackage eINSTANCE = arduinoml.impl.ArduinomlPackageImpl.init();

	/**
	 * The meta object id for the '{@link arduinoml.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoml.impl.MachineImpl
	 * @see arduinoml.impl.ArduinomlPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Bricks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__BRICKS = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__STATES = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__START = 2;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoml.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoml.impl.NamedElementImpl
	 * @see arduinoml.impl.ArduinomlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoml.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoml.impl.StateImpl
	 * @see arduinoml.impl.ArduinomlPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoml.impl.BrickImpl <em>Brick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoml.impl.BrickImpl
	 * @see arduinoml.impl.ArduinomlPackageImpl#getBrick()
	 * @generated
	 */
	int BRICK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__PIN = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Brick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Brick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoml.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoml.impl.SensorImpl
	 * @see arduinoml.impl.ArduinomlPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = BRICK__NAME;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PIN = BRICK__PIN;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = BRICK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = BRICK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoml.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoml.impl.ActuatorImpl
	 * @see arduinoml.impl.ArduinomlPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = BRICK__NAME;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PIN = BRICK__PIN;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = BRICK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = BRICK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoml.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoml.impl.TransitionImpl
	 * @see arduinoml.impl.ArduinomlPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Goto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GOTO = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITIONS = 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoml.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoml.impl.ConditionImpl
	 * @see arduinoml.impl.ArduinomlPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 9;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoml.impl.DigitalSensorConditionImpl <em>Digital Sensor Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoml.impl.DigitalSensorConditionImpl
	 * @see arduinoml.impl.ArduinomlPackageImpl#getDigitalSensorCondition()
	 * @generated
	 */
	int DIGITAL_SENSOR_CONDITION = 6;

	/**
	 * The feature id for the '<em><b>BState</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SENSOR_CONDITION__BSTATE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SENSOR_CONDITION__SENSOR = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Digital Sensor Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SENSOR_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Digital Sensor Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_SENSOR_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoml.impl.DigitalActionImpl <em>Digital Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoml.impl.DigitalActionImpl
	 * @see arduinoml.impl.ArduinomlPackageImpl#getDigitalAction()
	 * @generated
	 */
	int DIGITAL_ACTION = 7;

	/**
	 * The feature id for the '<em><b>BState</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ACTION__BSTATE = 0;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ACTION__ACTUATOR = 1;

	/**
	 * The number of structural features of the '<em>Digital Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Digital Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduinoml.impl.TimeConditionImpl <em>Time Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoml.impl.TimeConditionImpl
	 * @see arduinoml.impl.ArduinomlPackageImpl#getTimeCondition()
	 * @generated
	 */
	int TIME_CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION__TIME = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>TComp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION__TCOMP = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Time Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduinoml.DigitalBrickState <em>Digital Brick State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoml.DigitalBrickState
	 * @see arduinoml.impl.ArduinomlPackageImpl#getDigitalBrickState()
	 * @generated
	 */
	int DIGITAL_BRICK_STATE = 11;

	/**
	 * The meta object id for the '{@link arduinoml.Comparison <em>Comparison</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduinoml.Comparison
	 * @see arduinoml.impl.ArduinomlPackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 12;


	/**
	 * Returns the meta object for class '{@link arduinoml.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see arduinoml.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoml.Machine#getBricks <em>Bricks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bricks</em>'.
	 * @see arduinoml.Machine#getBricks()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Bricks();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoml.Machine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see arduinoml.Machine#getStates()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_States();

	/**
	 * Returns the meta object for the reference '{@link arduinoml.Machine#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see arduinoml.Machine#getStart()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Start();

	/**
	 * Returns the meta object for class '{@link arduinoml.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see arduinoml.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoml.State#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see arduinoml.State#getTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoml.State#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see arduinoml.State#getActions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Actions();

	/**
	 * Returns the meta object for class '{@link arduinoml.Brick <em>Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brick</em>'.
	 * @see arduinoml.Brick
	 * @generated
	 */
	EClass getBrick();

	/**
	 * Returns the meta object for the attribute '{@link arduinoml.Brick#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin</em>'.
	 * @see arduinoml.Brick#getPin()
	 * @see #getBrick()
	 * @generated
	 */
	EAttribute getBrick_Pin();

	/**
	 * Returns the meta object for class '{@link arduinoml.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see arduinoml.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link arduinoml.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see arduinoml.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link arduinoml.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see arduinoml.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link arduinoml.Transition#getGoto <em>Goto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goto</em>'.
	 * @see arduinoml.Transition#getGoto()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Goto();

	/**
	 * Returns the meta object for the containment reference list '{@link arduinoml.Transition#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see arduinoml.Transition#getConditions()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Conditions();

	/**
	 * Returns the meta object for class '{@link arduinoml.DigitalSensorCondition <em>Digital Sensor Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Sensor Condition</em>'.
	 * @see arduinoml.DigitalSensorCondition
	 * @generated
	 */
	EClass getDigitalSensorCondition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoml.DigitalSensorCondition#getBState <em>BState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BState</em>'.
	 * @see arduinoml.DigitalSensorCondition#getBState()
	 * @see #getDigitalSensorCondition()
	 * @generated
	 */
	EAttribute getDigitalSensorCondition_BState();

	/**
	 * Returns the meta object for the reference '{@link arduinoml.DigitalSensorCondition#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see arduinoml.DigitalSensorCondition#getSensor()
	 * @see #getDigitalSensorCondition()
	 * @generated
	 */
	EReference getDigitalSensorCondition_Sensor();

	/**
	 * Returns the meta object for class '{@link arduinoml.DigitalAction <em>Digital Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Action</em>'.
	 * @see arduinoml.DigitalAction
	 * @generated
	 */
	EClass getDigitalAction();

	/**
	 * Returns the meta object for the attribute '{@link arduinoml.DigitalAction#getBState <em>BState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BState</em>'.
	 * @see arduinoml.DigitalAction#getBState()
	 * @see #getDigitalAction()
	 * @generated
	 */
	EAttribute getDigitalAction_BState();

	/**
	 * Returns the meta object for the reference '{@link arduinoml.DigitalAction#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator</em>'.
	 * @see arduinoml.DigitalAction#getActuator()
	 * @see #getDigitalAction()
	 * @generated
	 */
	EReference getDigitalAction_Actuator();

	/**
	 * Returns the meta object for class '{@link arduinoml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see arduinoml.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link arduinoml.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see arduinoml.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link arduinoml.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see arduinoml.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link arduinoml.TimeCondition <em>Time Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Condition</em>'.
	 * @see arduinoml.TimeCondition
	 * @generated
	 */
	EClass getTimeCondition();

	/**
	 * Returns the meta object for the attribute '{@link arduinoml.TimeCondition#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see arduinoml.TimeCondition#getTime()
	 * @see #getTimeCondition()
	 * @generated
	 */
	EAttribute getTimeCondition_Time();

	/**
	 * Returns the meta object for the attribute '{@link arduinoml.TimeCondition#getTComp <em>TComp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TComp</em>'.
	 * @see arduinoml.TimeCondition#getTComp()
	 * @see #getTimeCondition()
	 * @generated
	 */
	EAttribute getTimeCondition_TComp();

	/**
	 * Returns the meta object for enum '{@link arduinoml.DigitalBrickState <em>Digital Brick State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Digital Brick State</em>'.
	 * @see arduinoml.DigitalBrickState
	 * @generated
	 */
	EEnum getDigitalBrickState();

	/**
	 * Returns the meta object for enum '{@link arduinoml.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison</em>'.
	 * @see arduinoml.Comparison
	 * @generated
	 */
	EEnum getComparison();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArduinomlFactory getArduinomlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link arduinoml.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoml.impl.MachineImpl
		 * @see arduinoml.impl.ArduinomlPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Bricks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__BRICKS = eINSTANCE.getMachine_Bricks();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__STATES = eINSTANCE.getMachine_States();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__START = eINSTANCE.getMachine_Start();

		/**
		 * The meta object literal for the '{@link arduinoml.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoml.impl.StateImpl
		 * @see arduinoml.impl.ArduinomlPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIONS = eINSTANCE.getState_Actions();

		/**
		 * The meta object literal for the '{@link arduinoml.impl.BrickImpl <em>Brick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoml.impl.BrickImpl
		 * @see arduinoml.impl.ArduinomlPackageImpl#getBrick()
		 * @generated
		 */
		EClass BRICK = eINSTANCE.getBrick();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRICK__PIN = eINSTANCE.getBrick_Pin();

		/**
		 * The meta object literal for the '{@link arduinoml.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoml.impl.SensorImpl
		 * @see arduinoml.impl.ArduinomlPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link arduinoml.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoml.impl.ActuatorImpl
		 * @see arduinoml.impl.ArduinomlPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link arduinoml.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoml.impl.TransitionImpl
		 * @see arduinoml.impl.ArduinomlPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Goto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GOTO = eINSTANCE.getTransition_Goto();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CONDITIONS = eINSTANCE.getTransition_Conditions();

		/**
		 * The meta object literal for the '{@link arduinoml.impl.DigitalSensorConditionImpl <em>Digital Sensor Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoml.impl.DigitalSensorConditionImpl
		 * @see arduinoml.impl.ArduinomlPackageImpl#getDigitalSensorCondition()
		 * @generated
		 */
		EClass DIGITAL_SENSOR_CONDITION = eINSTANCE.getDigitalSensorCondition();

		/**
		 * The meta object literal for the '<em><b>BState</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITAL_SENSOR_CONDITION__BSTATE = eINSTANCE.getDigitalSensorCondition_BState();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_SENSOR_CONDITION__SENSOR = eINSTANCE.getDigitalSensorCondition_Sensor();

		/**
		 * The meta object literal for the '{@link arduinoml.impl.DigitalActionImpl <em>Digital Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoml.impl.DigitalActionImpl
		 * @see arduinoml.impl.ArduinomlPackageImpl#getDigitalAction()
		 * @generated
		 */
		EClass DIGITAL_ACTION = eINSTANCE.getDigitalAction();

		/**
		 * The meta object literal for the '<em><b>BState</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITAL_ACTION__BSTATE = eINSTANCE.getDigitalAction_BState();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_ACTION__ACTUATOR = eINSTANCE.getDigitalAction_Actuator();

		/**
		 * The meta object literal for the '{@link arduinoml.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoml.impl.NamedElementImpl
		 * @see arduinoml.impl.ArduinomlPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link arduinoml.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoml.impl.ConditionImpl
		 * @see arduinoml.impl.ArduinomlPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link arduinoml.impl.TimeConditionImpl <em>Time Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoml.impl.TimeConditionImpl
		 * @see arduinoml.impl.ArduinomlPackageImpl#getTimeCondition()
		 * @generated
		 */
		EClass TIME_CONDITION = eINSTANCE.getTimeCondition();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONDITION__TIME = eINSTANCE.getTimeCondition_Time();

		/**
		 * The meta object literal for the '<em><b>TComp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONDITION__TCOMP = eINSTANCE.getTimeCondition_TComp();

		/**
		 * The meta object literal for the '{@link arduinoml.DigitalBrickState <em>Digital Brick State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoml.DigitalBrickState
		 * @see arduinoml.impl.ArduinomlPackageImpl#getDigitalBrickState()
		 * @generated
		 */
		EEnum DIGITAL_BRICK_STATE = eINSTANCE.getDigitalBrickState();

		/**
		 * The meta object literal for the '{@link arduinoml.Comparison <em>Comparison</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduinoml.Comparison
		 * @see arduinoml.impl.ArduinomlPackageImpl#getComparison()
		 * @generated
		 */
		EEnum COMPARISON = eINSTANCE.getComparison();

	}

} //ArduinomlPackage
