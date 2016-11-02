package jpl.ch02.ex06;

/**
 *  mainメソッドを書いて、
 *  Vehicle型のオブジェクトを数個作成し、利のとの連続したノードにいれる.
 * @author Anna.S
 *
 */
public class LinkedList {
	private Object object;
	private LinkedList nextList;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public LinkedList getNextList() {
		return nextList;
	}

	public void setNextList(LinkedList nextList) {
		this.nextList = nextList;
	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		car.speed = 100;
		car.direction = 90;
		car.name = "Car Driver";
		Vehicle taxi = new Vehicle();
		taxi.speed = 120;
		taxi.direction = 180;
		taxi.name = "Taxi Driver";

		LinkedList list1 = new LinkedList();
		list1.setObject(car);
		LinkedList list2 = new LinkedList();
		list2.setObject(taxi);

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