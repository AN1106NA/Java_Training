package jpl.ch02.ex14;


/**
 *  privateフィールドにして、getter/setter追加.
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


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("LinkedList[Object = ");
		sb.append(object);
		sb.append("]");
		return sb.toString();
	}
}