package employee;

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
	
	public HashMap<String, Patient> getPatients() {
		return patients;
	}

	public void addPatient(Patient patient) {
		patients.put(patient.getName(), patient);
	}

	public int getPatientsSize() {
		return patients.size();
	}

	public Patient getSinglePatient(String name) {
		return patients.get(name);
	}
	
	@Override
	public String toString() {
		return "Receptionist " + getName() + " " + getId();
	}
}
