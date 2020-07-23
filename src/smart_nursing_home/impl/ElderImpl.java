/**
 */
package smart_nursing_home.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import smart_nursing_home.Disease;
import smart_nursing_home.Elder;
import smart_nursing_home.Smart_nursing_homePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smart_nursing_home.impl.ElderImpl#isBySelf <em>By Self</em>}</li>
 *   <li>{@link smart_nursing_home.impl.ElderImpl#isTidy <em>Tidy</em>}</li>
 *   <li>{@link smart_nursing_home.impl.ElderImpl#isTemperatureCheck <em>Temperature Check</em>}</li>
 *   <li>{@link smart_nursing_home.impl.ElderImpl#isBloodOxygenCheck <em>Blood Oxygen Check</em>}</li>
 *   <li>{@link smart_nursing_home.impl.ElderImpl#getDisease <em>Disease</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElderImpl extends PersonImpl implements Elder {
	/**
	 * The default value of the '{@link #isBySelf() <em>By Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBySelf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BY_SELF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBySelf() <em>By Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBySelf()
	 * @generated
	 * @ordered
	 */
	protected boolean bySelf = BY_SELF_EDEFAULT;

	/**
	 * The default value of the '{@link #isTidy() <em>Tidy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTidy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIDY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTidy() <em>Tidy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTidy()
	 * @generated
	 * @ordered
	 */
	protected boolean tidy = TIDY_EDEFAULT;

	/**
	 * The default value of the '{@link #isTemperatureCheck() <em>Temperature Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemperatureCheck()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEMPERATURE_CHECK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTemperatureCheck() <em>Temperature Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemperatureCheck()
	 * @generated
	 * @ordered
	 */
	protected boolean temperatureCheck = TEMPERATURE_CHECK_EDEFAULT;

	/**
	 * The default value of the '{@link #isBloodOxygenCheck() <em>Blood Oxygen Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBloodOxygenCheck()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLOOD_OXYGEN_CHECK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBloodOxygenCheck() <em>Blood Oxygen Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBloodOxygenCheck()
	 * @generated
	 * @ordered
	 */
	protected boolean bloodOxygenCheck = BLOOD_OXYGEN_CHECK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDisease() <em>Disease</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisease()
	 * @generated
	 * @ordered
	 */
	protected EList<Disease> disease;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Smart_nursing_homePackage.Literals.ELDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBySelf() {
		return bySelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBySelf(boolean newBySelf) {
		boolean oldBySelf = bySelf;
		bySelf = newBySelf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_nursing_homePackage.ELDER__BY_SELF, oldBySelf, bySelf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTidy() {
		return tidy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTidy(boolean newTidy) {
		boolean oldTidy = tidy;
		tidy = newTidy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_nursing_homePackage.ELDER__TIDY, oldTidy, tidy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTemperatureCheck() {
		return temperatureCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperatureCheck(boolean newTemperatureCheck) {
		boolean oldTemperatureCheck = temperatureCheck;
		temperatureCheck = newTemperatureCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_nursing_homePackage.ELDER__TEMPERATURE_CHECK, oldTemperatureCheck, temperatureCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBloodOxygenCheck() {
		return bloodOxygenCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBloodOxygenCheck(boolean newBloodOxygenCheck) {
		boolean oldBloodOxygenCheck = bloodOxygenCheck;
		bloodOxygenCheck = newBloodOxygenCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_nursing_homePackage.ELDER__BLOOD_OXYGEN_CHECK, oldBloodOxygenCheck, bloodOxygenCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Disease> getDisease() {
		if (disease == null) {
			disease = new EObjectResolvingEList<Disease>(Disease.class, this, Smart_nursing_homePackage.ELDER__DISEASE);
		}
		return disease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Smart_nursing_homePackage.ELDER__BY_SELF:
				return isBySelf();
			case Smart_nursing_homePackage.ELDER__TIDY:
				return isTidy();
			case Smart_nursing_homePackage.ELDER__TEMPERATURE_CHECK:
				return isTemperatureCheck();
			case Smart_nursing_homePackage.ELDER__BLOOD_OXYGEN_CHECK:
				return isBloodOxygenCheck();
			case Smart_nursing_homePackage.ELDER__DISEASE:
				return getDisease();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Smart_nursing_homePackage.ELDER__BY_SELF:
				setBySelf((Boolean)newValue);
				return;
			case Smart_nursing_homePackage.ELDER__TIDY:
				setTidy((Boolean)newValue);
				return;
			case Smart_nursing_homePackage.ELDER__TEMPERATURE_CHECK:
				setTemperatureCheck((Boolean)newValue);
				return;
			case Smart_nursing_homePackage.ELDER__BLOOD_OXYGEN_CHECK:
				setBloodOxygenCheck((Boolean)newValue);
				return;
			case Smart_nursing_homePackage.ELDER__DISEASE:
				getDisease().clear();
				getDisease().addAll((Collection<? extends Disease>)newValue);
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
			case Smart_nursing_homePackage.ELDER__BY_SELF:
				setBySelf(BY_SELF_EDEFAULT);
				return;
			case Smart_nursing_homePackage.ELDER__TIDY:
				setTidy(TIDY_EDEFAULT);
				return;
			case Smart_nursing_homePackage.ELDER__TEMPERATURE_CHECK:
				setTemperatureCheck(TEMPERATURE_CHECK_EDEFAULT);
				return;
			case Smart_nursing_homePackage.ELDER__BLOOD_OXYGEN_CHECK:
				setBloodOxygenCheck(BLOOD_OXYGEN_CHECK_EDEFAULT);
				return;
			case Smart_nursing_homePackage.ELDER__DISEASE:
				getDisease().clear();
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
			case Smart_nursing_homePackage.ELDER__BY_SELF:
				return bySelf != BY_SELF_EDEFAULT;
			case Smart_nursing_homePackage.ELDER__TIDY:
				return tidy != TIDY_EDEFAULT;
			case Smart_nursing_homePackage.ELDER__TEMPERATURE_CHECK:
				return temperatureCheck != TEMPERATURE_CHECK_EDEFAULT;
			case Smart_nursing_homePackage.ELDER__BLOOD_OXYGEN_CHECK:
				return bloodOxygenCheck != BLOOD_OXYGEN_CHECK_EDEFAULT;
			case Smart_nursing_homePackage.ELDER__DISEASE:
				return disease != null && !disease.isEmpty();
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
		result.append(" (bySelf: ");
		result.append(bySelf);
		result.append(", tidy: ");
		result.append(tidy);
		result.append(", temperatureCheck: ");
		result.append(temperatureCheck);
		result.append(", bloodOxygenCheck: ");
		result.append(bloodOxygenCheck);
		result.append(')');
		return result.toString();
	}

} //ElderImpl
