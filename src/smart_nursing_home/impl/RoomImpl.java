/**
 */
package smart_nursing_home.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smart_nursing_home.Brightness;
import smart_nursing_home.Cleanness;
import smart_nursing_home.Door;
import smart_nursing_home.Heater;
import smart_nursing_home.Humidifier;
import smart_nursing_home.Humidity;
import smart_nursing_home.Light;
import smart_nursing_home.Person;
import smart_nursing_home.Room;
import smart_nursing_home.Roomba;
import smart_nursing_home.Smart_nursing_homePackage;
import smart_nursing_home.Temperature;
import smart_nursing_home.Window;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smart_nursing_home.impl.RoomImpl#getDoor <em>Door</em>}</li>
 *   <li>{@link smart_nursing_home.impl.RoomImpl#getWindow <em>Window</em>}</li>
 *   <li>{@link smart_nursing_home.impl.RoomImpl#getLight <em>Light</em>}</li>
 *   <li>{@link smart_nursing_home.impl.RoomImpl#getHeater <em>Heater</em>}</li>
 *   <li>{@link smart_nursing_home.impl.RoomImpl#getHumidifier <em>Humidifier</em>}</li>
 *   <li>{@link smart_nursing_home.impl.RoomImpl#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link smart_nursing_home.impl.RoomImpl#getHumidity <em>Humidity</em>}</li>
 *   <li>{@link smart_nursing_home.impl.RoomImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link smart_nursing_home.impl.RoomImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link smart_nursing_home.impl.RoomImpl#getRoomba <em>Roomba</em>}</li>
 *   <li>{@link smart_nursing_home.impl.RoomImpl#getCleanness <em>Cleanness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends ClazzImpl implements Room {
	/**
	 * The cached value of the '{@link #getDoor() <em>Door</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor()
	 * @generated
	 * @ordered
	 */
	protected EList<Door> door;

	/**
	 * The cached value of the '{@link #getWindow() <em>Window</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow()
	 * @generated
	 * @ordered
	 */
	protected Window window;

	/**
	 * The cached value of the '{@link #getLight() <em>Light</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected Light light;

	/**
	 * The cached value of the '{@link #getHeater() <em>Heater</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeater()
	 * @generated
	 * @ordered
	 */
	protected Heater heater;

	/**
	 * The cached value of the '{@link #getHumidifier() <em>Humidifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumidifier()
	 * @generated
	 * @ordered
	 */
	protected Humidifier humidifier;

	/**
	 * The cached value of the '{@link #getBrightness() <em>Brightness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrightness()
	 * @generated
	 * @ordered
	 */
	protected Brightness brightness;

	/**
	 * The cached value of the '{@link #getHumidity() <em>Humidity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumidity()
	 * @generated
	 * @ordered
	 */
	protected Humidity humidity;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected Temperature temperature;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> person;

	/**
	 * The cached value of the '{@link #getRoomba() <em>Roomba</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomba()
	 * @generated
	 * @ordered
	 */
	protected EList<Roomba> roomba;

	/**
	 * The cached value of the '{@link #getCleanness() <em>Cleanness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleanness()
	 * @generated
	 * @ordered
	 */
	protected Cleanness cleanness;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Smart_nursing_homePackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Window getWindow() {
		if (window != null && window.eIsProxy()) {
			InternalEObject oldWindow = (InternalEObject)window;
			window = (Window)eResolveProxy(oldWindow);
			if (window != oldWindow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Smart_nursing_homePackage.ROOM__WINDOW, oldWindow, window));
			}
		}
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Window basicGetWindow() {
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWindow(Window newWindow) {
		Window oldWindow = window;
		window = newWindow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_nursing_homePackage.ROOM__WINDOW, oldWindow, window));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Light getLight() {
		if (light != null && light.eIsProxy()) {
			InternalEObject oldLight = (InternalEObject)light;
			light = (Light)eResolveProxy(oldLight);
			if (light != oldLight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Smart_nursing_homePackage.ROOM__LIGHT, oldLight, light));
			}
		}
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Light basicGetLight() {
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLight(Light newLight) {
		Light oldLight = light;
		light = newLight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_nursing_homePackage.ROOM__LIGHT, oldLight, light));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Humidifier getHumidifier() {
		if (humidifier != null && humidifier.eIsProxy()) {
			InternalEObject oldHumidifier = (InternalEObject)humidifier;
			humidifier = (Humidifier)eResolveProxy(oldHumidifier);
			if (humidifier != oldHumidifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Smart_nursing_homePackage.ROOM__HUMIDIFIER, oldHumidifier, humidifier));
			}
		}
		return humidifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Humidifier basicGetHumidifier() {
		return humidifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumidifier(Humidifier newHumidifier) {
		Humidifier oldHumidifier = humidifier;
		humidifier = newHumidifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_nursing_homePackage.ROOM__HUMIDIFIER, oldHumidifier, humidifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Heater getHeater() {
		if (heater != null && heater.eIsProxy()) {
			InternalEObject oldHeater = (InternalEObject)heater;
			heater = (Heater)eResolveProxy(oldHeater);
			if (heater != oldHeater) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Smart_nursing_homePackage.ROOM__HEATER, oldHeater, heater));
			}
		}
		return heater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Heater basicGetHeater() {
		return heater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeater(Heater newHeater) {
		Heater oldHeater = heater;
		heater = newHeater;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_nursing_homePackage.ROOM__HEATER, oldHeater, heater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Brightness getBrightness() {
		if (brightness != null && brightness.eIsProxy()) {
			InternalEObject oldBrightness = (InternalEObject)brightness;
			brightness = (Brightness)eResolveProxy(oldBrightness);
			if (brightness != oldBrightness) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Smart_nursing_homePackage.ROOM__BRIGHTNESS, oldBrightness, brightness));
			}
		}
		return brightness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brightness basicGetBrightness() {
		return brightness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrightness(Brightness newBrightness) {
		Brightness oldBrightness = brightness;
		brightness = newBrightness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_nursing_homePackage.ROOM__BRIGHTNESS, oldBrightness, brightness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Humidity getHumidity() {
		if (humidity != null && humidity.eIsProxy()) {
			InternalEObject oldHumidity = (InternalEObject)humidity;
			humidity = (Humidity)eResolveProxy(oldHumidity);
			if (humidity != oldHumidity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Smart_nursing_homePackage.ROOM__HUMIDITY, oldHumidity, humidity));
			}
		}
		return humidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Humidity basicGetHumidity() {
		return humidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumidity(Humidity newHumidity) {
		Humidity oldHumidity = humidity;
		humidity = newHumidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_nursing_homePackage.ROOM__HUMIDITY, oldHumidity, humidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temperature getTemperature() {
		if (temperature != null && temperature.eIsProxy()) {
			InternalEObject oldTemperature = (InternalEObject)temperature;
			temperature = (Temperature)eResolveProxy(oldTemperature);
			if (temperature != oldTemperature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Smart_nursing_homePackage.ROOM__TEMPERATURE, oldTemperature, temperature));
			}
		}
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temperature basicGetTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperature(Temperature newTemperature) {
		Temperature oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_nursing_homePackage.ROOM__TEMPERATURE, oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Door> getDoor() {
		if (door == null) {
			door = new EObjectWithInverseResolvingEList.ManyInverse<Door>(Door.class, this, Smart_nursing_homePackage.ROOM__DOOR, Smart_nursing_homePackage.DOOR__ROOM);
		}
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getPerson() {
		if (person == null) {
			person = new EObjectWithInverseResolvingEList<Person>(Person.class, this, Smart_nursing_homePackage.ROOM__PERSON, Smart_nursing_homePackage.PERSON__ROOM);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Roomba> getRoomba() {
		if (roomba == null) {
			roomba = new EObjectWithInverseResolvingEList<Roomba>(Roomba.class, this, Smart_nursing_homePackage.ROOM__ROOMBA, Smart_nursing_homePackage.ROOMBA__ROOM);
		}
		return roomba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cleanness getCleanness() {
		if (cleanness != null && cleanness.eIsProxy()) {
			InternalEObject oldCleanness = (InternalEObject)cleanness;
			cleanness = (Cleanness)eResolveProxy(oldCleanness);
			if (cleanness != oldCleanness) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Smart_nursing_homePackage.ROOM__CLEANNESS, oldCleanness, cleanness));
			}
		}
		return cleanness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cleanness basicGetCleanness() {
		return cleanness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCleanness(Cleanness newCleanness) {
		Cleanness oldCleanness = cleanness;
		cleanness = newCleanness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_nursing_homePackage.ROOM__CLEANNESS, oldCleanness, cleanness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Smart_nursing_homePackage.ROOM__DOOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDoor()).basicAdd(otherEnd, msgs);
			case Smart_nursing_homePackage.ROOM__PERSON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPerson()).basicAdd(otherEnd, msgs);
			case Smart_nursing_homePackage.ROOM__ROOMBA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoomba()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Smart_nursing_homePackage.ROOM__DOOR:
				return ((InternalEList<?>)getDoor()).basicRemove(otherEnd, msgs);
			case Smart_nursing_homePackage.ROOM__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case Smart_nursing_homePackage.ROOM__ROOMBA:
				return ((InternalEList<?>)getRoomba()).basicRemove(otherEnd, msgs);
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
			case Smart_nursing_homePackage.ROOM__DOOR:
				return getDoor();
			case Smart_nursing_homePackage.ROOM__WINDOW:
				if (resolve) return getWindow();
				return basicGetWindow();
			case Smart_nursing_homePackage.ROOM__LIGHT:
				if (resolve) return getLight();
				return basicGetLight();
			case Smart_nursing_homePackage.ROOM__HEATER:
				if (resolve) return getHeater();
				return basicGetHeater();
			case Smart_nursing_homePackage.ROOM__HUMIDIFIER:
				if (resolve) return getHumidifier();
				return basicGetHumidifier();
			case Smart_nursing_homePackage.ROOM__BRIGHTNESS:
				if (resolve) return getBrightness();
				return basicGetBrightness();
			case Smart_nursing_homePackage.ROOM__HUMIDITY:
				if (resolve) return getHumidity();
				return basicGetHumidity();
			case Smart_nursing_homePackage.ROOM__TEMPERATURE:
				if (resolve) return getTemperature();
				return basicGetTemperature();
			case Smart_nursing_homePackage.ROOM__PERSON:
				return getPerson();
			case Smart_nursing_homePackage.ROOM__ROOMBA:
				return getRoomba();
			case Smart_nursing_homePackage.ROOM__CLEANNESS:
				if (resolve) return getCleanness();
				return basicGetCleanness();
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
			case Smart_nursing_homePackage.ROOM__DOOR:
				getDoor().clear();
				getDoor().addAll((Collection<? extends Door>)newValue);
				return;
			case Smart_nursing_homePackage.ROOM__WINDOW:
				setWindow((Window)newValue);
				return;
			case Smart_nursing_homePackage.ROOM__LIGHT:
				setLight((Light)newValue);
				return;
			case Smart_nursing_homePackage.ROOM__HEATER:
				setHeater((Heater)newValue);
				return;
			case Smart_nursing_homePackage.ROOM__HUMIDIFIER:
				setHumidifier((Humidifier)newValue);
				return;
			case Smart_nursing_homePackage.ROOM__BRIGHTNESS:
				setBrightness((Brightness)newValue);
				return;
			case Smart_nursing_homePackage.ROOM__HUMIDITY:
				setHumidity((Humidity)newValue);
				return;
			case Smart_nursing_homePackage.ROOM__TEMPERATURE:
				setTemperature((Temperature)newValue);
				return;
			case Smart_nursing_homePackage.ROOM__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends Person>)newValue);
				return;
			case Smart_nursing_homePackage.ROOM__ROOMBA:
				getRoomba().clear();
				getRoomba().addAll((Collection<? extends Roomba>)newValue);
				return;
			case Smart_nursing_homePackage.ROOM__CLEANNESS:
				setCleanness((Cleanness)newValue);
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
			case Smart_nursing_homePackage.ROOM__DOOR:
				getDoor().clear();
				return;
			case Smart_nursing_homePackage.ROOM__WINDOW:
				setWindow((Window)null);
				return;
			case Smart_nursing_homePackage.ROOM__LIGHT:
				setLight((Light)null);
				return;
			case Smart_nursing_homePackage.ROOM__HEATER:
				setHeater((Heater)null);
				return;
			case Smart_nursing_homePackage.ROOM__HUMIDIFIER:
				setHumidifier((Humidifier)null);
				return;
			case Smart_nursing_homePackage.ROOM__BRIGHTNESS:
				setBrightness((Brightness)null);
				return;
			case Smart_nursing_homePackage.ROOM__HUMIDITY:
				setHumidity((Humidity)null);
				return;
			case Smart_nursing_homePackage.ROOM__TEMPERATURE:
				setTemperature((Temperature)null);
				return;
			case Smart_nursing_homePackage.ROOM__PERSON:
				getPerson().clear();
				return;
			case Smart_nursing_homePackage.ROOM__ROOMBA:
				getRoomba().clear();
				return;
			case Smart_nursing_homePackage.ROOM__CLEANNESS:
				setCleanness((Cleanness)null);
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
			case Smart_nursing_homePackage.ROOM__DOOR:
				return door != null && !door.isEmpty();
			case Smart_nursing_homePackage.ROOM__WINDOW:
				return window != null;
			case Smart_nursing_homePackage.ROOM__LIGHT:
				return light != null;
			case Smart_nursing_homePackage.ROOM__HEATER:
				return heater != null;
			case Smart_nursing_homePackage.ROOM__HUMIDIFIER:
				return humidifier != null;
			case Smart_nursing_homePackage.ROOM__BRIGHTNESS:
				return brightness != null;
			case Smart_nursing_homePackage.ROOM__HUMIDITY:
				return humidity != null;
			case Smart_nursing_homePackage.ROOM__TEMPERATURE:
				return temperature != null;
			case Smart_nursing_homePackage.ROOM__PERSON:
				return person != null && !person.isEmpty();
			case Smart_nursing_homePackage.ROOM__ROOMBA:
				return roomba != null && !roomba.isEmpty();
			case Smart_nursing_homePackage.ROOM__CLEANNESS:
				return cleanness != null;
		}
		return super.eIsSet(featureID);
	}

} //RoomImpl
