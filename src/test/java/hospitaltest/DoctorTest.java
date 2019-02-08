package hospitaltest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import employee.Surgeon;

public class DoctorTest {

	Surgeon s;
	@Before
	public void setup() {
		s = new Surgeon("Parker", 1234, "heart");
	}
	
	@Test
	public void doctorShouldHaveSpecialty() {
		String specialty = s.getSpecialty();
		assertEquals(specialty, "Brain");
	}
}
