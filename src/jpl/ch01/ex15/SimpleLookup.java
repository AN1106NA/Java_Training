package jpl.ch01.ex15;

import java.util.ArrayList;
import java.util.List;
/**
 *  addとremoveメソッドを宣言したインターフェイスをLookUpを拡張して定義.
 * @author Anna.S
 *
 */
class SimpleLookup implements SubLookup {
	public String[] names;
	public Object[] values;

	@Override
	public Object find(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name))
				return values[i];
		}
		return null;
	}


	@Override
	public void add(String name, Object value) {
		Object[] newValues = new Object[values.length + 1];
		String[] newNames = new String[names.length + 1];
		for (int i = 0; i < newValues.length - 1; i++) {
			newValues[i] = values[i];
			newNames[i] = names[i];
		}
		newValues[newValues.length - 1] = value;
		newNames[newNames.length - 1] = name;
		values = newValues;
		names = newNames;
	}

	@Override
	public void remove(String name) {
		List<Object> valueList = new ArrayList<Object>();
		List<String> nameList = new ArrayList<String>();
		for (int k = 0; k < names.length; k++) {
			if (!names[k].equals(name)) {
				nameList.add(names[k]);
				valueList.add(values[k]);
			}
		}
		values = valueList.toArray();
		names = nameList.toArray(new String[nameList.size()]);
	}
}