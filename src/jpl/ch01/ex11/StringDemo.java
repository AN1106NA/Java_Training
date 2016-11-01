package jpl.ch01.ex11;

public class StringDemo {

	public static void main(String[] args){
		String firstName = "Anna";
		String lastName = "Suzuki";

		String myName = firstName+" "+lastName;
		myName = myName + ".";
		myName += " ";
		myName += "Nice to meet you.";
		System.out.println("I'm " + myName);
	}
}