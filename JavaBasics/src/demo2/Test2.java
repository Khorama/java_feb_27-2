package demo2;// calling methods from other packages 

import demo.Calculator;

import demo.Seasons;

public class Test2 {
	// call the add() method from Calculator class in Test2 class
	public static void main(String[] args) {
		
		//create object of the class which contains the method
		Calculator calculator = new Calculator();
		
		// object.method ();
		calculator.add(30, 30);
		calculator.subtract(30, 5);
		calculator.divide(30, 5);
		
		// call all the methods of seasons class in the Test 2 class
		
		// object.method ();
		//Class object = new Class ();
		Seasons seasons = new Seasons();
		seasons.winter();
		seasons.autumn();
		seasons.springs();
		seasons.winter();
		
		// call the subtract method static in a different package
		//To call a static method in a different class, use the syntax-, the object do not need to be created 
				//Class.method()
		Calculator.subtract(30, 5);
		
		
	
		}

}
