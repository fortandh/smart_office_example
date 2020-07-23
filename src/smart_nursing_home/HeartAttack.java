/**
 */
package smart_nursing_home;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heart Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smart_nursing_home.HeartAttack#isHeartRateCheck <em>Heart Rate Check</em>}</li>
 *   <li>{@link smart_nursing_home.HeartAttack#isAspirinTaken <em>Aspirin Taken</em>}</li>
 * </ul>
 *
 * @see smart_nursing_home.Smart_nursing_homePackage#getHeartAttack()
 * @model
 * @generated
 */
public interface HeartAttack extends Disease {
	/**
	 * Returns the value of the '<em><b>Heart Rate Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heart Rate Check</em>' attribute.
	 * @see #setHeartRateCheck(boolean)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getHeartAttack_HeartRateCheck()
	 * @model
	 * @generated
	 */
	boolean isHeartRateCheck();

	/**
	 * Sets the value of the '{@link smart_nursing_home.HeartAttack#isHeartRateCheck <em>Heart Rate Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heart Rate Check</em>' attribute.
	 * @see #isHeartRateCheck()
	 * @generated
	 */
	void setHeartRateCheck(boolean value);

	/**
	 * Returns the value of the '<em><b>Aspirin Taken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspirin Taken</em>' attribute.
	 * @see #setAspirinTaken(boolean)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getHeartAttack_AspirinTaken()
	 * @model
	 * @generated
	 */
	boolean isAspirinTaken();

	/**
	 * Sets the value of the '{@link smart_nursing_home.HeartAttack#isAspirinTaken <em>Aspirin Taken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspirin Taken</em>' attribute.
	 * @see #isAspirinTaken()
	 * @generated
	 */
	void setAspirinTaken(boolean value);

} // HeartAttack
