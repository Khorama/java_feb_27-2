package Assignments;// Assignment 35 example of constructor 

public class Fruit {

	String color;
	String taste;

	public Fruit(String colorOfFruit, String tasteOfFruit) {// this is the constructor

		color = colorOfFruit;
		taste = tasteOfFruit;

	}

	public void printFruitInfo() {
		System.out.println("Color of Fruit = " + color);
		System.out.println("Taste of Fruit = " + taste);
	}

	public static void main(String[] args) {
		Fruit mango = new Fruit("Yellow", "Sweet");
		Fruit orange = new Fruit("Orange", "Tangy");

		// object.method
		mango.printFruitInfo();
	}
}
