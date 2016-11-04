package jpl.ch02.ex16;

/**
 *  乗り物の現在のスピードを引数で渡された値に変更する
 *  changeSpeedメソッド
 *  スピードを0にするstopメソッドを追加.
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

	public void setName(String driver) {
		this.name = driver;
	}

	public long getIdNum() {
		return idNum;
	}

	/**
	 *  乗り物のスピードを変更する.
	 * @param speed
	 */
	public void changeSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 *  スピードをゼロにする.
	 */
	public void stop() {
		this.speed = 0;
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
		sb.append(", MaxID:");
		sb.append(maxID());
		sb.append("]");
		return sb.toString();
	}
}