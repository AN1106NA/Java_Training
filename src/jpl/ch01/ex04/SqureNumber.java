package jpl.ch01.ex04;
/**
 *  平方根を表示する.
 * @author Anna.S
 *
 */
public class SqureNumber {
	static final int MAX = 10;
	public static void main(String[] args){
		int num = 1;
		while(num<=MAX){
			System.out.print(num + ":");
			System.out.println(num*num);
			num++;
		}
	}
}