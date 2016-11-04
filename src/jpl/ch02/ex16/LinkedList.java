package jpl.ch02.ex16;

/**
 * リスト内の要素の数を返すメソッドを追加.
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
}