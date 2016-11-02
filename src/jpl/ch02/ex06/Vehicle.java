package jpl.ch02.ex06;

public class Vehicle {
	public double speed;
	public double direction;
	public String name;

	public static long nextID = 0;
	public final long idNum;

	public Vehicle() {
		idNum = nextID++;
	}
}