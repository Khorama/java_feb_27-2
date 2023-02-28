package demo;// calling methods from another class

public class Test {
	
	// call the add() method from Calculator class in the test Class
	public static void main(String[] args) {
		// create object of that class which contains the method
		Calculator calculator = new Calculator ();
		
		//object.method();
		calculator.add(20, 10);
		calculator.subtract(40, 50);
		calculator.divide(30, 5);
		calculator.multiply(10, 20);
		
		//To call a static method in a different class, use the syntax-
		//Class.method()
		Calculator.subtract(20, 5);
		
		// call the methods from Seasons class
		Seasons seasons = new Seasons ();
		//object.method()
		seasons.summer();
		seasons.autumn();
		seasons.springs();
		seasons.winter();
		
	}

}
