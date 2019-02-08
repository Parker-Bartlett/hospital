package hospitaltest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import employee.Receptionist;
import patient.Patient;

public class ReceptionistTest {

	Patient p = new Patient("Doug");
	
	Receptionist recep;
	@Before
	public void setup() {
		recep = new Receptionist("Amy", 1234);
	}
	
	@Test
	public void shouldHaveHashMapOfPatients() {
		int firstSize = recep.getPatientsSize();
		recep.addPatient(p);
		int secondSize = recep.getPatientsSize();
		assertEquals(firstSize + 1, secondSize);
	}
}
