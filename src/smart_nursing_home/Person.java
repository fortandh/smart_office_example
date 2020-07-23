/**
 */
package smart_nursing_home;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smart_nursing_home.Person#getRoom <em>Room</em>}</li>
 *   <li>{@link smart_nursing_home.Person#getMedicine <em>Medicine</em>}</li>
 * </ul>
 *
 * @see smart_nursing_home.Smart_nursing_homePackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends Clazz {
	/**
	 * Returns the value of the '<em><b>Medicine</b></em>' reference list.
	 * The list contents are of type {@link smart_nursing_home.Medicine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicine</em>' reference list.
	 * @see smart_nursing_home.Smart_nursing_homePackage#getPerson_Medicine()
	 * @model
	 * @generated
	 */
	EList<Medicine> getMedicine();

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smart_nursing_home.Room#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getPerson_Room()
	 * @see smart_nursing_home.Room#getPerson
	 * @model opposite="person"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link smart_nursing_home.Person#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

} // Person
