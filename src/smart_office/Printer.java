/**
 */
package smart_office;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Printer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smart_office.Printer#getAsset <em>Asset</em>}</li>
 *   <li>{@link smart_office.Printer#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see smart_office.Smart_officePackage#getPrinter()
 * @model
 * @generated
 */
public interface Printer extends Clazz {
	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(Asset)
	 * @see smart_office.Smart_officePackage#getPrinter_Asset()
	 * @model
	 * @generated
	 */
	Asset getAsset();

	/**
	 * Sets the value of the '{@link smart_office.Printer#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(Asset value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smart_office.Room#getPrinter <em>Printer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see smart_office.Smart_officePackage#getPrinter_Room()
	 * @see smart_office.Room#getPrinter
	 * @model opposite="printer"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link smart_office.Printer#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

} // Printer
