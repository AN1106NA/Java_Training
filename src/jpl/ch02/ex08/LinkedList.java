package jpl.ch02.ex08;
public class LinkedList {
	public  Object object;
	public  LinkedList nextList;

	public LinkedList(Object object){
		this.object = object;
	}
	public static void main(String[] args){
		//Object型変数を初期化するためのコンストラクタが必要
		Vehicle car = new Vehicle();
		Vehicle taxi = new Vehicle();

		LinkedList list1 = new LinkedList(car);
		LinkedList list2 = new LinkedList(taxi);

		list1.nextList = list2;

		System.out.println(list1.object);
		System.out.println(list1.nextList.object);
	}
}