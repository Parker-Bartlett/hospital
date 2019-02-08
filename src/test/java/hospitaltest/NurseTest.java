package hospitaltest;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import employee.Nurse;
import employee.Receptionist;
import patient.Patient;

public class NurseTest {

	Receptionist recep;

	@Before
	public void setupReceptionist() {
		recep = new Receptionist("Amy", 4567);
	}

	Patient patient;

	@Before
	public void setupPatient() {
		patient = new Patient("Doug");
	}

	Nurse nurse;

	@Before
	public void setup() {
		nurse = new Nurse("Parker", 1234);
	}

	@Test
	public void shouldBeAbleToDrawBlood() {
		recep.addPatient(patient);
		Patient patientUnderTest = new Patient("Dylan");
		recep.addPatient(patientUnderTest);
		nurse.drawBlood(patientUnderTest);
		assertEquals(patient.getBloodLevel() - 5, patientUnderTest.getBloodLevel());
	}
	
	@Test
	public void shouldBeAbleToCareForPatient() {
		recep.addPatient(patient);
		Patient patientUnderTest = new Patient("Dylan");
		recep.addPatient(patientUnderTest);
		nurse.careForPatient(patientUnderTest);
		assertEquals(patient.getHealthLevel() + 5, patientUnderTest.getHealthLevel());
	}
}
