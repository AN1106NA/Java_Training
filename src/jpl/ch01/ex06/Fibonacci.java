package jpl.ch01.ex06;

class Fibonacci {
	private static final int MAX = 50;
	private static final String TITLE = "Fibonacci ";

	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		System.out.println(TITLE + lo);
		while (hi < MAX) {
			System.out.println(TITLE + hi);
			hi = lo + hi;
			lo = hi - lo;
		}
	}
}
