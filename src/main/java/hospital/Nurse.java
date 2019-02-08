package hospital;

import java.util.HashMap;

public class Nurse extends Employee {

	private int pay;
	HashMap<String, Patient> patients = new HashMap<String, Patient>();
	
	public Nurse(String name, int id) {
		super(name, id);
		this.pay = 50000;
	}

	public HashMap<String, Patient> getPatients() {
		return patients;
	}
	
	
	@Override
	public int calculatePay() {
		return pay;
	}

	public void addPatient(Patient patient) {
		patients.put(patient.getName(), patient);
	}

	public int getPatientsSize() {
		return patients.size();
	}

}
