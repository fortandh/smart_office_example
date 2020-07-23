/**
 */
package smart_nursing_home;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see smart_nursing_home.Smart_nursing_homeFactory
 * @model kind="package"
 * @generated
 */
public interface Smart_nursing_homePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smart_nursing_home";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://momot.big.tuwien.ac.at/smart_nursing_home/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smart_nursing_home";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Smart_nursing_homePackage eINSTANCE = smart_nursing_home.impl.Smart_nursing_homePackageImpl.init();

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.SmartNursingHomeImpl <em>Smart Nursing Home</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.SmartNursingHomeImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getSmartNursingHome()
	 * @generated
	 */
	int SMART_NURSING_HOME = 0;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_NURSING_HOME__CLAZZ = 0;

	/**
	 * The number of structural features of the '<em>Smart Nursing Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_NURSING_HOME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Smart Nursing Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_NURSING_HOME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.ClazzImpl <em>Clazz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.ClazzImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getClazz()
	 * @generated
	 */
	int CLAZZ = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__NAME = 0;

	/**
	 * The number of structural features of the '<em>Clazz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Clazz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.RoomImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = CLAZZ__NAME;

	/**
	 * The feature id for the '<em><b>Door</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DOOR = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__WINDOW = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Light</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__LIGHT = CLAZZ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Heater</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__HEATER = CLAZZ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Humidifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__HUMIDIFIER = CLAZZ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__BRIGHTNESS = CLAZZ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Humidity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__HUMIDITY = CLAZZ_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__TEMPERATURE = CLAZZ_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__PERSON = CLAZZ_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Roomba</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOMBA = CLAZZ_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cleanness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CLEANNESS = CLAZZ_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.DoorImpl <em>Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.DoorImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getDoor()
	 * @generated
	 */
	int DOOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__NAME = CLAZZ__NAME;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__ROOM = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.WindowImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__NAME = CLAZZ__NAME;

	/**
	 * The feature id for the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ON = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.HeaterImpl <em>Heater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.HeaterImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getHeater()
	 * @generated
	 */
	int HEATER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATER__NAME = CLAZZ__NAME;

	/**
	 * The feature id for the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATER__ON = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Heater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATER_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Heater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATER_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.LightImpl <em>Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.LightImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getLight()
	 * @generated
	 */
	int LIGHT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__NAME = CLAZZ__NAME;

	/**
	 * The feature id for the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__ON = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.HumidifierImpl <em>Humidifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.HumidifierImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getHumidifier()
	 * @generated
	 */
	int HUMIDIFIER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDIFIER__NAME = CLAZZ__NAME;

	/**
	 * The feature id for the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDIFIER__ON = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Humidifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDIFIER_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Humidifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDIFIER_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.BrightnessImpl <em>Brightness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.BrightnessImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getBrightness()
	 * @generated
	 */
	int BRIGHTNESS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIGHTNESS__NAME = CLAZZ__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIGHTNESS__VALUE = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Brightness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIGHTNESS_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Brightness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIGHTNESS_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.HumidityImpl <em>Humidity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.HumidityImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getHumidity()
	 * @generated
	 */
	int HUMIDITY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY__NAME = CLAZZ__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY__VALUE = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Humidity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Humidity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.TemperatureImpl <em>Temperature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.TemperatureImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getTemperature()
	 * @generated
	 */
	int TEMPERATURE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE__NAME = CLAZZ__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE__VALUE = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Temperature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.PersonImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = CLAZZ__NAME;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ROOM = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Medicine</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MEDICINE = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.CareWorkerImpl <em>Care Worker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.CareWorkerImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getCareWorker()
	 * @generated
	 */
	int CARE_WORKER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_WORKER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_WORKER__ROOM = PERSON__ROOM;

	/**
	 * The feature id for the '<em><b>Medicine</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_WORKER__MEDICINE = PERSON__MEDICINE;

	/**
	 * The number of structural features of the '<em>Care Worker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_WORKER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Care Worker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_WORKER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.ElderImpl <em>Elder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.ElderImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getElder()
	 * @generated
	 */
	int ELDER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELDER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELDER__ROOM = PERSON__ROOM;

	/**
	 * The feature id for the '<em><b>Medicine</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELDER__MEDICINE = PERSON__MEDICINE;

	/**
	 * The feature id for the '<em><b>By Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELDER__BY_SELF = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tidy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELDER__TIDY = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temperature Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELDER__TEMPERATURE_CHECK = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Blood Oxygen Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELDER__BLOOD_OXYGEN_CHECK = PERSON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disease</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELDER__DISEASE = PERSON_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Elder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELDER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Elder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELDER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.DiseaseImpl <em>Disease</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.DiseaseImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getDisease()
	 * @generated
	 */
	int DISEASE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE__NAME = CLAZZ__NAME;

	/**
	 * The number of structural features of the '<em>Disease</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disease</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.DiabetesImpl <em>Diabetes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.DiabetesImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getDiabetes()
	 * @generated
	 */
	int DIABETES = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETES__NAME = DISEASE__NAME;

	/**
	 * The feature id for the '<em><b>Glucose Measured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETES__GLUCOSE_MEASURED = DISEASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Insulin Injected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETES__INSULIN_INJECTED = DISEASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diabetes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETES_FEATURE_COUNT = DISEASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diabetes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIABETES_OPERATION_COUNT = DISEASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.HeartAttackImpl <em>Heart Attack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.HeartAttackImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getHeartAttack()
	 * @generated
	 */
	int HEART_ATTACK = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_ATTACK__NAME = DISEASE__NAME;

	/**
	 * The feature id for the '<em><b>Heart Rate Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_ATTACK__HEART_RATE_CHECK = DISEASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aspirin Taken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_ATTACK__ASPIRIN_TAKEN = DISEASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Heart Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_ATTACK_FEATURE_COUNT = DISEASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Heart Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEART_ATTACK_OPERATION_COUNT = DISEASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.MedicineImpl <em>Medicine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.MedicineImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getMedicine()
	 * @generated
	 */
	int MEDICINE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINE__NAME = CLAZZ__NAME;

	/**
	 * The number of structural features of the '<em>Medicine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINE_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Medicine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINE_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.CheckingRoomImpl <em>Checking Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.CheckingRoomImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getCheckingRoom()
	 * @generated
	 */
	int CHECKING_ROOM = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKING_ROOM__NAME = ROOM__NAME;

	/**
	 * The feature id for the '<em><b>Door</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKING_ROOM__DOOR = ROOM__DOOR;

	/**
	 * The feature id for the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKING_ROOM__WINDOW = ROOM__WINDOW;

	/**
	 * The feature id for the '<em><b>Light</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKING_ROOM__LIGHT = ROOM__LIGHT;

	/**
	 * The feature id for the '<em><b>Heater</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKING_ROOM__HEATER = ROOM__HEATER;

	/**
	 * The feature id for the '<em><b>Humidifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKING_ROOM__HUMIDIFIER = ROOM__HUMIDIFIER;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKING_ROOM__BRIGHTNESS = ROOM__BRIGHTNESS;

	/**
	 * The feature id for the '<em><b>Humidity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKING_ROOM__HUMIDITY = ROOM__HUMIDITY;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKING_ROOM__TEMPERATURE = ROOM__TEMPERATURE;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKING_ROOM__PERSON = ROOM__PERSON;

	/**
	 * The feature id for the '<em><b>Roomba</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKING_ROOM__ROOMBA = ROOM__ROOMBA;

	/**
	 * The feature id for the '<em><b>Cleanness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKING_ROOM__CLEANNESS = ROOM__CLEANNESS;

	/**
	 * The number of structural features of the '<em>Checking Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKING_ROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Checking Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKING_ROOM_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.BathingRoomImpl <em>Bathing Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.BathingRoomImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getBathingRoom()
	 * @generated
	 */
	int BATHING_ROOM = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHING_ROOM__NAME = ROOM__NAME;

	/**
	 * The feature id for the '<em><b>Door</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHING_ROOM__DOOR = ROOM__DOOR;

	/**
	 * The feature id for the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHING_ROOM__WINDOW = ROOM__WINDOW;

	/**
	 * The feature id for the '<em><b>Light</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHING_ROOM__LIGHT = ROOM__LIGHT;

	/**
	 * The feature id for the '<em><b>Heater</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHING_ROOM__HEATER = ROOM__HEATER;

	/**
	 * The feature id for the '<em><b>Humidifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHING_ROOM__HUMIDIFIER = ROOM__HUMIDIFIER;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHING_ROOM__BRIGHTNESS = ROOM__BRIGHTNESS;

	/**
	 * The feature id for the '<em><b>Humidity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHING_ROOM__HUMIDITY = ROOM__HUMIDITY;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHING_ROOM__TEMPERATURE = ROOM__TEMPERATURE;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHING_ROOM__PERSON = ROOM__PERSON;

	/**
	 * The feature id for the '<em><b>Roomba</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHING_ROOM__ROOMBA = ROOM__ROOMBA;

	/**
	 * The feature id for the '<em><b>Cleanness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHING_ROOM__CLEANNESS = ROOM__CLEANNESS;

	/**
	 * The number of structural features of the '<em>Bathing Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHING_ROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bathing Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATHING_ROOM_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.PharmacyImpl <em>Pharmacy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.PharmacyImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getPharmacy()
	 * @generated
	 */
	int PHARMACY = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY__NAME = ROOM__NAME;

	/**
	 * The feature id for the '<em><b>Door</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY__DOOR = ROOM__DOOR;

	/**
	 * The feature id for the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY__WINDOW = ROOM__WINDOW;

	/**
	 * The feature id for the '<em><b>Light</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY__LIGHT = ROOM__LIGHT;

	/**
	 * The feature id for the '<em><b>Heater</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY__HEATER = ROOM__HEATER;

	/**
	 * The feature id for the '<em><b>Humidifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY__HUMIDIFIER = ROOM__HUMIDIFIER;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY__BRIGHTNESS = ROOM__BRIGHTNESS;

	/**
	 * The feature id for the '<em><b>Humidity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY__HUMIDITY = ROOM__HUMIDITY;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY__TEMPERATURE = ROOM__TEMPERATURE;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY__PERSON = ROOM__PERSON;

	/**
	 * The feature id for the '<em><b>Roomba</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY__ROOMBA = ROOM__ROOMBA;

	/**
	 * The feature id for the '<em><b>Cleanness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY__CLEANNESS = ROOM__CLEANNESS;

	/**
	 * The number of structural features of the '<em>Pharmacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY_FEATURE_COUNT = ROOM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pharmacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.RoombaImpl <em>Roomba</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.RoombaImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getRoomba()
	 * @generated
	 */
	int ROOMBA = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOMBA__NAME = CLAZZ__NAME;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOMBA__ROOM = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Roomba</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOMBA_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Roomba</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOMBA_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link smart_nursing_home.impl.CleannessImpl <em>Cleanness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_nursing_home.impl.CleannessImpl
	 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getCleanness()
	 * @generated
	 */
	int CLEANNESS = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANNESS__NAME = CLAZZ__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANNESS__VALUE = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cleanness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANNESS_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cleanness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANNESS_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link smart_nursing_home.SmartNursingHome <em>Smart Nursing Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Nursing Home</em>'.
	 * @see smart_nursing_home.SmartNursingHome
	 * @generated
	 */
	EClass getSmartNursingHome();

	/**
	 * Returns the meta object for the containment reference list '{@link smart_nursing_home.SmartNursingHome#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clazz</em>'.
	 * @see smart_nursing_home.SmartNursingHome#getClazz()
	 * @see #getSmartNursingHome()
	 * @generated
	 */
	EReference getSmartNursingHome_Clazz();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Clazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clazz</em>'.
	 * @see smart_nursing_home.Clazz
	 * @generated
	 */
	EClass getClazz();

	/**
	 * Returns the meta object for the attribute '{@link smart_nursing_home.Clazz#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smart_nursing_home.Clazz#getName()
	 * @see #getClazz()
	 * @generated
	 */
	EAttribute getClazz_Name();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see smart_nursing_home.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the reference '{@link smart_nursing_home.Room#getWindow <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Window</em>'.
	 * @see smart_nursing_home.Room#getWindow()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Window();

	/**
	 * Returns the meta object for the reference '{@link smart_nursing_home.Room#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Light</em>'.
	 * @see smart_nursing_home.Room#getLight()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Light();

	/**
	 * Returns the meta object for the reference '{@link smart_nursing_home.Room#getHumidifier <em>Humidifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Humidifier</em>'.
	 * @see smart_nursing_home.Room#getHumidifier()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Humidifier();

	/**
	 * Returns the meta object for the reference '{@link smart_nursing_home.Room#getHeater <em>Heater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Heater</em>'.
	 * @see smart_nursing_home.Room#getHeater()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Heater();

	/**
	 * Returns the meta object for the reference '{@link smart_nursing_home.Room#getBrightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Brightness</em>'.
	 * @see smart_nursing_home.Room#getBrightness()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Brightness();

	/**
	 * Returns the meta object for the reference '{@link smart_nursing_home.Room#getHumidity <em>Humidity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Humidity</em>'.
	 * @see smart_nursing_home.Room#getHumidity()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Humidity();

	/**
	 * Returns the meta object for the reference '{@link smart_nursing_home.Room#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Temperature</em>'.
	 * @see smart_nursing_home.Room#getTemperature()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Temperature();

	/**
	 * Returns the meta object for the reference list '{@link smart_nursing_home.Room#getDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Door</em>'.
	 * @see smart_nursing_home.Room#getDoor()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Door();

	/**
	 * Returns the meta object for the reference list '{@link smart_nursing_home.Room#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Person</em>'.
	 * @see smart_nursing_home.Room#getPerson()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Person();

	/**
	 * Returns the meta object for the reference list '{@link smart_nursing_home.Room#getRoomba <em>Roomba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roomba</em>'.
	 * @see smart_nursing_home.Room#getRoomba()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Roomba();

	/**
	 * Returns the meta object for the reference '{@link smart_nursing_home.Room#getCleanness <em>Cleanness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cleanness</em>'.
	 * @see smart_nursing_home.Room#getCleanness()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Cleanness();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door</em>'.
	 * @see smart_nursing_home.Door
	 * @generated
	 */
	EClass getDoor();

	/**
	 * Returns the meta object for the reference list '{@link smart_nursing_home.Door#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room</em>'.
	 * @see smart_nursing_home.Door#getRoom()
	 * @see #getDoor()
	 * @generated
	 */
	EReference getDoor_Room();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see smart_nursing_home.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for the attribute '{@link smart_nursing_home.Window#isOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see smart_nursing_home.Window#isOn()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_On();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Heater <em>Heater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heater</em>'.
	 * @see smart_nursing_home.Heater
	 * @generated
	 */
	EClass getHeater();

	/**
	 * Returns the meta object for the attribute '{@link smart_nursing_home.Heater#isOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see smart_nursing_home.Heater#isOn()
	 * @see #getHeater()
	 * @generated
	 */
	EAttribute getHeater_On();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light</em>'.
	 * @see smart_nursing_home.Light
	 * @generated
	 */
	EClass getLight();

	/**
	 * Returns the meta object for the attribute '{@link smart_nursing_home.Light#isOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see smart_nursing_home.Light#isOn()
	 * @see #getLight()
	 * @generated
	 */
	EAttribute getLight_On();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Humidifier <em>Humidifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Humidifier</em>'.
	 * @see smart_nursing_home.Humidifier
	 * @generated
	 */
	EClass getHumidifier();

	/**
	 * Returns the meta object for the attribute '{@link smart_nursing_home.Humidifier#isOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see smart_nursing_home.Humidifier#isOn()
	 * @see #getHumidifier()
	 * @generated
	 */
	EAttribute getHumidifier_On();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Brightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brightness</em>'.
	 * @see smart_nursing_home.Brightness
	 * @generated
	 */
	EClass getBrightness();

	/**
	 * Returns the meta object for the attribute '{@link smart_nursing_home.Brightness#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see smart_nursing_home.Brightness#getValue()
	 * @see #getBrightness()
	 * @generated
	 */
	EAttribute getBrightness_Value();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Humidity <em>Humidity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Humidity</em>'.
	 * @see smart_nursing_home.Humidity
	 * @generated
	 */
	EClass getHumidity();

	/**
	 * Returns the meta object for the attribute '{@link smart_nursing_home.Humidity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see smart_nursing_home.Humidity#getValue()
	 * @see #getHumidity()
	 * @generated
	 */
	EAttribute getHumidity_Value();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Temperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperature</em>'.
	 * @see smart_nursing_home.Temperature
	 * @generated
	 */
	EClass getTemperature();

	/**
	 * Returns the meta object for the attribute '{@link smart_nursing_home.Temperature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see smart_nursing_home.Temperature#getValue()
	 * @see #getTemperature()
	 * @generated
	 */
	EAttribute getTemperature_Value();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see smart_nursing_home.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the reference list '{@link smart_nursing_home.Person#getMedicine <em>Medicine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Medicine</em>'.
	 * @see smart_nursing_home.Person#getMedicine()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Medicine();

	/**
	 * Returns the meta object for the reference '{@link smart_nursing_home.Person#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see smart_nursing_home.Person#getRoom()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Room();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.CareWorker <em>Care Worker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Care Worker</em>'.
	 * @see smart_nursing_home.CareWorker
	 * @generated
	 */
	EClass getCareWorker();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Elder <em>Elder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elder</em>'.
	 * @see smart_nursing_home.Elder
	 * @generated
	 */
	EClass getElder();

	/**
	 * Returns the meta object for the attribute '{@link smart_nursing_home.Elder#isBySelf <em>By Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Self</em>'.
	 * @see smart_nursing_home.Elder#isBySelf()
	 * @see #getElder()
	 * @generated
	 */
	EAttribute getElder_BySelf();

	/**
	 * Returns the meta object for the attribute '{@link smart_nursing_home.Elder#isTidy <em>Tidy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tidy</em>'.
	 * @see smart_nursing_home.Elder#isTidy()
	 * @see #getElder()
	 * @generated
	 */
	EAttribute getElder_Tidy();

	/**
	 * Returns the meta object for the attribute '{@link smart_nursing_home.Elder#isTemperatureCheck <em>Temperature Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature Check</em>'.
	 * @see smart_nursing_home.Elder#isTemperatureCheck()
	 * @see #getElder()
	 * @generated
	 */
	EAttribute getElder_TemperatureCheck();

	/**
	 * Returns the meta object for the attribute '{@link smart_nursing_home.Elder#isBloodOxygenCheck <em>Blood Oxygen Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blood Oxygen Check</em>'.
	 * @see smart_nursing_home.Elder#isBloodOxygenCheck()
	 * @see #getElder()
	 * @generated
	 */
	EAttribute getElder_BloodOxygenCheck();

	/**
	 * Returns the meta object for the reference list '{@link smart_nursing_home.Elder#getDisease <em>Disease</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disease</em>'.
	 * @see smart_nursing_home.Elder#getDisease()
	 * @see #getElder()
	 * @generated
	 */
	EReference getElder_Disease();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Disease <em>Disease</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease</em>'.
	 * @see smart_nursing_home.Disease
	 * @generated
	 */
	EClass getDisease();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Diabetes <em>Diabetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diabetes</em>'.
	 * @see smart_nursing_home.Diabetes
	 * @generated
	 */
	EClass getDiabetes();

	/**
	 * Returns the meta object for the attribute '{@link smart_nursing_home.Diabetes#isGlucoseMeasured <em>Glucose Measured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glucose Measured</em>'.
	 * @see smart_nursing_home.Diabetes#isGlucoseMeasured()
	 * @see #getDiabetes()
	 * @generated
	 */
	EAttribute getDiabetes_GlucoseMeasured();

	/**
	 * Returns the meta object for the attribute '{@link smart_nursing_home.Diabetes#isInsulinInjected <em>Insulin Injected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulin Injected</em>'.
	 * @see smart_nursing_home.Diabetes#isInsulinInjected()
	 * @see #getDiabetes()
	 * @generated
	 */
	EAttribute getDiabetes_InsulinInjected();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.HeartAttack <em>Heart Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heart Attack</em>'.
	 * @see smart_nursing_home.HeartAttack
	 * @generated
	 */
	EClass getHeartAttack();

	/**
	 * Returns the meta object for the attribute '{@link smart_nursing_home.HeartAttack#isHeartRateCheck <em>Heart Rate Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heart Rate Check</em>'.
	 * @see smart_nursing_home.HeartAttack#isHeartRateCheck()
	 * @see #getHeartAttack()
	 * @generated
	 */
	EAttribute getHeartAttack_HeartRateCheck();

	/**
	 * Returns the meta object for the attribute '{@link smart_nursing_home.HeartAttack#isAspirinTaken <em>Aspirin Taken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspirin Taken</em>'.
	 * @see smart_nursing_home.HeartAttack#isAspirinTaken()
	 * @see #getHeartAttack()
	 * @generated
	 */
	EAttribute getHeartAttack_AspirinTaken();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Medicine <em>Medicine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medicine</em>'.
	 * @see smart_nursing_home.Medicine
	 * @generated
	 */
	EClass getMedicine();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.CheckingRoom <em>Checking Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checking Room</em>'.
	 * @see smart_nursing_home.CheckingRoom
	 * @generated
	 */
	EClass getCheckingRoom();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.BathingRoom <em>Bathing Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bathing Room</em>'.
	 * @see smart_nursing_home.BathingRoom
	 * @generated
	 */
	EClass getBathingRoom();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Pharmacy <em>Pharmacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pharmacy</em>'.
	 * @see smart_nursing_home.Pharmacy
	 * @generated
	 */
	EClass getPharmacy();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Roomba <em>Roomba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roomba</em>'.
	 * @see smart_nursing_home.Roomba
	 * @generated
	 */
	EClass getRoomba();

	/**
	 * Returns the meta object for the reference '{@link smart_nursing_home.Roomba#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see smart_nursing_home.Roomba#getRoom()
	 * @see #getRoomba()
	 * @generated
	 */
	EReference getRoomba_Room();

	/**
	 * Returns the meta object for class '{@link smart_nursing_home.Cleanness <em>Cleanness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cleanness</em>'.
	 * @see smart_nursing_home.Cleanness
	 * @generated
	 */
	EClass getCleanness();

	/**
	 * Returns the meta object for the attribute '{@link smart_nursing_home.Cleanness#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see smart_nursing_home.Cleanness#getValue()
	 * @see #getCleanness()
	 * @generated
	 */
	EAttribute getCleanness_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Smart_nursing_homeFactory getSmart_nursing_homeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.SmartNursingHomeImpl <em>Smart Nursing Home</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.SmartNursingHomeImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getSmartNursingHome()
		 * @generated
		 */
		EClass SMART_NURSING_HOME = eINSTANCE.getSmartNursingHome();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_NURSING_HOME__CLAZZ = eINSTANCE.getSmartNursingHome_Clazz();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.ClazzImpl <em>Clazz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.ClazzImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getClazz()
		 * @generated
		 */
		EClass CLAZZ = eINSTANCE.getClazz();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAZZ__NAME = eINSTANCE.getClazz_Name();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.RoomImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Window</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__WINDOW = eINSTANCE.getRoom_Window();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__LIGHT = eINSTANCE.getRoom_Light();

		/**
		 * The meta object literal for the '<em><b>Humidifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__HUMIDIFIER = eINSTANCE.getRoom_Humidifier();

		/**
		 * The meta object literal for the '<em><b>Heater</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__HEATER = eINSTANCE.getRoom_Heater();

		/**
		 * The meta object literal for the '<em><b>Brightness</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__BRIGHTNESS = eINSTANCE.getRoom_Brightness();

		/**
		 * The meta object literal for the '<em><b>Humidity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__HUMIDITY = eINSTANCE.getRoom_Humidity();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__TEMPERATURE = eINSTANCE.getRoom_Temperature();

		/**
		 * The meta object literal for the '<em><b>Door</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__DOOR = eINSTANCE.getRoom_Door();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__PERSON = eINSTANCE.getRoom_Person();

		/**
		 * The meta object literal for the '<em><b>Roomba</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOMBA = eINSTANCE.getRoom_Roomba();

		/**
		 * The meta object literal for the '<em><b>Cleanness</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__CLEANNESS = eINSTANCE.getRoom_Cleanness();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.DoorImpl <em>Door</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.DoorImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getDoor()
		 * @generated
		 */
		EClass DOOR = eINSTANCE.getDoor();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR__ROOM = eINSTANCE.getDoor_Room();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.WindowImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getWindow()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWindow();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__ON = eINSTANCE.getWindow_On();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.HeaterImpl <em>Heater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.HeaterImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getHeater()
		 * @generated
		 */
		EClass HEATER = eINSTANCE.getHeater();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEATER__ON = eINSTANCE.getHeater_On();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.LightImpl <em>Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.LightImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getLight()
		 * @generated
		 */
		EClass LIGHT = eINSTANCE.getLight();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT__ON = eINSTANCE.getLight_On();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.HumidifierImpl <em>Humidifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.HumidifierImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getHumidifier()
		 * @generated
		 */
		EClass HUMIDIFIER = eINSTANCE.getHumidifier();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMIDIFIER__ON = eINSTANCE.getHumidifier_On();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.BrightnessImpl <em>Brightness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.BrightnessImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getBrightness()
		 * @generated
		 */
		EClass BRIGHTNESS = eINSTANCE.getBrightness();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRIGHTNESS__VALUE = eINSTANCE.getBrightness_Value();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.HumidityImpl <em>Humidity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.HumidityImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getHumidity()
		 * @generated
		 */
		EClass HUMIDITY = eINSTANCE.getHumidity();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUMIDITY__VALUE = eINSTANCE.getHumidity_Value();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.TemperatureImpl <em>Temperature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.TemperatureImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getTemperature()
		 * @generated
		 */
		EClass TEMPERATURE = eINSTANCE.getTemperature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPERATURE__VALUE = eINSTANCE.getTemperature_Value();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.PersonImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Medicine</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__MEDICINE = eINSTANCE.getPerson_Medicine();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ROOM = eINSTANCE.getPerson_Room();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.CareWorkerImpl <em>Care Worker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.CareWorkerImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getCareWorker()
		 * @generated
		 */
		EClass CARE_WORKER = eINSTANCE.getCareWorker();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.ElderImpl <em>Elder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.ElderImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getElder()
		 * @generated
		 */
		EClass ELDER = eINSTANCE.getElder();

		/**
		 * The meta object literal for the '<em><b>By Self</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELDER__BY_SELF = eINSTANCE.getElder_BySelf();

		/**
		 * The meta object literal for the '<em><b>Tidy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELDER__TIDY = eINSTANCE.getElder_Tidy();

		/**
		 * The meta object literal for the '<em><b>Temperature Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELDER__TEMPERATURE_CHECK = eINSTANCE.getElder_TemperatureCheck();

		/**
		 * The meta object literal for the '<em><b>Blood Oxygen Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELDER__BLOOD_OXYGEN_CHECK = eINSTANCE.getElder_BloodOxygenCheck();

		/**
		 * The meta object literal for the '<em><b>Disease</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELDER__DISEASE = eINSTANCE.getElder_Disease();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.DiseaseImpl <em>Disease</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.DiseaseImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getDisease()
		 * @generated
		 */
		EClass DISEASE = eINSTANCE.getDisease();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.DiabetesImpl <em>Diabetes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.DiabetesImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getDiabetes()
		 * @generated
		 */
		EClass DIABETES = eINSTANCE.getDiabetes();

		/**
		 * The meta object literal for the '<em><b>Glucose Measured</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIABETES__GLUCOSE_MEASURED = eINSTANCE.getDiabetes_GlucoseMeasured();

		/**
		 * The meta object literal for the '<em><b>Insulin Injected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIABETES__INSULIN_INJECTED = eINSTANCE.getDiabetes_InsulinInjected();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.HeartAttackImpl <em>Heart Attack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.HeartAttackImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getHeartAttack()
		 * @generated
		 */
		EClass HEART_ATTACK = eINSTANCE.getHeartAttack();

		/**
		 * The meta object literal for the '<em><b>Heart Rate Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEART_ATTACK__HEART_RATE_CHECK = eINSTANCE.getHeartAttack_HeartRateCheck();

		/**
		 * The meta object literal for the '<em><b>Aspirin Taken</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEART_ATTACK__ASPIRIN_TAKEN = eINSTANCE.getHeartAttack_AspirinTaken();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.MedicineImpl <em>Medicine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.MedicineImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getMedicine()
		 * @generated
		 */
		EClass MEDICINE = eINSTANCE.getMedicine();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.CheckingRoomImpl <em>Checking Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.CheckingRoomImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getCheckingRoom()
		 * @generated
		 */
		EClass CHECKING_ROOM = eINSTANCE.getCheckingRoom();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.BathingRoomImpl <em>Bathing Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.BathingRoomImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getBathingRoom()
		 * @generated
		 */
		EClass BATHING_ROOM = eINSTANCE.getBathingRoom();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.PharmacyImpl <em>Pharmacy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.PharmacyImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getPharmacy()
		 * @generated
		 */
		EClass PHARMACY = eINSTANCE.getPharmacy();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.RoombaImpl <em>Roomba</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.RoombaImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getRoomba()
		 * @generated
		 */
		EClass ROOMBA = eINSTANCE.getRoomba();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOMBA__ROOM = eINSTANCE.getRoomba_Room();

		/**
		 * The meta object literal for the '{@link smart_nursing_home.impl.CleannessImpl <em>Cleanness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_nursing_home.impl.CleannessImpl
		 * @see smart_nursing_home.impl.Smart_nursing_homePackageImpl#getCleanness()
		 * @generated
		 */
		EClass CLEANNESS = eINSTANCE.getCleanness();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEANNESS__VALUE = eINSTANCE.getCleanness_Value();

	}

} //Smart_nursing_homePackage
