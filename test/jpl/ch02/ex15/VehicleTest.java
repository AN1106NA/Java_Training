package jpl.ch02.ex15;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {
	private String expected = null;

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
		sb.append(", MaxID:");
		sb.append(Vehicle.maxID());
		sb.append("]");
		return sb.toString();
	}

	@Test
	public void ChangeSpeedMethod_Test() {
		Vehicle vh1 = new Vehicle("Bus Driver");
		vh1.setDirection(100);
		vh1.setSpeed(150);
		vh1.changeSpeed(100);
		expected = getExpected_Result(0, 100, 100.0, "Bus Driver");
		assertEquals(expected, vh1.toString());
	}

	@Test
	public void StopMethod_Test() {
		Vehicle vh1 = new Vehicle("Taxi Driver");
		vh1.setDirection(120);
		vh1.setSpeed(80);
		vh1.stop();
		expected = getExpected_Result(1, 120, 0.0, "Taxi Driver");
		assertEquals(expected, vh1.toString());
	}

}
