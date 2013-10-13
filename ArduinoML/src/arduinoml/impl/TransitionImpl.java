/**
 */
package arduinoml.impl;

import arduinoml.ArduinomlPackage;
import arduinoml.Condition;
import arduinoml.State;
import arduinoml.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduinoml.impl.TransitionImpl#getGoto <em>Goto</em>}</li>
 *   <li>{@link arduinoml.impl.TransitionImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getGoto() <em>Goto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoto()
	 * @generated
	 * @ordered
	 */
	protected State goto_;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinomlPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getGoto() {
		if (goto_ != null && goto_.eIsProxy()) {
			InternalEObject oldGoto = (InternalEObject)goto_;
			goto_ = (State)eResolveProxy(oldGoto);
			if (goto_ != oldGoto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinomlPackage.TRANSITION__GOTO, oldGoto, goto_));
			}
		}
		return goto_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetGoto() {
		return goto_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoto(State newGoto) {
		State oldGoto = goto_;
		goto_ = newGoto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinomlPackage.TRANSITION__GOTO, oldGoto, goto_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this, ArduinomlPackage.TRANSITION__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinomlPackage.TRANSITION__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinomlPackage.TRANSITION__GOTO:
				if (resolve) return getGoto();
				return basicGetGoto();
			case ArduinomlPackage.TRANSITION__CONDITIONS:
				return getConditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArduinomlPackage.TRANSITION__GOTO:
				setGoto((State)newValue);
				return;
			case ArduinomlPackage.TRANSITION__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
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
			case ArduinomlPackage.TRANSITION__GOTO:
				setGoto((State)null);
				return;
			case ArduinomlPackage.TRANSITION__CONDITIONS:
				getConditions().clear();
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
			case ArduinomlPackage.TRANSITION__GOTO:
				return goto_ != null;
			case ArduinomlPackage.TRANSITION__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
