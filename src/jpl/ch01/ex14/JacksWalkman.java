package jpl.ch01.ex14;

/**
 * ２つ端子を持つウォークマンクラス
 */
public class JacksWalkman extends SingleJackWalkman {
	private Object subJack;

	public void setSubJack(Object subJack) {
		this.subJack = subJack;
	}

	public Object getSubjack() {
		return this.subJack;
	}

	@Override
	public void playMusic() {
		super.playMusic();
		this.subJack = "now playing (subJack)";
	}
}