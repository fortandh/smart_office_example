/**
 */
package smart_nursing_home.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smart_nursing_home.Clazz;
import smart_nursing_home.SmartNursingHome;
import smart_nursing_home.Smart_nursing_homePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart Nursing Home</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smart_nursing_home.impl.SmartNursingHomeImpl#getClazz <em>Clazz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartNursingHomeImpl extends MinimalEObjectImpl.Container implements SmartNursingHome {
	/**
	 * The cached value of the '{@link #getClazz() <em>Clazz</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected EList<Clazz> clazz;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartNursingHomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Smart_nursing_homePackage.Literals.SMART_NURSING_HOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Clazz> getClazz() {
		if (clazz == null) {
			clazz = new EObjectContainmentEList<Clazz>(Clazz.class, this, Smart_nursing_homePackage.SMART_NURSING_HOME__CLAZZ);
		}
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Smart_nursing_homePackage.SMART_NURSING_HOME__CLAZZ:
				return ((InternalEList<?>)getClazz()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Smart_nursing_homePackage.SMART_NURSING_HOME__CLAZZ:
				return getClazz();
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
			case Smart_nursing_homePackage.SMART_NURSING_HOME__CLAZZ:
				getClazz().clear();
				getClazz().addAll((Collection<? extends Clazz>)newValue);
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
			case Smart_nursing_homePackage.SMART_NURSING_HOME__CLAZZ:
				getClazz().clear();
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
			case Smart_nursing_homePackage.SMART_NURSING_HOME__CLAZZ:
				return clazz != null && !clazz.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SmartNursingHomeImpl
