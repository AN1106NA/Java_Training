package jpl.ch02.ex13;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {

	private String expected;

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
		public void AccessMethod_Test() {
			Vehicle vh1 = new Vehicle("Taxi Driver");
			vh1.setDirection(120);
			vh1.setSpeed(80);
			expected = getExpected_Result(vh1.getIdNum(), vh1.getDirection(), vh1.getSpeed(), vh1.getName());
			assertEquals(expected, vh1.toString());
	}
}
