package jpl.ch02.ex09;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {

	@Test
	public void MaxId_Test01() {
		assertEquals(0, Vehicle.maxID());

		Vehicle vh1 = new Vehicle("Taxi Driver");
		assertEquals("Taxi Driver", vh1.name);
		assertEquals(0, Vehicle.maxID());

		Vehicle vh2 = new Vehicle("Bus Driver");
		assertEquals("Bus Driver", vh2.name);
		assertEquals(1, Vehicle.maxID());
	}
}
