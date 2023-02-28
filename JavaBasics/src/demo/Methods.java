package demo;// Assignment 30Q1

public class Methods {
	
	public void day () {
		System.out.println("Today is Tuesday");
	}
	public void month () {
		System.out.println("It is November");
	}
	public void year () {
		System.out.println("It is 2017");
	}
	public static void main(String[] args) {
		//Class object = new Class();
		Methods methods = new Methods();
		
		// object.methods();
		methods.day();
		methods.month();
		methods.year();
		
		// calling a method from a different class. We need to create the object of that class as shown below 
		Calculator calculator = new Calculator();
		calculator.add(5, 50);
	}

}
