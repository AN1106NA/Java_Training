package jpl.ch01.ex10;

public class ImprovedFibonacci {
	static final int MAX = 9;
	static final String COLON = ": ";
	static int[] fibArray = new int[10];

	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		int count = 0;
		String mark;

		fibArray[count] = lo;
		for (int i = MAX; i >= 2; i--) {
			count++;
			if (hi % 2 == 0)
				mark = "*";
			else
				mark = "";
			int temp = MAX - i + 2;

			fibArray[count] = hi + mark;
			hi = lo + hi;
			lo = hi - lo;
		}
		for (int i = 0; i < MAX; ++i) {
			System.out.println("Fibonacci " + fibStr[i]);
		}
	}
}