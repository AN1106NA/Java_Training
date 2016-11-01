package jpl.ch01.ex07;

class ImprovedFibonacci {

	static final int MAX_INDEX = 9;
	private static final String COLON = ":  ";

	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		String mark;
		System.out.println(MAX_INDEX + COLON + lo);
		for (int i = MAX_INDEX - 1; i >= 1; --i) {
			if (hi % 2 == 0)
				mark = " *";
			else
				mark = "";
			System.out.println(i + COLON + hi + mark);
			hi = hi + lo;
			lo = hi - lo;
		}
	}
}