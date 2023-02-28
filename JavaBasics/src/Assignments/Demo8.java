package Assignments;// Assignment 34

public class Demo8 {

	public int getDate() {
		int date = 10;// variable that is declared
		return date;// variable to be returned from above

	}

	public static void main(String[] args) {
		Demo8 demo8 = new Demo8();

		int value = demo8.getDate();
		System.out.println("It is " + value + "th of this month");
	}
}
