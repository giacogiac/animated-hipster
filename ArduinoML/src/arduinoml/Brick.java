/**
 */
package arduinoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduinoml.Brick#getPin <em>Pin</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduinoml.ArduinomlPackage#getBrick()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PinNumber UniquePin'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PinNumber='\n\t\t\tself.pin >= 8 and self.pin <= 12' UniquePin='\n\t\t\tBrick.allInstances()->one(b | b.pin = self.pin)'"
 * @generated
 */
public interface Brick extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' attribute.
	 * @see #setPin(int)
	 * @see arduinoml.ArduinomlPackage#getBrick_Pin()
	 * @model required="true"
	 * @generated
	 */
	int getPin();

	/**
	 * Sets the value of the '{@link arduinoml.Brick#getPin <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' attribute.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(int value);

} // Brick
