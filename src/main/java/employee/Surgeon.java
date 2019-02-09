package employee;

import patient.Patient;

public class Surgeon extends Employee implements IInteractWithPatient {

	private boolean isOperating;
	private int pay;
	private String specialty;

	public Surgeon(String name, int id, String specialty) {
		super(name, id);
		this.isOperating = false;
		this.pay = 120000;
		this.specialty = specialty;
	}

	public String getSpecialty() {
		return specialty;
	}

	public boolean getIsOperating() {
		return isOperating;
	}

	public void toggleIsOperating() {
		isOperating = !isOperating;
	}

	@Override
	public int calculatePay() {
		return pay;
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.bloodDrawnFromSurgeon();
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.careFromSurgeon();
	}

	@Override
	public String toString() {
		return "Surgeon " + getName() + " " + getId() + " " + specialty + " " +isOperating;
	}

}
