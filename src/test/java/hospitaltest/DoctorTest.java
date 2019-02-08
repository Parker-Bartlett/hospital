package hospitaltest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hospital.Doctor;

public class DoctorTest {

	Doctor d;
	@Before
	public void setup() {
		d = new Doctor("Parker", 1234, "Brain");
	}
	
	@Test
	public void doctorShouldHaveSpecialty() {
		String specialty = d.getSpecialty();
		assertEquals(specialty, "Brain");
	}
}
