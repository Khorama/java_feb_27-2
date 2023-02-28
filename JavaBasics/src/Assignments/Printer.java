package Assignments;// Assignment 29Q4

public class Printer {
	
	public void printerName(String name) {
		System.out.println("My name is" + name);
	}
	public void printerSum (int a, int b) {
		System.out.println("Sum =" + (a+b));
	}
	public static void main(String[] args) {
		
		// Class object = new Class():
		Printer printer = new Printer ();
		
		//object.method ();
		printer.printerName("James Bond");
		printer.printerSum(20, 5);
	}

}
