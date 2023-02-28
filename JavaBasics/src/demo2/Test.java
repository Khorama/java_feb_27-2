package demo2;// Assignment 30Q1 calling methods from a different package 


import demo.Calculator;

import demo.Methods;

public class Test {
	// call the methods created in class 'Methods'
	public static void main(String[] args) {
		
		//create object of the class which contains the method

		//Class object = new Class();
		Methods methods = new Methods();
		// object.method()
		methods.day();
		methods.month();
		methods.year();
		
		// // call the subtract method static in a different package
		//To call a static method in a different class, use the syntax-, the object do not need to be created 
		// Class.method()
		
		Calculator.subtract(5, 10);
	}

}
