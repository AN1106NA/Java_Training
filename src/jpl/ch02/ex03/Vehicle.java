package jpl.ch02.ex03;
/**
 *  次の乗り物の識別番号を保持するstaticフィールドと、<br/>
 *  車単位でID番号を保持するための非staticフィールドを<br/>
 *  Vehicleクラスに追加する.<br/>
 * @author Anna.S
 *
 */
class Vehicle {
	public double speed;
	public double direction;
	public String name;
	public long idNum;
	public static long nextID = 0;

}
