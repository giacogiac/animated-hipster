/**
 */
package arduinoml.impl;

import arduinoml.ArduinomlPackage;
import arduinoml.Brick;
import arduinoml.Machine;
import arduinoml.State;

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
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduinoml.impl.MachineImpl#getBricks <em>Bricks</em>}</li>
 *   <li>{@link arduinoml.impl.MachineImpl#getStates <em>States</em>}</li>
 *   <li>{@link arduinoml.impl.MachineImpl#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MachineImpl extends MinimalEObjectImpl.Container implements Machine {
	/**
	 * The cached value of the '{@link #getBricks() <em>Bricks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBricks()
	 * @generated
	 * @ordered
	 */
	protected EList<Brick> bricks;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected State start;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinomlPackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Brick> getBricks() {
		if (bricks == null) {
			bricks = new EObjectContainmentEList<Brick>(Brick.class, this, ArduinomlPackage.MACHINE__BRICKS);
		}
		return bricks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, ArduinomlPackage.MACHINE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (State)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinomlPackage.MACHINE__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(State newStart) {
		State oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinomlPackage.MACHINE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinomlPackage.MACHINE__BRICKS:
				return ((InternalEList<?>)getBricks()).basicRemove(otherEnd, msgs);
			case ArduinomlPackage.MACHINE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
			case ArduinomlPackage.MACHINE__BRICKS:
				return getBricks();
			case ArduinomlPackage.MACHINE__STATES:
				return getStates();
			case ArduinomlPackage.MACHINE__START:
				if (resolve) return getStart();
				return basicGetStart();
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
			case ArduinomlPackage.MACHINE__BRICKS:
				getBricks().clear();
				getBricks().addAll((Collection<? extends Brick>)newValue);
				return;
			case ArduinomlPackage.MACHINE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case ArduinomlPackage.MACHINE__START:
				setStart((State)newValue);
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
			case ArduinomlPackage.MACHINE__BRICKS:
				getBricks().clear();
				return;
			case ArduinomlPackage.MACHINE__STATES:
				getStates().clear();
				return;
			case ArduinomlPackage.MACHINE__START:
				setStart((State)null);
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
			case ArduinomlPackage.MACHINE__BRICKS:
				return bricks != null && !bricks.isEmpty();
			case ArduinomlPackage.MACHINE__STATES:
				return states != null && !states.isEmpty();
			case ArduinomlPackage.MACHINE__START:
				return start != null;
		}
		return super.eIsSet(featureID);
	}

} //MachineImpl
