package demo2;// example of constructor 

public class Car {
	// variables are private and methods public this is the right way to write because variables should not be able to change 
	private String color;
	private String engineType;
	private int model;
	
	public Car(String colorOfCar, String typeOfEngine, int carModel) {
		color = colorOfCar;
		engineType = typeOfEngine;
		model = carModel;
	}
	public void printCarInfo() {// to print the information for cars we have to create a method to be called 
		System.out.println("Color of Car = " + color);
		System.out.println("Type of engine = " + engineType);
		System.out.println("Model of Car = " + model);
	}
	
	public static void main(String[] args) {
		//Create an object
		Car mercedes = new Car("Silver", "petrol", 2017);
		
		Car audi = new Car("black", "diesel", 2018);
		
		//object.method ();
		mercedes.printCarInfo();
		// to get value for audi just replace mercedes with audi 
	}
	

}
