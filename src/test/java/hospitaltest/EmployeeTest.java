package hospitaltest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hospital.Employee;

public class EmployeeTest {

	Employee e;
	@Before
	public void setup() {
		e = new Employee("Parker", 1234);
	}
	
	@Test
	public void employeeShouldHaveAName() {
		String name = e.getName();
		assertEquals("Parker", name);
	}
	
	@Test
	public void employeeShouldHaveAIDNumber() {
		int id = e.getId();
		assertEquals(1234, id);
	}
}
