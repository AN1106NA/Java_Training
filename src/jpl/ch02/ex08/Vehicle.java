package jpl.ch02.ex08;

/**
 *  次の乗り物の識別番号を保持するstaticフィールドと、<br/>
 *  車単位でID番号を保持するための非staticフィールドを<br/>
 *  Vehicleクラスに追加する.<br/>
 * @author Anna.S
 *
 */
public class Vehicle {
	public double speed;
	public double direction;
	public String name;

	public static long nextID = 0;
	public final long driverId;

	public Vehicle() {
		driverId = nextID++;
	}

	public Vehicle(String driverName) {
		this();
		name = driverName;
	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle("Car Driver");
		car.speed = 80;
		car.direction = 15;

		Vehicle taxi = new Vehicle("Taxy Driver");
		taxi.speed = 50;
		taxi.direction = 180;

		System.out.println("ID: " + car.driverId);
		System.out.println("speed: " + car.speed);
		System.out.println("direction: " + car.direction);
		System.out.println("owner: " + car.name);

		System.out.println("ID: " + taxi.driverId);
		System.out.println("speed: " + taxi.speed);
		System.out.println("direction: " + taxi.direction);
		System.out.println("owner: " + taxi.name);

	}

}