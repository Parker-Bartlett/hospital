package hospitaltest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import patient.Patient;

public class PatientTest {
	
	Patient patient;
	
	@Before
	public void seteup() {
		patient = new Patient("Billy");
	}
	
	@Test
	public void shouldTick() {
		int healthBeforeTick = patient.getHealthLevel();
		patient.tick();
		int healthAfterTick = patient.getHealthLevel();
		assertEquals(healthBeforeTick - 2, healthAfterTick);
	}
}
