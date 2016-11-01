package jpl.ch01.ex09;
/**
 *  配列にいれて表示する.
 * @author Anna.S
 *
 */
public class Fibonacci {
	static final int MAX = 50;

	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		int count= 0;
		int[] fibArray = new int[100];
		fibArray[count] = lo;

		while (hi < MAX) {
			count++;
			fibArray[count] = hi;
			hi = lo + hi;
			lo = hi - lo;
		}

		for (int k = 0; k < fibArray.length; k++) {
			if (fibArray[k] > 0) {
				System.out.println(fibArray[k]);
			}
		}
	}
}