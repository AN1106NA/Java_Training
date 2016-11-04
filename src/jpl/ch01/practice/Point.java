package jpl.ch01.practice;

public class Point {
	public double x, y;

	public void clear() {
		this.x = 0;
		this.y = 0;
	}

	public void move(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distance(Point point) {
		double xdiff = x - point.x;
		double ydiff = y - point.y;
		return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
	}
}
