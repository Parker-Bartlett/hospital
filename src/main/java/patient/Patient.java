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
	
	public String tick() {
		String returnStatement = "\n";
		bloodLevel -= 1;
		healthLevel -= 2;
		if (bloodLevel <= 0) {
			bloodLevel = 0;
			healthLevel -= 5;
			returnStatement += name + "Is out of blood, and loosing health quickly! Act soon or risk their death.";
		}
		if (healthLevel <= 0) {
			healthLevel = 0;
			returnStatement += name + " has died...";
		} 
		return returnStatement;
	}

	public void bloodDrawnFromDoctor() {
		bloodLevel -= 5;
		healthLevel += 5;
	}

	public void careFromDoctor() {
		healthLevel += 10;
		bloodLevel += 1;
	}

	public void bloodDrawnFromSurgeon() {
		bloodLevel -= 10;
		healthLevel += 5;
	}

	public void careFromSurgeon() {
		healthLevel += 15;
		bloodLevel += 5;
	}

	public void bloodDrawnFromNurse() {
		bloodLevel -= 5;
		healthLevel += 10;
	}

	public void careFromNurse() {
		healthLevel += 5;
	}
	
	@Override
	public String toString() {
		return "Patient Name: " +name+ " Blood Level: " +bloodLevel+ " Health level: " +healthLevel;
	}


}
