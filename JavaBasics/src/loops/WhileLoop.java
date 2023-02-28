package loops;/// whileloop is used when a 

import java.util.Scanner;

public class WhileLoop {
	
	public static void main(String[] args) {
		int PIN_IN_DB = 4321;
		// predefined class can be java be used and in the () we have write some extra stuff and import
		// Class object = new Class ();
		Scanner scanner = new Scanner (System.in); /// (System.in) is part of the syntx, it takes user input
		// Encapsulation- is used in scanner class by creating Object of the class (Class object = new Class)
		
		
		System.out.println("Please enter your ATM PIN: ");
		int PIN_Entered_By_User  = scanner.nextInt(); // this is not a fixed value this is what is enter by user
		
		while (PIN_Entered_By_User != PIN_IN_DB) {// while value in PIN_Entered_By_User is not equal to PIN_Entered_By_User, "!=" is saying not equal to
			System.out.println("The PIN you entered is incorrect. Try again! ");
			PIN_Entered_By_User = scanner.nextInt();
		}
		System.out.println("Welcome to ABC Bank! ");
	}
}
