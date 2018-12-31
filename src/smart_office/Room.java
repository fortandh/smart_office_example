/**
 */
package smart_office;

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
 *   <li>{@link smart_office.Room#getDoor <em>Door</em>}</li>
 *   <li>{@link smart_office.Room#getWindow <em>Window</em>}</li>
 *   <li>{@link smart_office.Room#getHeater <em>Heater</em>}</li>
 *   <li>{@link smart_office.Room#getLight <em>Light</em>}</li>
 *   <li>{@link smart_office.Room#getRoomba <em>Roomba</em>}</li>
 *   <li>{@link smart_office.Room#getSecretary <em>Secretary</em>}</li>
 *   <li>{@link smart_office.Room#getAgent <em>Agent</em>}</li>
 *   <li>{@link smart_office.Room#getPrinter <em>Printer</em>}</li>
 *   <li>{@link smart_office.Room#getServer <em>Server</em>}</li>
 *   <li>{@link smart_office.Room#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link smart_office.Room#getCleanness <em>Cleanness</em>}</li>
 *   <li>{@link smart_office.Room#getTemperature <em>Temperature</em>}</li>
 * </ul>
 *
 * @see smart_office.Smart_officePackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends Clazz {
	/**
	 * Returns the value of the '<em><b>Door</b></em>' reference list.
	 * The list contents are of type {@link smart_office.Door}.
	 * It is bidirectional and its opposite is '{@link smart_office.Door#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Door</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door</em>' reference list.
	 * @see smart_office.Smart_officePackage#getRoom_Door()
	 * @see smart_office.Door#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	EList<Door> getDoor();

	/**
	 * Returns the value of the '<em><b>Window</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smart_office.Window#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window</em>' reference.
	 * @see #setWindow(Window)
	 * @see smart_office.Smart_officePackage#getRoom_Window()
	 * @see smart_office.Window#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	Window getWindow();

	/**
	 * Sets the value of the '{@link smart_office.Room#getWindow <em>Window</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window</em>' reference.
	 * @see #getWindow()
	 * @generated
	 */
	void setWindow(Window value);

	/**
	 * Returns the value of the '<em><b>Heater</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smart_office.Heater#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heater</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heater</em>' reference.
	 * @see #setHeater(Heater)
	 * @see smart_office.Smart_officePackage#getRoom_Heater()
	 * @see smart_office.Heater#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	Heater getHeater();

	/**
	 * Sets the value of the '{@link smart_office.Room#getHeater <em>Heater</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heater</em>' reference.
	 * @see #getHeater()
	 * @generated
	 */
	void setHeater(Heater value);

	/**
	 * Returns the value of the '<em><b>Light</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link smart_office.Light#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' reference.
	 * @see #setLight(Light)
	 * @see smart_office.Smart_officePackage#getRoom_Light()
	 * @see smart_office.Light#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	Light getLight();

	/**
	 * Sets the value of the '{@link smart_office.Room#getLight <em>Light</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' reference.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(Light value);

	/**
	 * Returns the value of the '<em><b>Roomba</b></em>' reference list.
	 * The list contents are of type {@link smart_office.Roomba}.
	 * It is bidirectional and its opposite is '{@link smart_office.Roomba#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomba</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomba</em>' reference list.
	 * @see smart_office.Smart_officePackage#getRoom_Roomba()
	 * @see smart_office.Roomba#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	EList<Roomba> getRoomba();

	/**
	 * Returns the value of the '<em><b>Secretary</b></em>' reference list.
	 * The list contents are of type {@link smart_office.Secretary}.
	 * It is bidirectional and its opposite is '{@link smart_office.Secretary#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secretary</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secretary</em>' reference list.
	 * @see smart_office.Smart_officePackage#getRoom_Secretary()
	 * @see smart_office.Secretary#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	EList<Secretary> getSecretary();

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' reference list.
	 * The list contents are of type {@link smart_office.Agent}.
	 * It is bidirectional and its opposite is '{@link smart_office.Agent#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' reference list.
	 * @see smart_office.Smart_officePackage#getRoom_Agent()
	 * @see smart_office.Agent#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	EList<Agent> getAgent();

	/**
	 * Returns the value of the '<em><b>Printer</b></em>' reference list.
	 * The list contents are of type {@link smart_office.Printer}.
	 * It is bidirectional and its opposite is '{@link smart_office.Printer#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printer</em>' reference list.
	 * @see smart_office.Smart_officePackage#getRoom_Printer()
	 * @see smart_office.Printer#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	EList<Printer> getPrinter();

	/**
	 * Returns the value of the '<em><b>Server</b></em>' reference list.
	 * The list contents are of type {@link smart_office.Server}.
	 * It is bidirectional and its opposite is '{@link smart_office.Server#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference list.
	 * @see smart_office.Smart_officePackage#getRoom_Server()
	 * @see smart_office.Server#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	EList<Server> getServer();

	/**
	 * Returns the value of the '<em><b>Brightness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brightness</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brightness</em>' reference.
	 * @see #setBrightness(Brightness)
	 * @see smart_office.Smart_officePackage#getRoom_Brightness()
	 * @model
	 * @generated
	 */
	Brightness getBrightness();

	/**
	 * Sets the value of the '{@link smart_office.Room#getBrightness <em>Brightness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brightness</em>' reference.
	 * @see #getBrightness()
	 * @generated
	 */
	void setBrightness(Brightness value);

	/**
	 * Returns the value of the '<em><b>Cleanness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cleanness</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cleanness</em>' reference.
	 * @see #setCleanness(Cleanness)
	 * @see smart_office.Smart_officePackage#getRoom_Cleanness()
	 * @model
	 * @generated
	 */
	Cleanness getCleanness();

	/**
	 * Sets the value of the '{@link smart_office.Room#getCleanness <em>Cleanness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleanness</em>' reference.
	 * @see #getCleanness()
	 * @generated
	 */
	void setCleanness(Cleanness value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' reference.
	 * @see #setTemperature(Temperature)
	 * @see smart_office.Smart_officePackage#getRoom_Temperature()
	 * @model
	 * @generated
	 */
	Temperature getTemperature();

	/**
	 * Sets the value of the '{@link smart_office.Room#getTemperature <em>Temperature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' reference.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(Temperature value);

} // Room
