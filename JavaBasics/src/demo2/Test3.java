package demo2;// Assignment 30Q2

import demo.Calculator;

import demo.Water;

public class Test3 {
	public static void main(String[] args) {
		//Create object of the class which contains the method
		// Class object = new Class();
		
		Water water = new Water();
		//object.method ();
		water.minWater();
		
		// calling a method in different package
		//Class.method()
		Calculator.subtract(45, 50);
	}

}
