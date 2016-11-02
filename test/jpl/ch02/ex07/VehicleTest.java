package jpl.ch02.ex07;

import static org.junit.Assert.*;

import org.junit.Test;

import jpl.ch02.ex09.Vehicle;

public class VehicleTest {

	@Test
	public void コンストラクタ_Test01() {
		Vehicle vh1 = new Vehicle("Taxi Driver");
		assertEquals("Taxi Driver", vh1.name);

		Vehicle vh2 = new Vehicle("Bus Driver");
		assertEquals("Bus Driver", vh2.name);
	}
}
