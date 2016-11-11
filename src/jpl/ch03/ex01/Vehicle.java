package jpl.ch03.ex01;

/**
 * 2章のVehicleクラス.
 * @author Anna.S
 */
public class Vehicle {
	private double speed;
	private double direction;
	private String driver;

	private static long nextID = 0;
	private final long idNum;

	static final int TURN_LEFT = 0;
	static final int TURN_RIGHT = 1;
	private int way = 1;

	public Vehicle() {
		idNum = nextID++;
	}

	public Vehicle(String driver, double speed, double direction) {
		this();
		this.driver = driver;
		this.speed = speed;
		this.direction = direction;
	}

	public double getSpeed() {
		return speed;
	}

	public double getDirection() {
		return direction;
	}

	public String getDriver() {
		return driver;
	}

	public long getIdNum() {
		return idNum;
	}

	/** 回転する角度を取得.*/
	public void turn(double direction) {
		if (way == TURN_LEFT)
			this.direction -= direction + 180;
		if (way == TURN_RIGHT)
			this.direction += direction;
		while (direction >= 360) {
			this.direction = direction - 360;
		}
	}

	/** 通常は右回り.*/
	public void turn(int turnWay) {
		this.way = turnWay;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID = ");
		sb.append(idNum);
		sb.append(", Driver = :");
		sb.append(driver);
		sb.append(", speed = ");
		sb.append(speed);
		sb.append(", direction = ");
		sb.append(direction);
		return sb.toString();
	}
}