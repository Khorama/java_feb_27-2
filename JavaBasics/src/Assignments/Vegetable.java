package Assignments;// assignment 35 constructor example

public class Vegetable {
	
	String color;
	String shape;
	
	//public Vegetable(String colorOfVegetable, String shapeOfVegetable) {
	//	color = colorOfVegetable;
	//	shape = shapeOfVegetable;
	//}
	public Vegetable(String color, String shape) {// parameters of the constructor
		this.color = color;
		this.shape = shape;
				
	}
	
	public void printVegetableInfo() {
		System.out.println("Color:" + color);
		System.out.println("Shape:" + shape);
	}
	
	public static void main(String[] args) {
		Vegetable onion = new Vegetable("pink","round");
		Vegetable potato = new Vegetable ("brown","elliptical");
		
		//object.method
		onion.printVegetableInfo(); // if we change to potato it will give the results of Color=brown and shape= elliptical 
	}

}
