package Assignments;// whileloop assignment

import java.util.Scanner;

public class Assignment40 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please type something:");
		String message = scanner.nextLine();

		while (!message.equals("quit")) {// "!" is the not equal to symbol. When using int we write != int but with string we need to write before as shown here
			System.out.println("You typed:" + message);

			System.out.println("Please type something:");
			message = scanner.nextLine();

		}

	}

}
