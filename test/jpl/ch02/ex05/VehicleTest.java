package jpl.ch02.ex05;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {

	@Test
	public void Vehicle_Test() {
		Vehicle taxi = new Vehicle();
		taxi.setName("taxiDriver");
		taxi.setSpeed(100);
		taxi.setDirection(120);

		assertEquals(0, taxi.getIdNum());
		assertEquals(100, taxi.getSpeed(), 1);
		assertEquals(120, taxi.getDirection(), 1);
		assertEquals("taxiDriver", taxi.getName());
	}
}
