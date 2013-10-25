/**
 */
package arduinoml.impl;

import arduinoml.ArduinomlPackage;
import arduinoml.DigitalBrickState;
import arduinoml.DigitalSensorCondition;
import arduinoml.Sensor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digital Sensor Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduinoml.impl.DigitalSensorConditionImpl#getBState <em>BState</em>}</li>
 *   <li>{@link arduinoml.impl.DigitalSensorConditionImpl#getSensor <em>Sensor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DigitalSensorConditionImpl extends ConditionImpl implements DigitalSensorCondition {
	/**
	 * The default value of the '{@link #getBState() <em>BState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBState()
	 * @generated
	 * @ordered
	 */
	protected static final DigitalBrickState BSTATE_EDEFAULT = DigitalBrickState.OFF;

	/**
	 * The cached value of the '{@link #getBState() <em>BState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBState()
	 * @generated
	 * @ordered
	 */
	protected DigitalBrickState bState = BSTATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected Sensor sensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalSensorConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinomlPackage.Literals.DIGITAL_SENSOR_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalBrickState getBState() {
		return bState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBState(DigitalBrickState newBState) {
		DigitalBrickState oldBState = bState;
		bState = newBState == null ? BSTATE_EDEFAULT : newBState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinomlPackage.DIGITAL_SENSOR_CONDITION__BSTATE, oldBState, bState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor getSensor() {
		if (sensor != null && sensor.eIsProxy()) {
			InternalEObject oldSensor = (InternalEObject)sensor;
			sensor = (Sensor)eResolveProxy(oldSensor);
			if (sensor != oldSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinomlPackage.DIGITAL_SENSOR_CONDITION__SENSOR, oldSensor, sensor));
			}
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor basicGetSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensor(Sensor newSensor) {
		Sensor oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinomlPackage.DIGITAL_SENSOR_CONDITION__SENSOR, oldSensor, sensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinomlPackage.DIGITAL_SENSOR_CONDITION__BSTATE:
				return getBState();
			case ArduinomlPackage.DIGITAL_SENSOR_CONDITION__SENSOR:
				if (resolve) return getSensor();
				return basicGetSensor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArduinomlPackage.DIGITAL_SENSOR_CONDITION__BSTATE:
				setBState((DigitalBrickState)newValue);
				return;
			case ArduinomlPackage.DIGITAL_SENSOR_CONDITION__SENSOR:
				setSensor((Sensor)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArduinomlPackage.DIGITAL_SENSOR_CONDITION__BSTATE:
				setBState(BSTATE_EDEFAULT);
				return;
			case ArduinomlPackage.DIGITAL_SENSOR_CONDITION__SENSOR:
				setSensor((Sensor)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArduinomlPackage.DIGITAL_SENSOR_CONDITION__BSTATE:
				return bState != BSTATE_EDEFAULT;
			case ArduinomlPackage.DIGITAL_SENSOR_CONDITION__SENSOR:
				return sensor != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bState: ");
		result.append(bState);
		result.append(')');
		return result.toString();
	}

} //DigitalSensorConditionImpl
