/**
 */
package smart_office;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Office</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smart_office.SmartOffice#getClazz <em>Clazz</em>}</li>
 * </ul>
 *
 * @see smart_office.Smart_officePackage#getSmartOffice()
 * @model
 * @generated
 */
public interface SmartOffice extends EObject {
	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' containment reference list.
	 * The list contents are of type {@link smart_office.Clazz}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clazz</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' containment reference list.
	 * @see smart_office.Smart_officePackage#getSmartOffice_Clazz()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clazz> getClazz();

} // SmartOffice
