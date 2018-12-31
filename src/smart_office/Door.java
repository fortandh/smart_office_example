/**
 */
package smart_office;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smart_office.Door#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see smart_office.Smart_officePackage#getDoor()
 * @model
 * @generated
 */
public interface Door extends Clazz {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference list.
	 * The list contents are of type {@link smart_office.Room}.
	 * It is bidirectional and its opposite is '{@link smart_office.Room#getDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference list.
	 * @see smart_office.Smart_officePackage#getDoor_Room()
	 * @see smart_office.Room#getDoor
	 * @model opposite="door"
	 * @generated
	 */
	EList<Room> getRoom();

} // Door
