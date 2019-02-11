package hospitaltest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import employee.Doctor;
import employee.Surgeon;

public class DoctorTest {
	
	Doctor doctor;
	@Before
	public void setup() {
		doctor = new Doctor("Parker", 1234, "heart");
	}
	
	
	
	@Test
	public void doctorShouldHaveSpecialty() {
		String specialty = doctor.getSpecialty();
		assertEquals(specialty, "Brain");
	}
	
	@Test
	public void shouldBeAbleToDrawBlood() {
		
	}
}
