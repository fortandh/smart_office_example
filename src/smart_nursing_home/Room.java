/**
 */
package smart_nursing_home;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smart_nursing_home.Room#getDoor <em>Door</em>}</li>
 *   <li>{@link smart_nursing_home.Room#getWindow <em>Window</em>}</li>
 *   <li>{@link smart_nursing_home.Room#getLight <em>Light</em>}</li>
 *   <li>{@link smart_nursing_home.Room#getHeater <em>Heater</em>}</li>
 *   <li>{@link smart_nursing_home.Room#getHumidifier <em>Humidifier</em>}</li>
 *   <li>{@link smart_nursing_home.Room#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link smart_nursing_home.Room#getHumidity <em>Humidity</em>}</li>
 *   <li>{@link smart_nursing_home.Room#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link smart_nursing_home.Room#getPerson <em>Person</em>}</li>
 *   <li>{@link smart_nursing_home.Room#getRoomba <em>Roomba</em>}</li>
 *   <li>{@link smart_nursing_home.Room#getCleanness <em>Cleanness</em>}</li>
 * </ul>
 *
 * @see smart_nursing_home.Smart_nursing_homePackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends Clazz {
	/**
	 * Returns the value of the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window</em>' reference.
	 * @see #setWindow(Window)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getRoom_Window()
	 * @model
	 * @generated
	 */
	Window getWindow();

	/**
	 * Sets the value of the '{@link smart_nursing_home.Room#getWindow <em>Window</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window</em>' reference.
	 * @see #getWindow()
	 * @generated
	 */
	void setWindow(Window value);

	/**
	 * Returns the value of the '<em><b>Light</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' reference.
	 * @see #setLight(Light)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getRoom_Light()
	 * @model
	 * @generated
	 */
	Light getLight();

	/**
	 * Sets the value of the '{@link smart_nursing_home.Room#getLight <em>Light</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' reference.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(Light value);

	/**
	 * Returns the value of the '<em><b>Humidifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Humidifier</em>' reference.
	 * @see #setHumidifier(Humidifier)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getRoom_Humidifier()
	 * @model
	 * @generated
	 */
	Humidifier getHumidifier();

	/**
	 * Sets the value of the '{@link smart_nursing_home.Room#getHumidifier <em>Humidifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Humidifier</em>' reference.
	 * @see #getHumidifier()
	 * @generated
	 */
	void setHumidifier(Humidifier value);

	/**
	 * Returns the value of the '<em><b>Heater</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heater</em>' reference.
	 * @see #setHeater(Heater)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getRoom_Heater()
	 * @model
	 * @generated
	 */
	Heater getHeater();

	/**
	 * Sets the value of the '{@link smart_nursing_home.Room#getHeater <em>Heater</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heater</em>' reference.
	 * @see #getHeater()
	 * @generated
	 */
	void setHeater(Heater value);

	/**
	 * Returns the value of the '<em><b>Brightness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brightness</em>' reference.
	 * @see #setBrightness(Brightness)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getRoom_Brightness()
	 * @model
	 * @generated
	 */
	Brightness getBrightness();

	/**
	 * Sets the value of the '{@link smart_nursing_home.Room#getBrightness <em>Brightness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brightness</em>' reference.
	 * @see #getBrightness()
	 * @generated
	 */
	void setBrightness(Brightness value);

	/**
	 * Returns the value of the '<em><b>Humidity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Humidity</em>' reference.
	 * @see #setHumidity(Humidity)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getRoom_Humidity()
	 * @model
	 * @generated
	 */
	Humidity getHumidity();

	/**
	 * Sets the value of the '{@link smart_nursing_home.Room#getHumidity <em>Humidity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Humidity</em>' reference.
	 * @see #getHumidity()
	 * @generated
	 */
	void setHumidity(Humidity value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' reference.
	 * @see #setTemperature(Temperature)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getRoom_Temperature()
	 * @model
	 * @generated
	 */
	Temperature getTemperature();

	/**
	 * Sets the value of the '{@link smart_nursing_home.Room#getTemperature <em>Temperature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' reference.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(Temperature value);

	/**
	 * Returns the value of the '<em><b>Door</b></em>' reference list.
	 * The list contents are of type {@link smart_nursing_home.Door}.
	 * It is bidirectional and its opposite is '{@link smart_nursing_home.Door#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door</em>' reference list.
	 * @see smart_nursing_home.Smart_nursing_homePackage#getRoom_Door()
	 * @see smart_nursing_home.Door#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	EList<Door> getDoor();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference list.
	 * The list contents are of type {@link smart_nursing_home.Person}.
	 * It is bidirectional and its opposite is '{@link smart_nursing_home.Person#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference list.
	 * @see smart_nursing_home.Smart_nursing_homePackage#getRoom_Person()
	 * @see smart_nursing_home.Person#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	EList<Person> getPerson();

	/**
	 * Returns the value of the '<em><b>Roomba</b></em>' reference list.
	 * The list contents are of type {@link smart_nursing_home.Roomba}.
	 * It is bidirectional and its opposite is '{@link smart_nursing_home.Roomba#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomba</em>' reference list.
	 * @see smart_nursing_home.Smart_nursing_homePackage#getRoom_Roomba()
	 * @see smart_nursing_home.Roomba#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	EList<Roomba> getRoomba();

	/**
	 * Returns the value of the '<em><b>Cleanness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cleanness</em>' reference.
	 * @see #setCleanness(Cleanness)
	 * @see smart_nursing_home.Smart_nursing_homePackage#getRoom_Cleanness()
	 * @model
	 * @generated
	 */
	Cleanness getCleanness();

	/**
	 * Sets the value of the '{@link smart_nursing_home.Room#getCleanness <em>Cleanness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleanness</em>' reference.
	 * @see #getCleanness()
	 * @generated
	 */
	void setCleanness(Cleanness value);

} // Room
