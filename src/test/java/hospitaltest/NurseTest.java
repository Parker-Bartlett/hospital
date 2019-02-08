package hospitaltest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import employee.Nurse;
import patient.Patient;

public class NurseTest {
	
	Patient p = new Patient("Parker");
	
	Nurse n;
	@Before
	public void setup() {
		n = new Nurse("Parker", 1234);
	}
	
	@Test
	public void shouldHaveHashMapOfPatients() {
		int firstSize = n.getPatientsSize();
		n.addPatient(p);
		int secondSize = n.getPatientsSize();
		assertEquals(firstSize + 1, secondSize);
	}
}
