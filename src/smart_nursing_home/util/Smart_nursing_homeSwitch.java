/**
 */
package smart_nursing_home.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import smart_nursing_home.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see smart_nursing_home.Smart_nursing_homePackage
 * @generated
 */
public class Smart_nursing_homeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Smart_nursing_homePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Smart_nursing_homeSwitch() {
		if (modelPackage == null) {
			modelPackage = Smart_nursing_homePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Smart_nursing_homePackage.SMART_NURSING_HOME: {
				SmartNursingHome smartNursingHome = (SmartNursingHome)theEObject;
				T result = caseSmartNursingHome(smartNursingHome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.CLAZZ: {
				Clazz clazz = (Clazz)theEObject;
				T result = caseClazz(clazz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.ROOM: {
				Room room = (Room)theEObject;
				T result = caseRoom(room);
				if (result == null) result = caseClazz(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.DOOR: {
				Door door = (Door)theEObject;
				T result = caseDoor(door);
				if (result == null) result = caseClazz(door);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.WINDOW: {
				Window window = (Window)theEObject;
				T result = caseWindow(window);
				if (result == null) result = caseClazz(window);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.HEATER: {
				Heater heater = (Heater)theEObject;
				T result = caseHeater(heater);
				if (result == null) result = caseClazz(heater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.LIGHT: {
				Light light = (Light)theEObject;
				T result = caseLight(light);
				if (result == null) result = caseClazz(light);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.HUMIDIFIER: {
				Humidifier humidifier = (Humidifier)theEObject;
				T result = caseHumidifier(humidifier);
				if (result == null) result = caseClazz(humidifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.BRIGHTNESS: {
				Brightness brightness = (Brightness)theEObject;
				T result = caseBrightness(brightness);
				if (result == null) result = caseClazz(brightness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.HUMIDITY: {
				Humidity humidity = (Humidity)theEObject;
				T result = caseHumidity(humidity);
				if (result == null) result = caseClazz(humidity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.TEMPERATURE: {
				Temperature temperature = (Temperature)theEObject;
				T result = caseTemperature(temperature);
				if (result == null) result = caseClazz(temperature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseClazz(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.CARE_WORKER: {
				CareWorker careWorker = (CareWorker)theEObject;
				T result = caseCareWorker(careWorker);
				if (result == null) result = casePerson(careWorker);
				if (result == null) result = caseClazz(careWorker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.ELDER: {
				Elder elder = (Elder)theEObject;
				T result = caseElder(elder);
				if (result == null) result = casePerson(elder);
				if (result == null) result = caseClazz(elder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.DISEASE: {
				Disease disease = (Disease)theEObject;
				T result = caseDisease(disease);
				if (result == null) result = caseClazz(disease);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.DIABETES: {
				Diabetes diabetes = (Diabetes)theEObject;
				T result = caseDiabetes(diabetes);
				if (result == null) result = caseDisease(diabetes);
				if (result == null) result = caseClazz(diabetes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.HEART_ATTACK: {
				HeartAttack heartAttack = (HeartAttack)theEObject;
				T result = caseHeartAttack(heartAttack);
				if (result == null) result = caseDisease(heartAttack);
				if (result == null) result = caseClazz(heartAttack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.MEDICINE: {
				Medicine medicine = (Medicine)theEObject;
				T result = caseMedicine(medicine);
				if (result == null) result = caseClazz(medicine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.CHECKING_ROOM: {
				CheckingRoom checkingRoom = (CheckingRoom)theEObject;
				T result = caseCheckingRoom(checkingRoom);
				if (result == null) result = caseRoom(checkingRoom);
				if (result == null) result = caseClazz(checkingRoom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.BATHING_ROOM: {
				BathingRoom bathingRoom = (BathingRoom)theEObject;
				T result = caseBathingRoom(bathingRoom);
				if (result == null) result = caseRoom(bathingRoom);
				if (result == null) result = caseClazz(bathingRoom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.PHARMACY: {
				Pharmacy pharmacy = (Pharmacy)theEObject;
				T result = casePharmacy(pharmacy);
				if (result == null) result = caseRoom(pharmacy);
				if (result == null) result = caseClazz(pharmacy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.ROOMBA: {
				Roomba roomba = (Roomba)theEObject;
				T result = caseRoomba(roomba);
				if (result == null) result = caseClazz(roomba);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Smart_nursing_homePackage.CLEANNESS: {
				Cleanness cleanness = (Cleanness)theEObject;
				T result = caseCleanness(cleanness);
				if (result == null) result = caseClazz(cleanness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smart Nursing Home</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smart Nursing Home</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmartNursingHome(SmartNursingHome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clazz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clazz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClazz(Clazz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoor(Door object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindow(Window object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeater(Heater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLight(Light object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Humidifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Humidifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumidifier(Humidifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Brightness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Brightness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrightness(Brightness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Humidity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Humidity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHumidity(Humidity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temperature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemperature(Temperature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Worker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Worker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCareWorker(CareWorker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElder(Elder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disease</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disease</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisease(Disease object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diabetes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diabetes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiabetes(Diabetes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heart Attack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heart Attack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeartAttack(HeartAttack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicine(Medicine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checking Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checking Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckingRoom(CheckingRoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bathing Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bathing Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBathingRoom(BathingRoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pharmacy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pharmacy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePharmacy(Pharmacy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roomba</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roomba</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomba(Roomba object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cleanness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cleanness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCleanness(Cleanness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Smart_nursing_homeSwitch
