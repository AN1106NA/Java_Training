package jpl.ch02.ex18;

public class Vehicle {
	public final int TURN_LEFT = 1;
	public final int TURN_RIGHT = -1;
	private double speed;
	private double direction;
	private String name;

	private static long nextID = 0;
	private final long selfID;

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			Vehicle car = new Vehicle(args[i]);
			System.out.println(car.toString());
		}
	}

	public void changeSpeed(double a_speed) {
		speed = a_speed;
	}

	public void stop() {
		speed = 0;
	}

	public void turn(double a_direction) {
		direction += a_direction;
	}

	public void turn(int A) {
		if (A == this.TURN_LEFT || A == this.TURN_RIGHT) {
			direction += A * Math.PI / 4;
		}
	}

	public String toString() {
		return selfID + " (" + name + ")" + "\n" + "speed = " + speed + "\n" + "direction = " + direction;
	}

	public Vehicle() {
		selfID = nextID++;
	}

	public Vehicle(String a_name) {
		this();
		name = a_name;
	}

	public double getspeed() {
		return speed;
	}

	public double getdirection() {
		return direction;
	}

	public String getname() {
		return name;
	}

	public void setspeed(double a_speed) {
		speed = a_speed;
	}

	public void setdirection(double a_direction) {
		direction = a_direction;
	}

	public void setname(String a_name) {
		name = a_name;
	}

	public long getID() {
		return selfID;
	}
}