/**
 */
package smart_nursing_home;

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
 *   <li>{@link smart_nursing_home.Door#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see smart_nursing_home.Smart_nursing_homePackage#getDoor()
 * @model
 * @generated
 */
public interface Door extends Clazz {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference list.
	 * The list contents are of type {@link smart_nursing_home.Room}.
	 * It is bidirectional and its opposite is '{@link smart_nursing_home.Room#getDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference list.
	 * @see smart_nursing_home.Smart_nursing_homePackage#getDoor_Room()
	 * @see smart_nursing_home.Room#getDoor
	 * @model opposite="door"
	 * @generated
	 */
	EList<Room> getRoom();

} // Door
