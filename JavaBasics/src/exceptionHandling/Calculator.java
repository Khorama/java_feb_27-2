package exceptionHandling;//  unchecked exception is when a error that occurs 

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		try {// if there is a error when can input a msgs in place of the java exception error to be display
		
		System.out.println("Please enter a number:  ");
		int num1 = scanner.nextInt();  // (scanner.nextInt (object.method)
				
		System.out.println("Please enter a number:  ");
		int num2 = scanner.nextInt();
		
		System.out.println("Result of division = " + num1/num2);
		}
		catch (ArithmeticException e) {// multiple catch blocks 
			System.out.println("Please enter a non-zero value in the denominator");
		}
		catch (InputMismatchException e) {
			System.out.println("Only integer values are allowed");
		}
		catch (Exception e) {// Try and catch has to be inputed in order to handle any exception/error that will be given by java. (e= is anything string)
			System.out.println("Please enter a valid input");
		}
		finally { //optional block, code to close the DB connections is written inside it 
			System.out.println("Good bye");
		}
	}

}
