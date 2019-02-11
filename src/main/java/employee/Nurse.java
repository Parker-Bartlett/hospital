package employee;

import patient.Patient;

public class Nurse extends Employee implements IInteractWithPatient{

	private int pay;
	
	public Nurse(String name, int id) {
		super(name, id);
		this.pay = 50000;
	}
	
	@Override
	public int calculatePay() {
		return pay;
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.bloodDrawnFromNurse();
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.careFromNurse();
	}

	@Override
	public String toString() {
		return "Nurse " + getName() + " " + getId() + " ";
	}
}
