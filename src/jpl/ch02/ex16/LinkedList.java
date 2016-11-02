package jpl.ch02.ex16;

/**
 * リスト内の要素の数を返すメソッドを追加.
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

	/** リスト内の要素数を返す.*/
	public int size() {
		if (nextList == null)
			return 1;
		else
			return 1 + nextList.size();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("LinkedList[Object = ");
		sb.append(object);
		sb.append("]");
		return sb.toString();
	}
}