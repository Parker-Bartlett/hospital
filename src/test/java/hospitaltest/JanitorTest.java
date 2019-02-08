package hospitaltest;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import employee.Janitor;

public class JanitorTest {
	
	Janitor j;
	@Before
	public void setup() {
		j = new Janitor("Parker", 1234);
	}
	@Test
	public void shouldBeAbleToSweep() {
		boolean beforeSweeping = j.isSweeping;
		j.toggleSweepinng();
		boolean afterSweeping = j.isSweeping;
		assertEquals(beforeSweeping, !afterSweeping);
		
	}

}
