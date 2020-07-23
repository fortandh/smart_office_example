/**
 */
package smart_nursing_home.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smart_nursing_home.HeartAttack;
import smart_nursing_home.Smart_nursing_homePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heart Attack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smart_nursing_home.impl.HeartAttackImpl#isHeartRateCheck <em>Heart Rate Check</em>}</li>
 *   <li>{@link smart_nursing_home.impl.HeartAttackImpl#isAspirinTaken <em>Aspirin Taken</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeartAttackImpl extends DiseaseImpl implements HeartAttack {
	/**
	 * The default value of the '{@link #isHeartRateCheck() <em>Heart Rate Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeartRateCheck()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HEART_RATE_CHECK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHeartRateCheck() <em>Heart Rate Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeartRateCheck()
	 * @generated
	 * @ordered
	 */
	protected boolean heartRateCheck = HEART_RATE_CHECK_EDEFAULT;

	/**
	 * The default value of the '{@link #isAspirinTaken() <em>Aspirin Taken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAspirinTaken()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASPIRIN_TAKEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAspirinTaken() <em>Aspirin Taken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAspirinTaken()
	 * @generated
	 * @ordered
	 */
	protected boolean aspirinTaken = ASPIRIN_TAKEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeartAttackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Smart_nursing_homePackage.Literals.HEART_ATTACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHeartRateCheck() {
		return heartRateCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeartRateCheck(boolean newHeartRateCheck) {
		boolean oldHeartRateCheck = heartRateCheck;
		heartRateCheck = newHeartRateCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_nursing_homePackage.HEART_ATTACK__HEART_RATE_CHECK, oldHeartRateCheck, heartRateCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAspirinTaken() {
		return aspirinTaken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAspirinTaken(boolean newAspirinTaken) {
		boolean oldAspirinTaken = aspirinTaken;
		aspirinTaken = newAspirinTaken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_nursing_homePackage.HEART_ATTACK__ASPIRIN_TAKEN, oldAspirinTaken, aspirinTaken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Smart_nursing_homePackage.HEART_ATTACK__HEART_RATE_CHECK:
				return isHeartRateCheck();
			case Smart_nursing_homePackage.HEART_ATTACK__ASPIRIN_TAKEN:
				return isAspirinTaken();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Smart_nursing_homePackage.HEART_ATTACK__HEART_RATE_CHECK:
				setHeartRateCheck((Boolean)newValue);
				return;
			case Smart_nursing_homePackage.HEART_ATTACK__ASPIRIN_TAKEN:
				setAspirinTaken((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Smart_nursing_homePackage.HEART_ATTACK__HEART_RATE_CHECK:
				setHeartRateCheck(HEART_RATE_CHECK_EDEFAULT);
				return;
			case Smart_nursing_homePackage.HEART_ATTACK__ASPIRIN_TAKEN:
				setAspirinTaken(ASPIRIN_TAKEN_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Smart_nursing_homePackage.HEART_ATTACK__HEART_RATE_CHECK:
				return heartRateCheck != HEART_RATE_CHECK_EDEFAULT;
			case Smart_nursing_homePackage.HEART_ATTACK__ASPIRIN_TAKEN:
				return aspirinTaken != ASPIRIN_TAKEN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (heartRateCheck: ");
		result.append(heartRateCheck);
		result.append(", aspirinTaken: ");
		result.append(aspirinTaken);
		result.append(')');
		return result.toString();
	}

} //HeartAttackImpl
