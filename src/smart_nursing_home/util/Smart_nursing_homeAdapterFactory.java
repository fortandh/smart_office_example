/**
 */
package smart_nursing_home.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import smart_nursing_home.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see smart_nursing_home.Smart_nursing_homePackage
 * @generated
 */
public class Smart_nursing_homeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Smart_nursing_homePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Smart_nursing_homeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Smart_nursing_homePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Smart_nursing_homeSwitch<Adapter> modelSwitch =
		new Smart_nursing_homeSwitch<Adapter>() {
			@Override
			public Adapter caseSmartNursingHome(SmartNursingHome object) {
				return createSmartNursingHomeAdapter();
			}
			@Override
			public Adapter caseClazz(Clazz object) {
				return createClazzAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseDoor(Door object) {
				return createDoorAdapter();
			}
			@Override
			public Adapter caseWindow(Window object) {
				return createWindowAdapter();
			}
			@Override
			public Adapter caseHeater(Heater object) {
				return createHeaterAdapter();
			}
			@Override
			public Adapter caseLight(Light object) {
				return createLightAdapter();
			}
			@Override
			public Adapter caseHumidifier(Humidifier object) {
				return createHumidifierAdapter();
			}
			@Override
			public Adapter caseBrightness(Brightness object) {
				return createBrightnessAdapter();
			}
			@Override
			public Adapter caseHumidity(Humidity object) {
				return createHumidityAdapter();
			}
			@Override
			public Adapter caseTemperature(Temperature object) {
				return createTemperatureAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseCareWorker(CareWorker object) {
				return createCareWorkerAdapter();
			}
			@Override
			public Adapter caseElder(Elder object) {
				return createElderAdapter();
			}
			@Override
			public Adapter caseDisease(Disease object) {
				return createDiseaseAdapter();
			}
			@Override
			public Adapter caseDiabetes(Diabetes object) {
				return createDiabetesAdapter();
			}
			@Override
			public Adapter caseHeartAttack(HeartAttack object) {
				return createHeartAttackAdapter();
			}
			@Override
			public Adapter caseMedicine(Medicine object) {
				return createMedicineAdapter();
			}
			@Override
			public Adapter caseCheckingRoom(CheckingRoom object) {
				return createCheckingRoomAdapter();
			}
			@Override
			public Adapter caseBathingRoom(BathingRoom object) {
				return createBathingRoomAdapter();
			}
			@Override
			public Adapter casePharmacy(Pharmacy object) {
				return createPharmacyAdapter();
			}
			@Override
			public Adapter caseRoomba(Roomba object) {
				return createRoombaAdapter();
			}
			@Override
			public Adapter caseCleanness(Cleanness object) {
				return createCleannessAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.SmartNursingHome <em>Smart Nursing Home</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.SmartNursingHome
	 * @generated
	 */
	public Adapter createSmartNursingHomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Clazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Clazz
	 * @generated
	 */
	public Adapter createClazzAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Door
	 * @generated
	 */
	public Adapter createDoorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Window
	 * @generated
	 */
	public Adapter createWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Heater <em>Heater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Heater
	 * @generated
	 */
	public Adapter createHeaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Light
	 * @generated
	 */
	public Adapter createLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Humidifier <em>Humidifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Humidifier
	 * @generated
	 */
	public Adapter createHumidifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Brightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Brightness
	 * @generated
	 */
	public Adapter createBrightnessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Humidity <em>Humidity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Humidity
	 * @generated
	 */
	public Adapter createHumidityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Temperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Temperature
	 * @generated
	 */
	public Adapter createTemperatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.CareWorker <em>Care Worker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.CareWorker
	 * @generated
	 */
	public Adapter createCareWorkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Elder <em>Elder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Elder
	 * @generated
	 */
	public Adapter createElderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Disease <em>Disease</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Disease
	 * @generated
	 */
	public Adapter createDiseaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Diabetes <em>Diabetes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Diabetes
	 * @generated
	 */
	public Adapter createDiabetesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.HeartAttack <em>Heart Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.HeartAttack
	 * @generated
	 */
	public Adapter createHeartAttackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Medicine <em>Medicine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Medicine
	 * @generated
	 */
	public Adapter createMedicineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.CheckingRoom <em>Checking Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.CheckingRoom
	 * @generated
	 */
	public Adapter createCheckingRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.BathingRoom <em>Bathing Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.BathingRoom
	 * @generated
	 */
	public Adapter createBathingRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Pharmacy <em>Pharmacy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Pharmacy
	 * @generated
	 */
	public Adapter createPharmacyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Roomba <em>Roomba</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Roomba
	 * @generated
	 */
	public Adapter createRoombaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smart_nursing_home.Cleanness <em>Cleanness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smart_nursing_home.Cleanness
	 * @generated
	 */
	public Adapter createCleannessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Smart_nursing_homeAdapterFactory
