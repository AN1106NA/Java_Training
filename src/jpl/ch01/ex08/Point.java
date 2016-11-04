package jpl.ch01.ex08;
/**
 *  Pointクラスにメソッドを追加して、
 *  引数として渡されたオブジェクトの座標を自分の座標に設定.
 * @author Anna.S
 *
 */
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

	public void setPoint(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
}
