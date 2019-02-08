package patient;

public class Patient implements IPatientStatistics{

	private String name;
	private int bloodLevel;
	private int healthLevel;
	
	public Patient(String name) {
		this.name = name;
		this.bloodLevel = BLOOD_LEVEL;
		this.healthLevel = HEALTH_LEVEL;
	}
	
	public String getName() {
		return name;
	}

	public int getBloodLevel() {
		return bloodLevel;
	}
	
	public int getHealthLevel() {
		return healthLevel;
	}

	public void bloodDrawnFromDoctor() {
		bloodLevel -= 5;
		healthLevel += 5;
	}

	public void careFromDoctor() {
		healthLevel += 10;
	}

	public void bloodDrawnFromSurgeon() {
		bloodLevel -= 10;
		healthLevel += 5;
	}

	public void careFromSurgeon() {
		healthLevel += 15;
	}

	public void bloodDrawnFromNurse() {
		bloodLevel -= 5;
		healthLevel += 10;
	}

	public void careFromNurse() {
		healthLevel += 5;
	}


}
