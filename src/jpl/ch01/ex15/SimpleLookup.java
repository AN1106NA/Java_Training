package jpl.ch01.ex15;

import java.util.ArrayList;
import java.util.List;

/**
 *  addとremoveメソッドを宣言したインターフェイスをLookUpを拡張して定義.
 * @author Anna.S
 *
 */
public class SimpleLookup implements SubLookup {
	private List<String> names;
	private List<Object> values;
	private final int NOT_FOUND = -1;

	SimpleLookup() {
		names = new ArrayList<String>();
		values = new ArrayList<Object>();
	}

	@Override
	public Object find(String name) {
		int index = names.indexOf(name);
		if (index == NOT_FOUND) //見つからないときは-1
			return null;
		return values.get(index);
	}

	@Override
	public void add(String name, Object value) {
		names.add(name);
		values.add(value);
	}

	@Override
	public void remove(String name) {
		int index = names.indexOf(name);
		if (index != NOT_FOUND) {
			names.remove(index);
		}
	}
}