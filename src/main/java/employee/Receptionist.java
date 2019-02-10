package employee;

import java.util.Collection;
import java.util.HashMap;

import patient.Patient;

public class Receptionist extends Employee {

	private int pay;

	HashMap<String, Patient> patients = new HashMap<String, Patient>();
	
	public Receptionist(String name, int id) {
		super(name, id);
		this.pay = 45000;
	}

	@Override
	public int calculatePay() {
		return pay;
	}
	
	public Collection<Patient> getPatients() {
		return patients.values();
	}

	public void addPatient(Patient patient) {
		patients.put(patient.getName(), patient);
	}

	public void releasePatient(String patientToRelease) {
		patients.remove(patientToRelease);
	}

	public int getPatientsSize() {
		return patients.size();
	}

	public void tickAll() {
		for (Patient patient : patients.values()) {
			patient.tick();
			if (patient.getHealthLevel() <= 0) {
				patients.remove(patient.getName());
			}
		}
	}

	public Patient getSinglePatient(String name) {
		return patients.get(name);
	}
	
	@Override
	public String toString() {
		return "Receptionist " + getName() + " " + getId();
	}


}
