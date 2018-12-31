/**
 */
package smart_office.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import smart_office.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Smart_officeFactoryImpl extends EFactoryImpl implements Smart_officeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Smart_officeFactory init() {
		try {
			Smart_officeFactory theSmart_officeFactory = (Smart_officeFactory)EPackage.Registry.INSTANCE.getEFactory(Smart_officePackage.eNS_URI);
			if (theSmart_officeFactory != null) {
				return theSmart_officeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Smart_officeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Smart_officeFactoryImpl() {
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
			case Smart_officePackage.SMART_OFFICE: return createSmartOffice();
			case Smart_officePackage.ROOM: return createRoom();
			case Smart_officePackage.DOOR: return createDoor();
			case Smart_officePackage.AGENT: return createAgent();
			case Smart_officePackage.HEATER: return createHeater();
			case Smart_officePackage.WINDOW: return createWindow();
			case Smart_officePackage.LIGHT: return createLight();
			case Smart_officePackage.SECRETARY: return createSecretary();
			case Smart_officePackage.ROOMBA: return createRoomba();
			case Smart_officePackage.BRIGHTNESS: return createBrightness();
			case Smart_officePackage.TEMPERATURE: return createTemperature();
			case Smart_officePackage.CLEANNESS: return createCleanness();
			case Smart_officePackage.PRINTER: return createPrinter();
			case Smart_officePackage.ASSET: return createAsset();
			case Smart_officePackage.SERVER: return createServer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartOffice createSmartOffice() {
		SmartOfficeImpl smartOffice = new SmartOfficeImpl();
		return smartOffice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door createDoor() {
		DoorImpl door = new DoorImpl();
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Heater createHeater() {
		HeaterImpl heater = new HeaterImpl();
		return heater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Window createWindow() {
		WindowImpl window = new WindowImpl();
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Light createLight() {
		LightImpl light = new LightImpl();
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Secretary createSecretary() {
		SecretaryImpl secretary = new SecretaryImpl();
		return secretary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roomba createRoomba() {
		RoombaImpl roomba = new RoombaImpl();
		return roomba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brightness createBrightness() {
		BrightnessImpl brightness = new BrightnessImpl();
		return brightness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temperature createTemperature() {
		TemperatureImpl temperature = new TemperatureImpl();
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cleanness createCleanness() {
		CleannessImpl cleanness = new CleannessImpl();
		return cleanness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Printer createPrinter() {
		PrinterImpl printer = new PrinterImpl();
		return printer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Smart_officePackage getSmart_officePackage() {
		return (Smart_officePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Smart_officePackage getPackage() {
		return Smart_officePackage.eINSTANCE;
	}

} //Smart_officeFactoryImpl
