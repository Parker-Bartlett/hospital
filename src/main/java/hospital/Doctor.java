package hospital;

public class Doctor extends Employee {

	private String specialty;

	public Doctor(String name, int id, String specialty) {
		super(name, id);
		this.specialty = specialty;
	}

	public String getSpecialty() {
		return specialty;
	}

}
