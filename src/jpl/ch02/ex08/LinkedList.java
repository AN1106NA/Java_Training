package jpl.ch02.ex08;

/**
 *  コンストラクタ.
 * @author Anna.S
 *
 */
public class LinkedList {
	private Object object;
	private LinkedList nextList;

	public LinkedList(Object object) {
		this.object = object;
	}

	public LinkedList(Object object, LinkedList nextList) {
		this.object = object;
		this.nextList = nextList;
	}

	public Object getObject() {
		return object;
	}

	public LinkedList getNextList() {
		return nextList;
	}

	public void setNextList(LinkedList nextList) {
		this.nextList = nextList;
	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle("Car Drive");
		car.speed = 100;
		car.direction = 90;
		Vehicle taxi = new Vehicle("Taxi Driver");
		taxi.speed = 120;
		taxi.direction = 180;

		LinkedList list1 = new LinkedList(car);
		LinkedList list2 = new LinkedList(taxi);

		// リンクを繋げる
		list1.setNextList(list2);

		// リンクの内容を確認
		LinkedList nextList = list1;
		StringBuilder sb = new StringBuilder();
		while (nextList != null) {
			Vehicle v = (Vehicle) nextList.getObject();
			sb.append("ID:");
			sb.append(v.idNum);
			sb.append(", speed:");
			sb.append(v.speed);
			sb.append(", direction:");
			sb.append(v.direction);
			sb.append(", name :");
			sb.append(v.name);
			sb.append("\r\n");
			nextList = nextList.getNextList();
		}
		System.out.println(sb.toString());
	}
}