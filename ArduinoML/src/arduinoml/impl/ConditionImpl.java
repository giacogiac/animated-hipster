/**
 */
package arduinoml.impl;

import arduinoml.ArduinomlPackage;
import arduinoml.BrickState;
import arduinoml.Condition;
import arduinoml.Sensor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduinoml.impl.ConditionImpl#getBState <em>BState</em>}</li>
 *   <li>{@link arduinoml.impl.ConditionImpl#getSensor <em>Sensor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The default value of the '{@link #getBState() <em>BState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBState()
	 * @generated
	 * @ordered
	 */
	protected static final BrickState BSTATE_EDEFAULT = BrickState.OFF;

	/**
	 * The cached value of the '{@link #getBState() <em>BState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBState()
	 * @generated
	 * @ordered
	 */
	protected BrickState bState = BSTATE_EDEFAULT;

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
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinomlPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrickState getBState() {
		return bState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBState(BrickState newBState) {
		BrickState oldBState = bState;
		bState = newBState == null ? BSTATE_EDEFAULT : newBState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinomlPackage.CONDITION__BSTATE, oldBState, bState));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinomlPackage.CONDITION__SENSOR, oldSensor, sensor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinomlPackage.CONDITION__SENSOR, oldSensor, sensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinomlPackage.CONDITION__BSTATE:
				return getBState();
			case ArduinomlPackage.CONDITION__SENSOR:
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
			case ArduinomlPackage.CONDITION__BSTATE:
				setBState((BrickState)newValue);
				return;
			case ArduinomlPackage.CONDITION__SENSOR:
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
			case ArduinomlPackage.CONDITION__BSTATE:
				setBState(BSTATE_EDEFAULT);
				return;
			case ArduinomlPackage.CONDITION__SENSOR:
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
			case ArduinomlPackage.CONDITION__BSTATE:
				return bState != BSTATE_EDEFAULT;
			case ArduinomlPackage.CONDITION__SENSOR:
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
		result.append(" (BState: ");
		result.append(bState);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
