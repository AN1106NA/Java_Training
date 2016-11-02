package jpl.ch02.ex10;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {
	String expected = null;

	/** 期待値をセットする.*/
	private String getExpected_Result(long idNum, double direction, double speed, String name) {
		StringBuilder sb = new StringBuilder();
		sb.append("Vehicle[ID:");
		sb.append(idNum);
		sb.append(", speed:");
		sb.append(speed);
		sb.append(", direction:");
		sb.append(direction);
		sb.append(", name:");
		sb.append(name);
		sb.append(", MaxId:");
		sb.append(Vehicle.maxID());
		sb.append("]");
		return sb.toString();
	}

	@Test
	public void toString_Test() {
		Vehicle vh1 = new Vehicle("Taxi Driver");
		vh1.direction = 120;
		vh1.speed = 80;
		expected = getExpected_Result(vh1.idNum, vh1.direction, vh1.speed, vh1.name);
		assertEquals(expected, vh1.toString());
	}
}
