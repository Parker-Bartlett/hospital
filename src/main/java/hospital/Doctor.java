package hospital;

public class Doctor extends Employee {

	private String specialty;
	private int pay;

	public Doctor(String name, int id, String specialty) {
		super(name, id);
		this.specialty = specialty;
		this.pay = 90000;
	}

	public String getSpecialty() {
		return specialty;
	}

	@Override
	public int calculatePay() {
		return pay;
	}

}
