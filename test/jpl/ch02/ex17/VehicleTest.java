package jpl.ch02.ex17;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTest {

	private static Vehicle vehicle;
	private static final double prec = 1.0e-8;

	@Before
	public void setUp() throws Exception {
		vehicle = new Vehicle();
	}

	@Test
	public void turn_Test01() {
		vehicle.turn(300.0);
		assertEquals(vehicle.getDirection(), 300.0, prec);
	}

	@Test
	public void turn_Test02() {
		vehicle.setDirection(100.0);
		vehicle.turn(1000.0);
		assertEquals(vehicle.getDirection(), 20.0, prec);
	}

	@Test
	public void turn_Test03() {
		vehicle.turn(1);
		vehicle.turn(300.0);
		assertEquals(vehicle.getDirection(), 60.0, prec);
	}

	@Test
	public void turn_Test04() {
		vehicle.setDirection(90.0);
		vehicle.turn(1);
		vehicle.turn(300.0);
		assertEquals(vehicle.getDirection(), 150.0, prec);
	}
	@Test
	public void turn_Test05() {
		vehicle.turn(1);
		vehicle.turn(1000.0);
		assertEquals(vehicle.getDirection(), 80.0, prec);
	}

}