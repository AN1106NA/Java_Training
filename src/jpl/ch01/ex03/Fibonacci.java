package jpl.ch01.ex03;

/**
 * フィボナッチ数列を表示するクラス.
 * @author Anna.S
 *
 */
class Fibonacci {
	static final int MAX = 50;
	/** 値が50未満のフィボナッチ数列を表示する. */
	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		System.out.println(lo);
		while (hi < MAX) {
			System.out.println(hi);
			hi = lo + hi;
			lo = hi - lo;
		}
	}
}
