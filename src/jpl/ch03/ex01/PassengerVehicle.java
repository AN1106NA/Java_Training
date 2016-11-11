package jpl.ch03.ex01;

/**
 * 車が持っている座席数と現在座っている人の人数を返す機能を追加.
 * @author Anna.S
 *
 */
public class PassengerVehicle extends Vehicle {
	private int seatNum;
	private int passengerNum;

	public PassengerVehicle(String driver, double speed, double direction, int seatNum, int passengerNum) {
		super(driver, speed, direction);
		checktParams(seatNum, passengerNum);
		this.seatNum = seatNum;
		this.passengerNum = passengerNum;
	}

	/** 座席に座っている人の人数が正しく入力されているか.*/
	private void checktParams(int seatNum, int passengerNum) {
		if ((seatNum < 1 || passengerNum < 1) || (seatNum - passengerNum < 0))
			throw new IllegalArgumentException("誤った数値が入力されています"); //座席に座っている人
	}

	public int getSeatNum() {
		return seatNum;
	}

	public int getpassengerNum() {
		return passengerNum;
	}

	@Override
	public String toString() {
		String val = super.toString();
		val += ", seatNum = " + seatNum + ", passenger = " + passengerNum;
		return val;
	}

	public static void main(String[] args) {
		PassengerVehicle bus = new PassengerVehicle("BusDriver", 60.0, 90.0, 20, 18);
		System.out.println(bus.toString());
		PassengerVehicle taxi = new PassengerVehicle("TaxiDriver", 80.0, 180.0, 5, 3);
		System.out.println(taxi.toString());
		PassengerVehicle train = new PassengerVehicle("TrainDriver", 250.0, 270.0, 800, 680);
		System.out.println(train.toString());
	}
}
