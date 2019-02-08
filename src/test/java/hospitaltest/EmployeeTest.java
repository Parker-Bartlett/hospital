package hospitaltest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import employee.Surgeon;

public class EmployeeTest {

	Surgeon s;
	@Before
	public void setup() {
		s = new Surgeon("Parker", 1234, "heart");
	}
	
	@Test
	public void employeeShouldHaveAName() {
		String name = s.getName();
		assertEquals("Parker", name);
	}
	
	@Test
	public void employeeShouldHaveAIDNumber() {
		int id = s.getId();
		assertEquals(1234, id);
	}
	
	@Test
	public void shouldHaveAbstractCalculatePay() {
		//should have abstract method called calculatePay();
	}
}
