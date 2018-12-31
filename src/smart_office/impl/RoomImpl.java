/**
 */
package smart_office.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smart_office.Agent;
import smart_office.Brightness;
import smart_office.Cleanness;
import smart_office.Door;
import smart_office.Heater;
import smart_office.Light;
import smart_office.Printer;
import smart_office.Room;
import smart_office.Roomba;
import smart_office.Secretary;
import smart_office.Server;
import smart_office.Smart_officePackage;
import smart_office.Temperature;
import smart_office.Window;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smart_office.impl.RoomImpl#getDoor <em>Door</em>}</li>
 *   <li>{@link smart_office.impl.RoomImpl#getWindow <em>Window</em>}</li>
 *   <li>{@link smart_office.impl.RoomImpl#getHeater <em>Heater</em>}</li>
 *   <li>{@link smart_office.impl.RoomImpl#getLight <em>Light</em>}</li>
 *   <li>{@link smart_office.impl.RoomImpl#getRoomba <em>Roomba</em>}</li>
 *   <li>{@link smart_office.impl.RoomImpl#getSecretary <em>Secretary</em>}</li>
 *   <li>{@link smart_office.impl.RoomImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link smart_office.impl.RoomImpl#getPrinter <em>Printer</em>}</li>
 *   <li>{@link smart_office.impl.RoomImpl#getServer <em>Server</em>}</li>
 *   <li>{@link smart_office.impl.RoomImpl#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link smart_office.impl.RoomImpl#getCleanness <em>Cleanness</em>}</li>
 *   <li>{@link smart_office.impl.RoomImpl#getTemperature <em>Temperature</em>}</li>
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
	 * The cached value of the '{@link #getHeater() <em>Heater</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeater()
	 * @generated
	 * @ordered
	 */
	protected Heater heater;

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
	 * The cached value of the '{@link #getRoomba() <em>Roomba</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomba()
	 * @generated
	 * @ordered
	 */
	protected EList<Roomba> roomba;

	/**
	 * The cached value of the '{@link #getSecretary() <em>Secretary</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretary()
	 * @generated
	 * @ordered
	 */
	protected EList<Secretary> secretary;

	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agent;

	/**
	 * The cached value of the '{@link #getPrinter() <em>Printer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrinter()
	 * @generated
	 * @ordered
	 */
	protected EList<Printer> printer;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected EList<Server> server;

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
	 * The cached value of the '{@link #getCleanness() <em>Cleanness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleanness()
	 * @generated
	 * @ordered
	 */
	protected Cleanness cleanness;

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
		return Smart_officePackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Door> getDoor() {
		if (door == null) {
			door = new EObjectWithInverseResolvingEList.ManyInverse<Door>(Door.class, this, Smart_officePackage.ROOM__DOOR, Smart_officePackage.DOOR__ROOM);
		}
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Window getWindow() {
		if (window != null && window.eIsProxy()) {
			InternalEObject oldWindow = (InternalEObject)window;
			window = (Window)eResolveProxy(oldWindow);
			if (window != oldWindow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Smart_officePackage.ROOM__WINDOW, oldWindow, window));
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
	public NotificationChain basicSetWindow(Window newWindow, NotificationChain msgs) {
		Window oldWindow = window;
		window = newWindow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Smart_officePackage.ROOM__WINDOW, oldWindow, newWindow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindow(Window newWindow) {
		if (newWindow != window) {
			NotificationChain msgs = null;
			if (window != null)
				msgs = ((InternalEObject)window).eInverseRemove(this, Smart_officePackage.WINDOW__ROOM, Window.class, msgs);
			if (newWindow != null)
				msgs = ((InternalEObject)newWindow).eInverseAdd(this, Smart_officePackage.WINDOW__ROOM, Window.class, msgs);
			msgs = basicSetWindow(newWindow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_officePackage.ROOM__WINDOW, newWindow, newWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Heater getHeater() {
		if (heater != null && heater.eIsProxy()) {
			InternalEObject oldHeater = (InternalEObject)heater;
			heater = (Heater)eResolveProxy(oldHeater);
			if (heater != oldHeater) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Smart_officePackage.ROOM__HEATER, oldHeater, heater));
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
	public NotificationChain basicSetHeater(Heater newHeater, NotificationChain msgs) {
		Heater oldHeater = heater;
		heater = newHeater;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Smart_officePackage.ROOM__HEATER, oldHeater, newHeater);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeater(Heater newHeater) {
		if (newHeater != heater) {
			NotificationChain msgs = null;
			if (heater != null)
				msgs = ((InternalEObject)heater).eInverseRemove(this, Smart_officePackage.HEATER__ROOM, Heater.class, msgs);
			if (newHeater != null)
				msgs = ((InternalEObject)newHeater).eInverseAdd(this, Smart_officePackage.HEATER__ROOM, Heater.class, msgs);
			msgs = basicSetHeater(newHeater, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_officePackage.ROOM__HEATER, newHeater, newHeater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Light getLight() {
		if (light != null && light.eIsProxy()) {
			InternalEObject oldLight = (InternalEObject)light;
			light = (Light)eResolveProxy(oldLight);
			if (light != oldLight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Smart_officePackage.ROOM__LIGHT, oldLight, light));
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
	public NotificationChain basicSetLight(Light newLight, NotificationChain msgs) {
		Light oldLight = light;
		light = newLight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Smart_officePackage.ROOM__LIGHT, oldLight, newLight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLight(Light newLight) {
		if (newLight != light) {
			NotificationChain msgs = null;
			if (light != null)
				msgs = ((InternalEObject)light).eInverseRemove(this, Smart_officePackage.LIGHT__ROOM, Light.class, msgs);
			if (newLight != null)
				msgs = ((InternalEObject)newLight).eInverseAdd(this, Smart_officePackage.LIGHT__ROOM, Light.class, msgs);
			msgs = basicSetLight(newLight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_officePackage.ROOM__LIGHT, newLight, newLight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Roomba> getRoomba() {
		if (roomba == null) {
			roomba = new EObjectWithInverseResolvingEList<Roomba>(Roomba.class, this, Smart_officePackage.ROOM__ROOMBA, Smart_officePackage.ROOMBA__ROOM);
		}
		return roomba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Secretary> getSecretary() {
		if (secretary == null) {
			secretary = new EObjectWithInverseResolvingEList<Secretary>(Secretary.class, this, Smart_officePackage.ROOM__SECRETARY, Smart_officePackage.SECRETARY__ROOM);
		}
		return secretary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getAgent() {
		if (agent == null) {
			agent = new EObjectWithInverseResolvingEList<Agent>(Agent.class, this, Smart_officePackage.ROOM__AGENT, Smart_officePackage.AGENT__ROOM);
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Printer> getPrinter() {
		if (printer == null) {
			printer = new EObjectWithInverseResolvingEList<Printer>(Printer.class, this, Smart_officePackage.ROOM__PRINTER, Smart_officePackage.PRINTER__ROOM);
		}
		return printer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Server> getServer() {
		if (server == null) {
			server = new EObjectWithInverseResolvingEList<Server>(Server.class, this, Smart_officePackage.ROOM__SERVER, Smart_officePackage.SERVER__ROOM);
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brightness getBrightness() {
		if (brightness != null && brightness.eIsProxy()) {
			InternalEObject oldBrightness = (InternalEObject)brightness;
			brightness = (Brightness)eResolveProxy(oldBrightness);
			if (brightness != oldBrightness) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Smart_officePackage.ROOM__BRIGHTNESS, oldBrightness, brightness));
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
	public void setBrightness(Brightness newBrightness) {
		Brightness oldBrightness = brightness;
		brightness = newBrightness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_officePackage.ROOM__BRIGHTNESS, oldBrightness, brightness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cleanness getCleanness() {
		if (cleanness != null && cleanness.eIsProxy()) {
			InternalEObject oldCleanness = (InternalEObject)cleanness;
			cleanness = (Cleanness)eResolveProxy(oldCleanness);
			if (cleanness != oldCleanness) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Smart_officePackage.ROOM__CLEANNESS, oldCleanness, cleanness));
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
	public void setCleanness(Cleanness newCleanness) {
		Cleanness oldCleanness = cleanness;
		cleanness = newCleanness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_officePackage.ROOM__CLEANNESS, oldCleanness, cleanness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temperature getTemperature() {
		if (temperature != null && temperature.eIsProxy()) {
			InternalEObject oldTemperature = (InternalEObject)temperature;
			temperature = (Temperature)eResolveProxy(oldTemperature);
			if (temperature != oldTemperature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Smart_officePackage.ROOM__TEMPERATURE, oldTemperature, temperature));
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
	public void setTemperature(Temperature newTemperature) {
		Temperature oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Smart_officePackage.ROOM__TEMPERATURE, oldTemperature, temperature));
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
			case Smart_officePackage.ROOM__DOOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDoor()).basicAdd(otherEnd, msgs);
			case Smart_officePackage.ROOM__WINDOW:
				if (window != null)
					msgs = ((InternalEObject)window).eInverseRemove(this, Smart_officePackage.WINDOW__ROOM, Window.class, msgs);
				return basicSetWindow((Window)otherEnd, msgs);
			case Smart_officePackage.ROOM__HEATER:
				if (heater != null)
					msgs = ((InternalEObject)heater).eInverseRemove(this, Smart_officePackage.HEATER__ROOM, Heater.class, msgs);
				return basicSetHeater((Heater)otherEnd, msgs);
			case Smart_officePackage.ROOM__LIGHT:
				if (light != null)
					msgs = ((InternalEObject)light).eInverseRemove(this, Smart_officePackage.LIGHT__ROOM, Light.class, msgs);
				return basicSetLight((Light)otherEnd, msgs);
			case Smart_officePackage.ROOM__ROOMBA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoomba()).basicAdd(otherEnd, msgs);
			case Smart_officePackage.ROOM__SECRETARY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSecretary()).basicAdd(otherEnd, msgs);
			case Smart_officePackage.ROOM__AGENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAgent()).basicAdd(otherEnd, msgs);
			case Smart_officePackage.ROOM__PRINTER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrinter()).basicAdd(otherEnd, msgs);
			case Smart_officePackage.ROOM__SERVER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServer()).basicAdd(otherEnd, msgs);
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
			case Smart_officePackage.ROOM__DOOR:
				return ((InternalEList<?>)getDoor()).basicRemove(otherEnd, msgs);
			case Smart_officePackage.ROOM__WINDOW:
				return basicSetWindow(null, msgs);
			case Smart_officePackage.ROOM__HEATER:
				return basicSetHeater(null, msgs);
			case Smart_officePackage.ROOM__LIGHT:
				return basicSetLight(null, msgs);
			case Smart_officePackage.ROOM__ROOMBA:
				return ((InternalEList<?>)getRoomba()).basicRemove(otherEnd, msgs);
			case Smart_officePackage.ROOM__SECRETARY:
				return ((InternalEList<?>)getSecretary()).basicRemove(otherEnd, msgs);
			case Smart_officePackage.ROOM__AGENT:
				return ((InternalEList<?>)getAgent()).basicRemove(otherEnd, msgs);
			case Smart_officePackage.ROOM__PRINTER:
				return ((InternalEList<?>)getPrinter()).basicRemove(otherEnd, msgs);
			case Smart_officePackage.ROOM__SERVER:
				return ((InternalEList<?>)getServer()).basicRemove(otherEnd, msgs);
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
			case Smart_officePackage.ROOM__DOOR:
				return getDoor();
			case Smart_officePackage.ROOM__WINDOW:
				if (resolve) return getWindow();
				return basicGetWindow();
			case Smart_officePackage.ROOM__HEATER:
				if (resolve) return getHeater();
				return basicGetHeater();
			case Smart_officePackage.ROOM__LIGHT:
				if (resolve) return getLight();
				return basicGetLight();
			case Smart_officePackage.ROOM__ROOMBA:
				return getRoomba();
			case Smart_officePackage.ROOM__SECRETARY:
				return getSecretary();
			case Smart_officePackage.ROOM__AGENT:
				return getAgent();
			case Smart_officePackage.ROOM__PRINTER:
				return getPrinter();
			case Smart_officePackage.ROOM__SERVER:
				return getServer();
			case Smart_officePackage.ROOM__BRIGHTNESS:
				if (resolve) return getBrightness();
				return basicGetBrightness();
			case Smart_officePackage.ROOM__CLEANNESS:
				if (resolve) return getCleanness();
				return basicGetCleanness();
			case Smart_officePackage.ROOM__TEMPERATURE:
				if (resolve) return getTemperature();
				return basicGetTemperature();
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
			case Smart_officePackage.ROOM__DOOR:
				getDoor().clear();
				getDoor().addAll((Collection<? extends Door>)newValue);
				return;
			case Smart_officePackage.ROOM__WINDOW:
				setWindow((Window)newValue);
				return;
			case Smart_officePackage.ROOM__HEATER:
				setHeater((Heater)newValue);
				return;
			case Smart_officePackage.ROOM__LIGHT:
				setLight((Light)newValue);
				return;
			case Smart_officePackage.ROOM__ROOMBA:
				getRoomba().clear();
				getRoomba().addAll((Collection<? extends Roomba>)newValue);
				return;
			case Smart_officePackage.ROOM__SECRETARY:
				getSecretary().clear();
				getSecretary().addAll((Collection<? extends Secretary>)newValue);
				return;
			case Smart_officePackage.ROOM__AGENT:
				getAgent().clear();
				getAgent().addAll((Collection<? extends Agent>)newValue);
				return;
			case Smart_officePackage.ROOM__PRINTER:
				getPrinter().clear();
				getPrinter().addAll((Collection<? extends Printer>)newValue);
				return;
			case Smart_officePackage.ROOM__SERVER:
				getServer().clear();
				getServer().addAll((Collection<? extends Server>)newValue);
				return;
			case Smart_officePackage.ROOM__BRIGHTNESS:
				setBrightness((Brightness)newValue);
				return;
			case Smart_officePackage.ROOM__CLEANNESS:
				setCleanness((Cleanness)newValue);
				return;
			case Smart_officePackage.ROOM__TEMPERATURE:
				setTemperature((Temperature)newValue);
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
			case Smart_officePackage.ROOM__DOOR:
				getDoor().clear();
				return;
			case Smart_officePackage.ROOM__WINDOW:
				setWindow((Window)null);
				return;
			case Smart_officePackage.ROOM__HEATER:
				setHeater((Heater)null);
				return;
			case Smart_officePackage.ROOM__LIGHT:
				setLight((Light)null);
				return;
			case Smart_officePackage.ROOM__ROOMBA:
				getRoomba().clear();
				return;
			case Smart_officePackage.ROOM__SECRETARY:
				getSecretary().clear();
				return;
			case Smart_officePackage.ROOM__AGENT:
				getAgent().clear();
				return;
			case Smart_officePackage.ROOM__PRINTER:
				getPrinter().clear();
				return;
			case Smart_officePackage.ROOM__SERVER:
				getServer().clear();
				return;
			case Smart_officePackage.ROOM__BRIGHTNESS:
				setBrightness((Brightness)null);
				return;
			case Smart_officePackage.ROOM__CLEANNESS:
				setCleanness((Cleanness)null);
				return;
			case Smart_officePackage.ROOM__TEMPERATURE:
				setTemperature((Temperature)null);
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
			case Smart_officePackage.ROOM__DOOR:
				return door != null && !door.isEmpty();
			case Smart_officePackage.ROOM__WINDOW:
				return window != null;
			case Smart_officePackage.ROOM__HEATER:
				return heater != null;
			case Smart_officePackage.ROOM__LIGHT:
				return light != null;
			case Smart_officePackage.ROOM__ROOMBA:
				return roomba != null && !roomba.isEmpty();
			case Smart_officePackage.ROOM__SECRETARY:
				return secretary != null && !secretary.isEmpty();
			case Smart_officePackage.ROOM__AGENT:
				return agent != null && !agent.isEmpty();
			case Smart_officePackage.ROOM__PRINTER:
				return printer != null && !printer.isEmpty();
			case Smart_officePackage.ROOM__SERVER:
				return server != null && !server.isEmpty();
			case Smart_officePackage.ROOM__BRIGHTNESS:
				return brightness != null;
			case Smart_officePackage.ROOM__CLEANNESS:
				return cleanness != null;
			case Smart_officePackage.ROOM__TEMPERATURE:
				return temperature != null;
		}
		return super.eIsSet(featureID);
	}

} //RoomImpl
