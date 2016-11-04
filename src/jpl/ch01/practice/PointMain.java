package jpl.ch01.practice;

public class PointMain {
	public static void main(String[] args) {
		Point lowerLeft = new Point();
		Point upperRight = new Point();
		Point middlePoint = new Point();

		lowerLeft.x = 0.0;
		lowerLeft.y = 0.0;

		upperRight.x = 100.0;
		upperRight.y = 80.0;

		double d = lowerLeft.distance(upperRight);
		System.out.println(d);
	}
}
