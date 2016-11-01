package jpl.ch02.ex07;

/**
 *  コンストラクタを2つ追記.
 * @author Anna.S
 *
 */
public class Vehicle {
	private double speed;
	private double direction;
	private String name;

	private static long nextID = 0;
	private final long idNum;

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
	/**
	 *  引数なしコンストラクタ.
	 */
	public Vehicle() {
		idNum = nextID++;
	}

	/**
	 *  引数ありコンストラクタ.
	 * @param name 持ち主.
	 */
	public Vehicle(String name) {
		this();
		this.name = name;
	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle("Car Driver");
		car.speed = 80;
		car.direction = 15;

		Vehicle taxi = new Vehicle("Taxy Driver");
		taxi.speed = 50;
		taxi.direction = 180;

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