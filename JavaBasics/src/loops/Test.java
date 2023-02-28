package loops;// ask user to enter name 

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Please enter your name: ");
		String name = scanner.nextLine();
		System.out.println(" Name you entered = " + name);
		
		
	}

}
