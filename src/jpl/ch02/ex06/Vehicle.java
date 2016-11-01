package jpl.ch02.ex06;

/**
 *  次の乗り物の識別番号を保持するstaticフィールドと、<br/>
 *  車単位でID番号を保持するための非staticフィールドを<br/>
 *  Vehicleクラスに追加する.<br/>
 * @author Anna.S
 *
 */
public class Vehicle {
	private double speed;
	private double direction;
	private String name;

	private static long nextID = 0;
	private final long idNum;

	public Vehicle() {
		idNum = nextID++;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getDirection() {
		return direction;
	}

	public void setDirection(double direction) {
		this.direction = direction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getIdNum() {
		return idNum;
	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		Vehicle taxi = new Vehicle();

		car.speed = 80;
		car.direction = 15;
		car.name = "Car Driver";

		taxi.speed = 50;
		taxi.direction = 180;
		taxi.name = "Taxy Driver";

		System.out.println("ID: " + car.idNum);
		System.out.println("speed: " + car.speed);
		System.out.println("direction: " + car.direction);
		System.out.println("owner: " + car.name);

		System.out.println("ID: " + taxi.idNum);
		System.out.println("speed: " + taxi.speed);
		System.out.println("direction: " + taxi.direction);
		System.out.println("owner: " + taxi.name);
	}
}