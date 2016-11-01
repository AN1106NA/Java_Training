package jpl.ch02.ex06;
/**
 *  mainメソッドを書いて、
 *  Vehicle型のオブジェクトを数個作成し、利のとの連続したノードにいれる.
 * @author Anna.S
 *
 */
public class LinkedList {
	private  Object object;
	private  LinkedList nextList;

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

	public static void main(String[] args){
		Vehicle car = new Vehicle();
		Vehicle taxi = new Vehicle();

		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();

		list1.setObject(car);
		list2.setObject(taxi);
		list1.setNextList(list2);

		System.out.println(list1.getObject());
		System.out.println(list1.getNextList().getObject());
	}
}