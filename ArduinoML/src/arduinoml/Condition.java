/**
 */
package arduinoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoml.Condition#getBState <em>BState</em>}</li>
 *   <li>{@link arduinoml.Condition#getSensor <em>Sensor</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoml.ArduinomlPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
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
	 * @see arduinoml.ArduinomlPackage#getCondition_BState()
	 * @model required="true"
	 * @generated
	 */
	BrickState getBState();

	/**
	 * Sets the value of the '{@link arduinoml.Condition#getBState <em>BState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BState</em>' attribute.
	 * @see arduinoml.BrickState
	 * @see #getBState()
	 * @generated
	 */
	void setBState(BrickState value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Sensor)
	 * @see arduinoml.ArduinomlPackage#getCondition_Sensor()
	 * @model required="true"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link arduinoml.Condition#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

} // Condition
