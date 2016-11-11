package jpl.ch03.practice;

/**
 *  変換されたScrenColorオブジェクトを取り出すメソッドをサポートする.
 * @author Anna.S
 *
 */
public class ColorAttr extends Attr {
	//変換された色.
	private ScreenColor myColor;

	public ColorAttr(String name, Object value) {
		super(name, value);
		decodeColor();
	}

	public ColorAttr(String name) {
		this(name, "transparent");
	}

	public Object setValue(Object newValue) {
		//スーパークラスのsetValueを最初に行う.
		Object retval = super.setValue(newValue);
		decodeColor();
		return retval;
	}

	/** 変換されたScreenColorオブジェクトを返す.*/
	public ScreenColor setValue(ScreenColor newValue) {
		//スーパークラスのsetValueを最初に行う.
		super.setValue(newValue.toString());
		ScreenColor oldValue = myColor;
		myColor = newValue;
		return oldValue;
	}

	/** 変換されたScreenColorオブジェクトを返す.*/
	public ScreenColor getColor() {
		return myColor;
	}

	/** getValue()で得られる記述からScreenColorを返す.*/
	protected void decodeColor() {
		if (getValue() == null)
			myColor = null;
		else
			myColor = new ScreenColor(getValue());
	}
}
