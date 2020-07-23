/**
 */
package smart_nursing_home.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import smart_nursing_home.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Smart_nursing_homeFactoryImpl extends EFactoryImpl implements Smart_nursing_homeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Smart_nursing_homeFactory init() {
		try {
			Smart_nursing_homeFactory theSmart_nursing_homeFactory = (Smart_nursing_homeFactory)EPackage.Registry.INSTANCE.getEFactory(Smart_nursing_homePackage.eNS_URI);
			if (theSmart_nursing_homeFactory != null) {
				return theSmart_nursing_homeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Smart_nursing_homeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Smart_nursing_homeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Smart_nursing_homePackage.SMART_NURSING_HOME: return createSmartNursingHome();
			case Smart_nursing_homePackage.ROOM: return createRoom();
			case Smart_nursing_homePackage.DOOR: return createDoor();
			case Smart_nursing_homePackage.WINDOW: return createWindow();
			case Smart_nursing_homePackage.HEATER: return createHeater();
			case Smart_nursing_homePackage.LIGHT: return createLight();
			case Smart_nursing_homePackage.HUMIDIFIER: return createHumidifier();
			case Smart_nursing_homePackage.BRIGHTNESS: return createBrightness();
			case Smart_nursing_homePackage.HUMIDITY: return createHumidity();
			case Smart_nursing_homePackage.TEMPERATURE: return createTemperature();
			case Smart_nursing_homePackage.CARE_WORKER: return createCareWorker();
			case Smart_nursing_homePackage.ELDER: return createElder();
			case Smart_nursing_homePackage.DIABETES: return createDiabetes();
			case Smart_nursing_homePackage.HEART_ATTACK: return createHeartAttack();
			case Smart_nursing_homePackage.MEDICINE: return createMedicine();
			case Smart_nursing_homePackage.CHECKING_ROOM: return createCheckingRoom();
			case Smart_nursing_homePackage.BATHING_ROOM: return createBathingRoom();
			case Smart_nursing_homePackage.PHARMACY: return createPharmacy();
			case Smart_nursing_homePackage.ROOMBA: return createRoomba();
			case Smart_nursing_homePackage.CLEANNESS: return createCleanness();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SmartNursingHome createSmartNursingHome() {
		SmartNursingHomeImpl smartNursingHome = new SmartNursingHomeImpl();
		return smartNursingHome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Door createDoor() {
		DoorImpl door = new DoorImpl();
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Window createWindow() {
		WindowImpl window = new WindowImpl();
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Heater createHeater() {
		HeaterImpl heater = new HeaterImpl();
		return heater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Light createLight() {
		LightImpl light = new LightImpl();
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Humidifier createHumidifier() {
		HumidifierImpl humidifier = new HumidifierImpl();
		return humidifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Brightness createBrightness() {
		BrightnessImpl brightness = new BrightnessImpl();
		return brightness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Humidity createHumidity() {
		HumidityImpl humidity = new HumidityImpl();
		return humidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temperature createTemperature() {
		TemperatureImpl temperature = new TemperatureImpl();
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CareWorker createCareWorker() {
		CareWorkerImpl careWorker = new CareWorkerImpl();
		return careWorker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Elder createElder() {
		ElderImpl elder = new ElderImpl();
		return elder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Diabetes createDiabetes() {
		DiabetesImpl diabetes = new DiabetesImpl();
		return diabetes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeartAttack createHeartAttack() {
		HeartAttackImpl heartAttack = new HeartAttackImpl();
		return heartAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Medicine createMedicine() {
		MedicineImpl medicine = new MedicineImpl();
		return medicine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckingRoom createCheckingRoom() {
		CheckingRoomImpl checkingRoom = new CheckingRoomImpl();
		return checkingRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BathingRoom createBathingRoom() {
		BathingRoomImpl bathingRoom = new BathingRoomImpl();
		return bathingRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pharmacy createPharmacy() {
		PharmacyImpl pharmacy = new PharmacyImpl();
		return pharmacy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Roomba createRoomba() {
		RoombaImpl roomba = new RoombaImpl();
		return roomba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cleanness createCleanness() {
		CleannessImpl cleanness = new CleannessImpl();
		return cleanness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Smart_nursing_homePackage getSmart_nursing_homePackage() {
		return (Smart_nursing_homePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Smart_nursing_homePackage getPackage() {
		return Smart_nursing_homePackage.eINSTANCE;
	}

} //Smart_nursing_homeFactoryImpl
