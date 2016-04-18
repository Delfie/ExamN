package mid16n;

import static org.junit.Assert.*;

import org.junit.Test;

public class GradeTest {

	@Test
	public void testAvg() {
		Grade g = new Grade();
		g.setc1(80);
		g.setc2(80);
		g.setc3(80);
		assertEquals(80, g.avg());
	}
}
