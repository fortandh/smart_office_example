/**
 */
package smart_office;

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
 * @see smart_office.Smart_officeFactory
 * @model kind="package"
 * @generated
 */
public interface Smart_officePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smart_office";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://momot.big.tuwien.ac.at/smart_office/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smart_office";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Smart_officePackage eINSTANCE = smart_office.impl.Smart_officePackageImpl.init();

	/**
	 * The meta object id for the '{@link smart_office.impl.SmartOfficeImpl <em>Smart Office</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_office.impl.SmartOfficeImpl
	 * @see smart_office.impl.Smart_officePackageImpl#getSmartOffice()
	 * @generated
	 */
	int SMART_OFFICE = 0;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_OFFICE__CLAZZ = 0;

	/**
	 * The number of structural features of the '<em>Smart Office</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_OFFICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Smart Office</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_OFFICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smart_office.impl.ClazzImpl <em>Clazz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_office.impl.ClazzImpl
	 * @see smart_office.impl.Smart_officePackageImpl#getClazz()
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
	 * The meta object id for the '{@link smart_office.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_office.impl.RoomImpl
	 * @see smart_office.impl.Smart_officePackageImpl#getRoom()
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
	 * The feature id for the '<em><b>Heater</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__HEATER = CLAZZ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Light</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__LIGHT = CLAZZ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Roomba</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOMBA = CLAZZ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secretary</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SECRETARY = CLAZZ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__AGENT = CLAZZ_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Printer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__PRINTER = CLAZZ_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SERVER = CLAZZ_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Brightness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__BRIGHTNESS = CLAZZ_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cleanness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CLEANNESS = CLAZZ_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__TEMPERATURE = CLAZZ_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_office.impl.DoorImpl <em>Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_office.impl.DoorImpl
	 * @see smart_office.impl.Smart_officePackageImpl#getDoor()
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
	 * The meta object id for the '{@link smart_office.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_office.impl.AgentImpl
	 * @see smart_office.impl.Smart_officePackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = CLAZZ__NAME;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ROOM = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_office.impl.HeaterImpl <em>Heater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_office.impl.HeaterImpl
	 * @see smart_office.impl.Smart_officePackageImpl#getHeater()
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
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATER__ROOM = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Heater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATER_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Heater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEATER_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_office.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_office.impl.WindowImpl
	 * @see smart_office.impl.Smart_officePackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 6;

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
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ROOM = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_office.impl.LightImpl <em>Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_office.impl.LightImpl
	 * @see smart_office.impl.Smart_officePackageImpl#getLight()
	 * @generated
	 */
	int LIGHT = 7;

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
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__ROOM = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_office.impl.SecretaryImpl <em>Secretary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_office.impl.SecretaryImpl
	 * @see smart_office.impl.Smart_officePackageImpl#getSecretary()
	 * @generated
	 */
	int SECRETARY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETARY__NAME = CLAZZ__NAME;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETARY__ROOM = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Secretary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETARY_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Secretary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETARY_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_office.impl.RoombaImpl <em>Roomba</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_office.impl.RoombaImpl
	 * @see smart_office.impl.Smart_officePackageImpl#getRoomba()
	 * @generated
	 */
	int ROOMBA = 9;

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
	 * The meta object id for the '{@link smart_office.impl.BrightnessImpl <em>Brightness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_office.impl.BrightnessImpl
	 * @see smart_office.impl.Smart_officePackageImpl#getBrightness()
	 * @generated
	 */
	int BRIGHTNESS = 10;

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
	 * The meta object id for the '{@link smart_office.impl.TemperatureImpl <em>Temperature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_office.impl.TemperatureImpl
	 * @see smart_office.impl.Smart_officePackageImpl#getTemperature()
	 * @generated
	 */
	int TEMPERATURE = 11;

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
	 * The meta object id for the '{@link smart_office.impl.CleannessImpl <em>Cleanness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_office.impl.CleannessImpl
	 * @see smart_office.impl.Smart_officePackageImpl#getCleanness()
	 * @generated
	 */
	int CLEANNESS = 12;

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
	 * The meta object id for the '{@link smart_office.impl.PrinterImpl <em>Printer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_office.impl.PrinterImpl
	 * @see smart_office.impl.Smart_officePackageImpl#getPrinter()
	 * @generated
	 */
	int PRINTER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__NAME = CLAZZ__NAME;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__ASSET = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER__ROOM = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Printer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Printer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTER_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_office.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_office.impl.AssetImpl
	 * @see smart_office.impl.Smart_officePackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = CLAZZ__NAME;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smart_office.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smart_office.impl.ServerImpl
	 * @see smart_office.impl.Smart_officePackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NAME = CLAZZ__NAME;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ROOM = CLAZZ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = CLAZZ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = CLAZZ_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link smart_office.SmartOffice <em>Smart Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Office</em>'.
	 * @see smart_office.SmartOffice
	 * @generated
	 */
	EClass getSmartOffice();

	/**
	 * Returns the meta object for the containment reference list '{@link smart_office.SmartOffice#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clazz</em>'.
	 * @see smart_office.SmartOffice#getClazz()
	 * @see #getSmartOffice()
	 * @generated
	 */
	EReference getSmartOffice_Clazz();

	/**
	 * Returns the meta object for class '{@link smart_office.Clazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clazz</em>'.
	 * @see smart_office.Clazz
	 * @generated
	 */
	EClass getClazz();

	/**
	 * Returns the meta object for the attribute '{@link smart_office.Clazz#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smart_office.Clazz#getName()
	 * @see #getClazz()
	 * @generated
	 */
	EAttribute getClazz_Name();

	/**
	 * Returns the meta object for class '{@link smart_office.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see smart_office.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the reference list '{@link smart_office.Room#getDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Door</em>'.
	 * @see smart_office.Room#getDoor()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Door();

	/**
	 * Returns the meta object for the reference '{@link smart_office.Room#getWindow <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Window</em>'.
	 * @see smart_office.Room#getWindow()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Window();

	/**
	 * Returns the meta object for the reference '{@link smart_office.Room#getHeater <em>Heater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Heater</em>'.
	 * @see smart_office.Room#getHeater()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Heater();

	/**
	 * Returns the meta object for the reference '{@link smart_office.Room#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Light</em>'.
	 * @see smart_office.Room#getLight()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Light();

	/**
	 * Returns the meta object for the reference list '{@link smart_office.Room#getRoomba <em>Roomba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roomba</em>'.
	 * @see smart_office.Room#getRoomba()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Roomba();

	/**
	 * Returns the meta object for the reference list '{@link smart_office.Room#getSecretary <em>Secretary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Secretary</em>'.
	 * @see smart_office.Room#getSecretary()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Secretary();

	/**
	 * Returns the meta object for the reference list '{@link smart_office.Room#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agent</em>'.
	 * @see smart_office.Room#getAgent()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Agent();

	/**
	 * Returns the meta object for the reference list '{@link smart_office.Room#getPrinter <em>Printer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Printer</em>'.
	 * @see smart_office.Room#getPrinter()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Printer();

	/**
	 * Returns the meta object for the reference list '{@link smart_office.Room#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Server</em>'.
	 * @see smart_office.Room#getServer()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Server();

	/**
	 * Returns the meta object for the reference '{@link smart_office.Room#getBrightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Brightness</em>'.
	 * @see smart_office.Room#getBrightness()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Brightness();

	/**
	 * Returns the meta object for the reference '{@link smart_office.Room#getCleanness <em>Cleanness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cleanness</em>'.
	 * @see smart_office.Room#getCleanness()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Cleanness();

	/**
	 * Returns the meta object for the reference '{@link smart_office.Room#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Temperature</em>'.
	 * @see smart_office.Room#getTemperature()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Temperature();

	/**
	 * Returns the meta object for class '{@link smart_office.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door</em>'.
	 * @see smart_office.Door
	 * @generated
	 */
	EClass getDoor();

	/**
	 * Returns the meta object for the reference list '{@link smart_office.Door#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room</em>'.
	 * @see smart_office.Door#getRoom()
	 * @see #getDoor()
	 * @generated
	 */
	EReference getDoor_Room();

	/**
	 * Returns the meta object for class '{@link smart_office.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see smart_office.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the reference '{@link smart_office.Agent#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see smart_office.Agent#getRoom()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Room();

	/**
	 * Returns the meta object for class '{@link smart_office.Heater <em>Heater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heater</em>'.
	 * @see smart_office.Heater
	 * @generated
	 */
	EClass getHeater();

	/**
	 * Returns the meta object for the attribute '{@link smart_office.Heater#isOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see smart_office.Heater#isOn()
	 * @see #getHeater()
	 * @generated
	 */
	EAttribute getHeater_On();

	/**
	 * Returns the meta object for the reference '{@link smart_office.Heater#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see smart_office.Heater#getRoom()
	 * @see #getHeater()
	 * @generated
	 */
	EReference getHeater_Room();

	/**
	 * Returns the meta object for class '{@link smart_office.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see smart_office.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for the attribute '{@link smart_office.Window#isOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see smart_office.Window#isOn()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_On();

	/**
	 * Returns the meta object for the reference '{@link smart_office.Window#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see smart_office.Window#getRoom()
	 * @see #getWindow()
	 * @generated
	 */
	EReference getWindow_Room();

	/**
	 * Returns the meta object for class '{@link smart_office.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light</em>'.
	 * @see smart_office.Light
	 * @generated
	 */
	EClass getLight();

	/**
	 * Returns the meta object for the attribute '{@link smart_office.Light#isOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see smart_office.Light#isOn()
	 * @see #getLight()
	 * @generated
	 */
	EAttribute getLight_On();

	/**
	 * Returns the meta object for the reference '{@link smart_office.Light#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see smart_office.Light#getRoom()
	 * @see #getLight()
	 * @generated
	 */
	EReference getLight_Room();

	/**
	 * Returns the meta object for class '{@link smart_office.Secretary <em>Secretary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secretary</em>'.
	 * @see smart_office.Secretary
	 * @generated
	 */
	EClass getSecretary();

	/**
	 * Returns the meta object for the reference '{@link smart_office.Secretary#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see smart_office.Secretary#getRoom()
	 * @see #getSecretary()
	 * @generated
	 */
	EReference getSecretary_Room();

	/**
	 * Returns the meta object for class '{@link smart_office.Roomba <em>Roomba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roomba</em>'.
	 * @see smart_office.Roomba
	 * @generated
	 */
	EClass getRoomba();

	/**
	 * Returns the meta object for the reference '{@link smart_office.Roomba#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see smart_office.Roomba#getRoom()
	 * @see #getRoomba()
	 * @generated
	 */
	EReference getRoomba_Room();

	/**
	 * Returns the meta object for class '{@link smart_office.Brightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brightness</em>'.
	 * @see smart_office.Brightness
	 * @generated
	 */
	EClass getBrightness();

	/**
	 * Returns the meta object for the attribute '{@link smart_office.Brightness#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see smart_office.Brightness#getValue()
	 * @see #getBrightness()
	 * @generated
	 */
	EAttribute getBrightness_Value();

	/**
	 * Returns the meta object for class '{@link smart_office.Temperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperature</em>'.
	 * @see smart_office.Temperature
	 * @generated
	 */
	EClass getTemperature();

	/**
	 * Returns the meta object for the attribute '{@link smart_office.Temperature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see smart_office.Temperature#getValue()
	 * @see #getTemperature()
	 * @generated
	 */
	EAttribute getTemperature_Value();

	/**
	 * Returns the meta object for class '{@link smart_office.Cleanness <em>Cleanness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cleanness</em>'.
	 * @see smart_office.Cleanness
	 * @generated
	 */
	EClass getCleanness();

	/**
	 * Returns the meta object for the attribute '{@link smart_office.Cleanness#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see smart_office.Cleanness#getValue()
	 * @see #getCleanness()
	 * @generated
	 */
	EAttribute getCleanness_Value();

	/**
	 * Returns the meta object for class '{@link smart_office.Printer <em>Printer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Printer</em>'.
	 * @see smart_office.Printer
	 * @generated
	 */
	EClass getPrinter();

	/**
	 * Returns the meta object for the reference '{@link smart_office.Printer#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see smart_office.Printer#getAsset()
	 * @see #getPrinter()
	 * @generated
	 */
	EReference getPrinter_Asset();

	/**
	 * Returns the meta object for the reference '{@link smart_office.Printer#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see smart_office.Printer#getRoom()
	 * @see #getPrinter()
	 * @generated
	 */
	EReference getPrinter_Room();

	/**
	 * Returns the meta object for class '{@link smart_office.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see smart_office.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for class '{@link smart_office.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see smart_office.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the reference '{@link smart_office.Server#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see smart_office.Server#getRoom()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Room();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Smart_officeFactory getSmart_officeFactory();

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
		 * The meta object literal for the '{@link smart_office.impl.SmartOfficeImpl <em>Smart Office</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_office.impl.SmartOfficeImpl
		 * @see smart_office.impl.Smart_officePackageImpl#getSmartOffice()
		 * @generated
		 */
		EClass SMART_OFFICE = eINSTANCE.getSmartOffice();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_OFFICE__CLAZZ = eINSTANCE.getSmartOffice_Clazz();

		/**
		 * The meta object literal for the '{@link smart_office.impl.ClazzImpl <em>Clazz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_office.impl.ClazzImpl
		 * @see smart_office.impl.Smart_officePackageImpl#getClazz()
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
		 * The meta object literal for the '{@link smart_office.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_office.impl.RoomImpl
		 * @see smart_office.impl.Smart_officePackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Door</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__DOOR = eINSTANCE.getRoom_Door();

		/**
		 * The meta object literal for the '<em><b>Window</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__WINDOW = eINSTANCE.getRoom_Window();

		/**
		 * The meta object literal for the '<em><b>Heater</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__HEATER = eINSTANCE.getRoom_Heater();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__LIGHT = eINSTANCE.getRoom_Light();

		/**
		 * The meta object literal for the '<em><b>Roomba</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOMBA = eINSTANCE.getRoom_Roomba();

		/**
		 * The meta object literal for the '<em><b>Secretary</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__SECRETARY = eINSTANCE.getRoom_Secretary();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__AGENT = eINSTANCE.getRoom_Agent();

		/**
		 * The meta object literal for the '<em><b>Printer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__PRINTER = eINSTANCE.getRoom_Printer();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__SERVER = eINSTANCE.getRoom_Server();

		/**
		 * The meta object literal for the '<em><b>Brightness</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__BRIGHTNESS = eINSTANCE.getRoom_Brightness();

		/**
		 * The meta object literal for the '<em><b>Cleanness</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__CLEANNESS = eINSTANCE.getRoom_Cleanness();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__TEMPERATURE = eINSTANCE.getRoom_Temperature();

		/**
		 * The meta object literal for the '{@link smart_office.impl.DoorImpl <em>Door</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_office.impl.DoorImpl
		 * @see smart_office.impl.Smart_officePackageImpl#getDoor()
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
		 * The meta object literal for the '{@link smart_office.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_office.impl.AgentImpl
		 * @see smart_office.impl.Smart_officePackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__ROOM = eINSTANCE.getAgent_Room();

		/**
		 * The meta object literal for the '{@link smart_office.impl.HeaterImpl <em>Heater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_office.impl.HeaterImpl
		 * @see smart_office.impl.Smart_officePackageImpl#getHeater()
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
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEATER__ROOM = eINSTANCE.getHeater_Room();

		/**
		 * The meta object literal for the '{@link smart_office.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_office.impl.WindowImpl
		 * @see smart_office.impl.Smart_officePackageImpl#getWindow()
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
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDOW__ROOM = eINSTANCE.getWindow_Room();

		/**
		 * The meta object literal for the '{@link smart_office.impl.LightImpl <em>Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_office.impl.LightImpl
		 * @see smart_office.impl.Smart_officePackageImpl#getLight()
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
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIGHT__ROOM = eINSTANCE.getLight_Room();

		/**
		 * The meta object literal for the '{@link smart_office.impl.SecretaryImpl <em>Secretary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_office.impl.SecretaryImpl
		 * @see smart_office.impl.Smart_officePackageImpl#getSecretary()
		 * @generated
		 */
		EClass SECRETARY = eINSTANCE.getSecretary();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECRETARY__ROOM = eINSTANCE.getSecretary_Room();

		/**
		 * The meta object literal for the '{@link smart_office.impl.RoombaImpl <em>Roomba</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_office.impl.RoombaImpl
		 * @see smart_office.impl.Smart_officePackageImpl#getRoomba()
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
		 * The meta object literal for the '{@link smart_office.impl.BrightnessImpl <em>Brightness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_office.impl.BrightnessImpl
		 * @see smart_office.impl.Smart_officePackageImpl#getBrightness()
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
		 * The meta object literal for the '{@link smart_office.impl.TemperatureImpl <em>Temperature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_office.impl.TemperatureImpl
		 * @see smart_office.impl.Smart_officePackageImpl#getTemperature()
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
		 * The meta object literal for the '{@link smart_office.impl.CleannessImpl <em>Cleanness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_office.impl.CleannessImpl
		 * @see smart_office.impl.Smart_officePackageImpl#getCleanness()
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

		/**
		 * The meta object literal for the '{@link smart_office.impl.PrinterImpl <em>Printer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_office.impl.PrinterImpl
		 * @see smart_office.impl.Smart_officePackageImpl#getPrinter()
		 * @generated
		 */
		EClass PRINTER = eINSTANCE.getPrinter();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINTER__ASSET = eINSTANCE.getPrinter_Asset();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINTER__ROOM = eINSTANCE.getPrinter_Room();

		/**
		 * The meta object literal for the '{@link smart_office.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_office.impl.AssetImpl
		 * @see smart_office.impl.Smart_officePackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '{@link smart_office.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smart_office.impl.ServerImpl
		 * @see smart_office.impl.Smart_officePackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__ROOM = eINSTANCE.getServer_Room();

	}

} //Smart_officePackage
