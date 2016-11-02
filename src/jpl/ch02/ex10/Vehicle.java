package jpl.ch02.ex10;

/**
 * toStringメソッド追加.
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

		Vehicle taxi = new Vehicle("Taxy Driver");
		taxi.speed = 50;
		taxi.direction = 180;

		System.out.println(car.toString());
		System.out.println(taxi.toString());
	}

	@Override
	public String toString() {
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
		sb.append(maxID());
		sb.append("]");
		return sb.toString();
	}
}