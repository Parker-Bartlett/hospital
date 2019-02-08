package hospitaltest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hospital.Doctor;

public class EmployeeTest {

	Doctor d;
	@Before
	public void setup() {
		d = new Doctor("Parker", 1234, null);
	}
	
	@Test
	public void employeeShouldHaveAName() {
		String name = d.getName();
		assertEquals("Parker", name);
	}
	
	@Test
	public void employeeShouldHaveAIDNumber() {
		int id = d.getId();
		assertEquals(1234, id);
	}
	
	@Test
	public void shouldHaveAbstractCalculatePay() {
		//should have abstract method called calculatePay();
	}
}
