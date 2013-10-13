/**
 */
package arduinoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoml.Action#getBState <em>BState</em>}</li>
 *   <li>{@link arduinoml.Action#getActuator <em>Actuator</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoml.ArduinomlPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>BState</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoml.BrickState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BState</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BState</em>' attribute.
	 * @see arduinoml.BrickState
	 * @see #setBState(BrickState)
	 * @see arduinoml.ArduinomlPackage#getAction_BState()
	 * @model required="true"
	 * @generated
	 */
	BrickState getBState();

	/**
	 * Sets the value of the '{@link arduinoml.Action#getBState <em>BState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BState</em>' attribute.
	 * @see arduinoml.BrickState
	 * @see #getBState()
	 * @generated
	 */
	void setBState(BrickState value);

	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' reference.
	 * @see #setActuator(Actuator)
	 * @see arduinoml.ArduinomlPackage#getAction_Actuator()
	 * @model required="true"
	 * @generated
	 */
	Actuator getActuator();

	/**
	 * Sets the value of the '{@link arduinoml.Action#getActuator <em>Actuator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator</em>' reference.
	 * @see #getActuator()
	 * @generated
	 */
	void setActuator(Actuator value);

} // Action
