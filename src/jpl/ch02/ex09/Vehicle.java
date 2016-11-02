package jpl.ch02.ex09;

/**
 *  識別番号の最大値を返すstaticメソッドを追加.
 * @author Anna.S
 *
 */
public class Vehicle {
	public double speed;
	public double direction;
	public String name;

	public static long nextID = 0;
	public final long idNum;

	public Vehicle() {
		idNum = nextID++;
	}

	public Vehicle(String name) {
		this();
		this.name = name;
	}

	/** 今まで使われた識別番号の最大値を返す */
	public static long maxID() {
		if (nextID == 0)
			return 0;
		else
			return nextID - 1;
	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle("Car Driver");
		car.speed = 80;
		car.direction = 15;

		System.out.println("ID: " + car.idNum);
		System.out.println("speed: " + car.speed);
		System.out.println("direction: " + car.direction);
		System.out.println("name: " + car.name);
		System.out.println("MaxId: " + maxID());

		Vehicle taxi = new Vehicle("Taxy Driver");
		taxi.speed = 50;
		taxi.direction = 180;

		System.out.println("ID: " + taxi.idNum);
		System.out.println("speed: " + taxi.speed);
		System.out.println("direction: " + taxi.direction);
		System.out.println("MaxId: " +  maxID());
	}
}