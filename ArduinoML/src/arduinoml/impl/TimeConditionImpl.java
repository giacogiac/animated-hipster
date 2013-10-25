/**
 */
package arduinoml.impl;

import arduinoml.ArduinomlPackage;
import arduinoml.Comparison;
import arduinoml.TimeCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduinoml.impl.TimeConditionImpl#getTime <em>Time</em>}</li>
 *   <li>{@link arduinoml.impl.TimeConditionImpl#getTComp <em>TComp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeConditionImpl extends ConditionImpl implements TimeCondition {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTComp() <em>TComp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTComp()
	 * @generated
	 * @ordered
	 */
	protected static final Comparison TCOMP_EDEFAULT = Comparison.SUPERIOR;

	/**
	 * The cached value of the '{@link #getTComp() <em>TComp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTComp()
	 * @generated
	 * @ordered
	 */
	protected Comparison tComp = TCOMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinomlPackage.Literals.TIME_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinomlPackage.TIME_CONDITION__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparison getTComp() {
		return tComp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTComp(Comparison newTComp) {
		Comparison oldTComp = tComp;
		tComp = newTComp == null ? TCOMP_EDEFAULT : newTComp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinomlPackage.TIME_CONDITION__TCOMP, oldTComp, tComp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinomlPackage.TIME_CONDITION__TIME:
				return getTime();
			case ArduinomlPackage.TIME_CONDITION__TCOMP:
				return getTComp();
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
			case ArduinomlPackage.TIME_CONDITION__TIME:
				setTime((Integer)newValue);
				return;
			case ArduinomlPackage.TIME_CONDITION__TCOMP:
				setTComp((Comparison)newValue);
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
			case ArduinomlPackage.TIME_CONDITION__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ArduinomlPackage.TIME_CONDITION__TCOMP:
				setTComp(TCOMP_EDEFAULT);
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
			case ArduinomlPackage.TIME_CONDITION__TIME:
				return time != TIME_EDEFAULT;
			case ArduinomlPackage.TIME_CONDITION__TCOMP:
				return tComp != TCOMP_EDEFAULT;
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
		result.append(" (time: ");
		result.append(time);
		result.append(", tComp: ");
		result.append(tComp);
		result.append(')');
		return result.toString();
	}

} //TimeConditionImpl
