package jpl.ch02.ex08;

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

}