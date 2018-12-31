/**
 */
package smart_office;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smart_office.Window#isOn <em>On</em>}</li>
 *   <li>{@link smart_office.Window#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see smart_office.Smart_officePackage#getWindow()
 * @model
 * @generated
 */
public interface Window extends Clazz {
	/**
	 * Returns the value of the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' attribute.
	 * @see #setOn(boolean)
	 * @see smart_office.Smart_officePackage#getWindow_On()
	 * @model
	 * @generated
	 */
	boolean isOn();

	/**
	 * Sets the value of the '{@link smart_office.Window#isOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' attribute.
	 * @see #isOn()
	 * @generated
	 */
	void setOn(boolean value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smart_office.Room#getWindow <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see smart_office.Smart_officePackage#getWindow_Room()
	 * @see smart_office.Room#getWindow
	 * @model opposite="window"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link smart_office.Window#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

} // Window
