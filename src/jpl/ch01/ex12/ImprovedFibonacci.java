package jpl.ch01.ex12;

/**
 *  Stringオブジェクトを作成して配列にいれる.
 * @author Anna.S
 *
 */
public class ImprovedFibonacci {
	static final int MAX = 9;
	static final String COLON = ": ";
	static String[] fibStr = new String[10];

	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		int count = 0;
		String mark;

		fibStr[count] = 1+COLON+Integer.toString(lo);
		for (int i = MAX; i >= 2; i--) {
			count++;
			if (hi % 2 == 0)
				mark = "*";
			else
				mark = "";
			int temp = MAX - i + 2;

			fibStr[count] = temp + COLON + hi + mark;
			hi = lo + hi;
			lo = hi - lo;
		}
		for (int i = 0; i < MAX; ++i) {
			System.out.println("Fibonacci " + fibStr[i]);
		}
	}
}