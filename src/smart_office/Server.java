/**
 */
package smart_office;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smart_office.Server#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see smart_office.Smart_officePackage#getServer()
 * @model
 * @generated
 */
public interface Server extends Clazz {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smart_office.Room#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see smart_office.Smart_officePackage#getServer_Room()
	 * @see smart_office.Room#getServer
	 * @model opposite="server"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link smart_office.Server#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

} // Server
