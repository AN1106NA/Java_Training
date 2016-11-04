package jpl.ch01.ex10;

public class ImprovedFibonacci {
	static final int MAX = 9;
	static final String COLON = ": ";

	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		FibonaArray[] fibArray = new FibonaArray[MAX];
		fibArray[0] = new FibonaArray(lo);
		for (int i = 2; i <= MAX; i++) {
			fibArray[i - 1] = new FibonaArray(hi);
			hi = lo + hi;
			lo = hi - lo;
		}

		for (int k = 0; k < fibArray.length; k++) {
			System.out.println(fibArray[k].Num() + COLON + fibArray[k].IsEven());
		}
	}
}

class FibonaArray {
	private int fibnum;
	private boolean isEven;

	public FibonaArray(int num) {
		fibnum = num;
		if (fibnum % 2 == 0)
			isEven = true;
		else
			isEven = false;
	}

	public boolean IsEven() {
		return isEven;
	}

	public int Num() {
		return fibnum;
	}
}