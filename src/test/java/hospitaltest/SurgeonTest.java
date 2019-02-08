package hospitaltest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import hospital.Surgeon;

public class SurgeonTest {

	Surgeon s;
	@Before
	public void setup() {
		s = new Surgeon("Parker", 1234);
	}	
	
	@Test
	public void shouldBeInOrOutOfOperation() {
		boolean isOperating = s.getIsOperating();
		
		assertEquals(isOperating, false);
	}
	
	@Test
	public void shouldBeAbleToToggleIsOperating() {
		s.toggleIsOperating();
		boolean shouldBeTrue = s.getIsOperating();
		assertEquals(shouldBeTrue, true);
	}
}
