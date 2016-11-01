package jpl.ch01.ex08;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
	Point p1, p2;

	@Before
	public void setUp() throws Exception {
		p1 = new Point();
		p2 = new Point();

		double x = 1.0;
		double y = 2.0;
		p2.move(x, y);
	}

	@Test
	public void setPoint_Test() {
		p1.setPoint(p2);
		assertEquals(p1.x, p2.x, 1.0e-1); //deprecationの警告をなくす.
		assertEquals(p1.y, p2.y, 1.0e-1);
	}
}
