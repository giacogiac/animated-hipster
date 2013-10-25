/**
 */
package arduinoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoml.TimeCondition#getTime <em>Time</em>}</li>
 *   <li>{@link arduinoml.TimeCondition#getTComp <em>TComp</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoml.ArduinomlPackage#getTimeCondition()
 * @model
 * @generated
 */
public interface TimeCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see arduinoml.ArduinomlPackage#getTimeCondition_Time()
	 * @model required="true"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link arduinoml.TimeCondition#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>TComp</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoml.Comparison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TComp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TComp</em>' attribute.
	 * @see arduinoml.Comparison
	 * @see #setTComp(Comparison)
	 * @see arduinoml.ArduinomlPackage#getTimeCondition_TComp()
	 * @model required="true"
	 * @generated
	 */
	Comparison getTComp();

	/**
	 * Sets the value of the '{@link arduinoml.TimeCondition#getTComp <em>TComp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TComp</em>' attribute.
	 * @see arduinoml.Comparison
	 * @see #getTComp()
	 * @generated
	 */
	void setTComp(Comparison value);

} // TimeCondition
