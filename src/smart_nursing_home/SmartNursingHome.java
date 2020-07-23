/**
 */
package smart_nursing_home;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Nursing Home</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smart_nursing_home.SmartNursingHome#getClazz <em>Clazz</em>}</li>
 * </ul>
 *
 * @see smart_nursing_home.Smart_nursing_homePackage#getSmartNursingHome()
 * @model
 * @generated
 */
public interface SmartNursingHome extends EObject {
	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' containment reference list.
	 * The list contents are of type {@link smart_nursing_home.Clazz}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' containment reference list.
	 * @see smart_nursing_home.Smart_nursing_homePackage#getSmartNursingHome_Clazz()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clazz> getClazz();

} // SmartNursingHome
