package jpl.ch02.ex07;

/**
 *  コンストラクタを2つ追記.
 * @author Anna.S
 *
 */
public class Vehicle {
	public double speed;
	public double direction;
	public String name;

	public static long nextID = 0;
	public final long idNum;

	/**引数なしコンストラクタ. */
	public Vehicle() {
		idNum = nextID++;
	}

	/** 引数ありコンストラクタ.*/
	public Vehicle(String name) {
		this();
		this.name = name;
	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle("Car Driver");
		car.speed = 80;
		car.direction = 15;

		System.out.println("ID: " + car.idNum);
		System.out.println("speed: " + car.speed);
		System.out.println("direction: " + car.direction);
		System.out.println("owner: " + car.name);

		Vehicle taxi = new Vehicle("Taxy Driver");
		taxi.speed = 50;
		taxi.direction = 180;

		System.out.println("ID: " + taxi.idNum);
		System.out.println("speed: " + taxi.speed);
		System.out.println("direction: " + taxi.direction);
		System.out.println("owner: " + taxi.name);

	}
}