/**
 */
package smart_nursing_home;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smart_nursing_home.Elder#isBySelf <em>By Self</em>}</li>
 *   <li>{@link smart_nursing_home.Elder#isTidy <em>Tidy</em>}</li>
 *   <li>{@link smart_nursing_home.Elder#isTemperatureCheck <em>Temperature Check</em>}</li>
 *   <li>{@link smart_nursing_home.Elder#isBloodOxygenCheck <em>Blood Oxygen Check</em>}</li>
 *   <li>{@link smart_nursing_home.Elder#getDisease <em>Disease</em>}</li>
 * </ul>
 *
 * @see smart_nursing_home.Smart_nursing_homePackage#getElder()
 * @model
 * @generated
 */
public interface Elder extends Person {
	/**
	 * Returns the value of the '<em><b>By Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Self</em>' attribute.
	 * @see #setBySelf(boolean)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getElder_BySelf()
	 * @model
	 * @generated
	 */
	boolean isBySelf();

	/**
	 * Sets the value of the '{@link smart_nursing_home.Elder#isBySelf <em>By Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Self</em>' attribute.
	 * @see #isBySelf()
	 * @generated
	 */
	void setBySelf(boolean value);

	/**
	 * Returns the value of the '<em><b>Tidy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tidy</em>' attribute.
	 * @see #setTidy(boolean)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getElder_Tidy()
	 * @model
	 * @generated
	 */
	boolean isTidy();

	/**
	 * Sets the value of the '{@link smart_nursing_home.Elder#isTidy <em>Tidy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tidy</em>' attribute.
	 * @see #isTidy()
	 * @generated
	 */
	void setTidy(boolean value);

	/**
	 * Returns the value of the '<em><b>Temperature Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Check</em>' attribute.
	 * @see #setTemperatureCheck(boolean)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getElder_TemperatureCheck()
	 * @model
	 * @generated
	 */
	boolean isTemperatureCheck();

	/**
	 * Sets the value of the '{@link smart_nursing_home.Elder#isTemperatureCheck <em>Temperature Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Check</em>' attribute.
	 * @see #isTemperatureCheck()
	 * @generated
	 */
	void setTemperatureCheck(boolean value);

	/**
	 * Returns the value of the '<em><b>Blood Oxygen Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blood Oxygen Check</em>' attribute.
	 * @see #setBloodOxygenCheck(boolean)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getElder_BloodOxygenCheck()
	 * @model
	 * @generated
	 */
	boolean isBloodOxygenCheck();

	/**
	 * Sets the value of the '{@link smart_nursing_home.Elder#isBloodOxygenCheck <em>Blood Oxygen Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blood Oxygen Check</em>' attribute.
	 * @see #isBloodOxygenCheck()
	 * @generated
	 */
	void setBloodOxygenCheck(boolean value);

	/**
	 * Returns the value of the '<em><b>Disease</b></em>' reference list.
	 * The list contents are of type {@link smart_nursing_home.Disease}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disease</em>' reference list.
	 * @see smart_nursing_home.Smart_nursing_homePackage#getElder_Disease()
	 * @model
	 * @generated
	 */
	EList<Disease> getDisease();

} // Elder
