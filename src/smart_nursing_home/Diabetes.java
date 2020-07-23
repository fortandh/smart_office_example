/**
 */
package smart_nursing_home;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diabetes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smart_nursing_home.Diabetes#isGlucoseMeasured <em>Glucose Measured</em>}</li>
 *   <li>{@link smart_nursing_home.Diabetes#isInsulinInjected <em>Insulin Injected</em>}</li>
 * </ul>
 *
 * @see smart_nursing_home.Smart_nursing_homePackage#getDiabetes()
 * @model
 * @generated
 */
public interface Diabetes extends Disease {
	/**
	 * Returns the value of the '<em><b>Glucose Measured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glucose Measured</em>' attribute.
	 * @see #setGlucoseMeasured(boolean)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getDiabetes_GlucoseMeasured()
	 * @model
	 * @generated
	 */
	boolean isGlucoseMeasured();

	/**
	 * Sets the value of the '{@link smart_nursing_home.Diabetes#isGlucoseMeasured <em>Glucose Measured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glucose Measured</em>' attribute.
	 * @see #isGlucoseMeasured()
	 * @generated
	 */
	void setGlucoseMeasured(boolean value);

	/**
	 * Returns the value of the '<em><b>Insulin Injected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulin Injected</em>' attribute.
	 * @see #setInsulinInjected(boolean)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getDiabetes_InsulinInjected()
	 * @model
	 * @generated
	 */
	boolean isInsulinInjected();

	/**
	 * Sets the value of the '{@link smart_nursing_home.Diabetes#isInsulinInjected <em>Insulin Injected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulin Injected</em>' attribute.
	 * @see #isInsulinInjected()
	 * @generated
	 */
	void setInsulinInjected(boolean value);

} // Diabetes
