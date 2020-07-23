/**
 */
package smart_nursing_home.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smart_nursing_home.Diabetes;
import smart_nursing_home.Smart_nursing_homePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diabetes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smart_nursing_home.impl.DiabetesImpl#isGlucoseMeasured <em>Glucose Measured</em>}</li>
 *   <li>{@link smart_nursing_home.impl.DiabetesImpl#isInsulinInjected <em>Insulin Injected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiabetesImpl extends DiseaseImpl implements Diabetes {
	/**
	 * The default value of the '{@link #isGlucoseMeasured() <em>Glucose Measured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGlucoseMeasured()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GLUCOSE_MEASURED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGlucoseMeasured() <em>Glucose Measured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGlucoseMeasured()
	 * @generated
	 * @ordered
	 */
	protected boolean glucoseMeasured = GLUCOSE_MEASURED_EDEFAULT;

	/**
	 * The default value of the '{@link #isInsulinInjected() <em>Insulin Injected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsulinInjected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSULIN_INJECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInsulinInjected() <em>Insulin Injected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsulinInjected()
	 * @generated
	 * @ordered
	 */
	protected boolean insulinInjected = INSULIN_INJECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiabetesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Smart_nursing_homePackage.Literals.DIABETES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGlucoseMeasured() {
		return glucoseMeasured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlucoseMeasured(boolean newGlucoseMeasured) {
		boolean oldGlucoseMeasured = glucoseMeasured;
		glucoseMeasured = newGlucoseMeasured;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_nursing_homePackage.DIABETES__GLUCOSE_MEASURED, oldGlucoseMeasured, glucoseMeasured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInsulinInjected() {
		return insulinInjected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsulinInjected(boolean newInsulinInjected) {
		boolean oldInsulinInjected = insulinInjected;
		insulinInjected = newInsulinInjected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_nursing_homePackage.DIABETES__INSULIN_INJECTED, oldInsulinInjected, insulinInjected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Smart_nursing_homePackage.DIABETES__GLUCOSE_MEASURED:
				return isGlucoseMeasured();
			case Smart_nursing_homePackage.DIABETES__INSULIN_INJECTED:
				return isInsulinInjected();
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
			case Smart_nursing_homePackage.DIABETES__GLUCOSE_MEASURED:
				setGlucoseMeasured((Boolean)newValue);
				return;
			case Smart_nursing_homePackage.DIABETES__INSULIN_INJECTED:
				setInsulinInjected((Boolean)newValue);
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
			case Smart_nursing_homePackage.DIABETES__GLUCOSE_MEASURED:
				setGlucoseMeasured(GLUCOSE_MEASURED_EDEFAULT);
				return;
			case Smart_nursing_homePackage.DIABETES__INSULIN_INJECTED:
				setInsulinInjected(INSULIN_INJECTED_EDEFAULT);
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
			case Smart_nursing_homePackage.DIABETES__GLUCOSE_MEASURED:
				return glucoseMeasured != GLUCOSE_MEASURED_EDEFAULT;
			case Smart_nursing_homePackage.DIABETES__INSULIN_INJECTED:
				return insulinInjected != INSULIN_INJECTED_EDEFAULT;
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
		result.append(" (glucoseMeasured: ");
		result.append(glucoseMeasured);
		result.append(", insulinInjected: ");
		result.append(insulinInjected);
		result.append(')');
		return result.toString();
	}

} //DiabetesImpl
