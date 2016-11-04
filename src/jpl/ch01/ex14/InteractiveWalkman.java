package jpl.ch01.ex14;
/**
 *  双方向コミュニケーション.
 * @author Anna.S
 *
 */
public class InteractiveWalkman extends JacksWalkman {
	/**
	 * 会話を行うメソッド
	 */
	public void talk() {
		setJack("now talking (Jack)");
		setSubJack("now talking (SubJack)");
	}
}