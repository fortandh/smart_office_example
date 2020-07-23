/**
 */
package smart_nursing_home;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Roomba</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smart_nursing_home.Roomba#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see smart_nursing_home.Smart_nursing_homePackage#getRoomba()
 * @model
 * @generated
 */
public interface Roomba extends Clazz {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smart_nursing_home.Room#getRoomba <em>Roomba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getRoomba_Room()
	 * @see smart_nursing_home.Room#getRoomba
	 * @model opposite="roomba"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link smart_nursing_home.Roomba#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

} // Roomba
