/**
 */
package arduinoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoml.Transition#getGoto <em>Goto</em>}</li>
 *   <li>{@link arduinoml.Transition#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoml.ArduinomlPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Goto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goto</em>' reference.
	 * @see #setGoto(State)
	 * @see arduinoml.ArduinomlPackage#getTransition_Goto()
	 * @model required="true"
	 * @generated
	 */
	State getGoto();

	/**
	 * Sets the value of the '{@link arduinoml.Transition#getGoto <em>Goto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goto</em>' reference.
	 * @see #getGoto()
	 * @generated
	 */
	void setGoto(State value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoml.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see arduinoml.ArduinomlPackage#getTransition_Conditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getConditions();

} // Transition
