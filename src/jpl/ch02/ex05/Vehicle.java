package jpl.ch02.ex05;

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
	public final long idNum;

	public Vehicle() {
		idNum = nextID++;
	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		Vehicle taxi = new Vehicle();

		car.speed = 80;
		car.direction = 15;
		car.name = "Car Driver";

		taxi.speed = 50;
		taxi.direction = 180;
		taxi.name = "Taxi Driver";

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