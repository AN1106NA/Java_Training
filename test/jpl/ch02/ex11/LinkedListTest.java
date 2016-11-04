package jpl.ch02.ex11;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {
	@Test
	public void testToString() {
		Vehicle car = new Vehicle("Car Drive");
		car.speed = 100;
		car.direction = 90;
		Vehicle taxi = new Vehicle("Taxi Driver");
		taxi.speed = 120;
		taxi.direction = 180;

		LinkedList list1 = new LinkedList(car, null);
		LinkedList list2 = new LinkedList(taxi, list1);
		String expected = "Vehicle[ID:1, speed:120.0, direction:180.0, name:Taxi Driver, MaxId:1]Vehicle[ID:0, speed:100.0, direction:90.0, name:Car Drive, MaxId:1]";
		assertEquals(expected, list2.toString());
	}
}
