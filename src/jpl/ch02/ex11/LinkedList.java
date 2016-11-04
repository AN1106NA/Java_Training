package jpl.ch02.ex11;
/**
 * toStringメソッド追加.
 * @author Anna.S
 *
 */
public class LinkedList {
	private Object object;
	private LinkedList nextList;

	public LinkedList(Object object) {
		this(object, null);
	}

	public LinkedList(Object object, LinkedList nextList) {
		this.object = object;
		this.nextList = nextList;
	}
	public String toString() {
		if (object instanceof Vehicle) {
			String linkedListString;
			Vehicle v = (Vehicle) object;
			linkedListString = v.toString();
			if (nextList != null)
				linkedListString += nextList.toString();
			return linkedListString;
		}
		return null;
	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle("Car Drive");
		car.speed = 100;
		car.direction = 90;
		Vehicle taxi = new Vehicle("Taxi Driver");
		taxi.speed = 120;
		taxi.direction = 180;

		LinkedList list1 = new LinkedList(car, null);
		LinkedList list2 = new LinkedList(taxi, list1);

		// リンクを繋げる
		System.out.println(list2.toString());
	}
}
