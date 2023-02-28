package demo;// Assignment 31 methods examples with parameters and  method overloading 

public class Calculator<x, X> {
	
	
	// In the line below, we have defined add() method
	public void add(int a, int b) { // a and b are called as parameters of the add() method 
		System.out.println(a+b);
	}
	public void add (int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static void subtract (double a, double b) {// it can be called in other classes and packages
		System.out.println(a-b);
	}
	
	public static void subtract (int a, int b) {
		System.out.println(a-b);
		
	}
	public void multiply (double a, double b) {
		System.out.println(a*b);
	}
	
	public void multiply (int a, int b) {
		System.out.println(a*b );
		}
	public void divide (int a, int b, int c) {
		System.out.println(a/b/c);
	}
	public void divide (int a, int b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		// class object = new class ();
		Calculator calculator = new Calculator ();
		
		// object. method() // we are calling the code here
		calculator.add(10, 20); // Here we are calling or invoking the add() method 
		calculator.subtract(50, 5);
		calculator.divide(30, 5);
		calculator.multiply(10, 5);
		
		//to call a static method, just write its name
		subtract (20,10);
		
	}
}
