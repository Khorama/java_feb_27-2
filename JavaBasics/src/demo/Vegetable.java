package demo;// Assignment 25 

public class Vegetable {
	
	
		
		String colorOfPotato = "brown";
		String  shapeOfPotato = "eliptical";
		
		// what is the color of onion?
		String colorOfOnion = "red";
		
		//What is the shape of onion?
		String shapeOfOnion = "round";
		
	public void printVegetableInfo() {
		System.out.println("Onion color is  " + colorOfOnion);
		System.out.println("Onion shape is " + shapeOfOnion);
		System.out.println("Potato color is " + colorOfPotato);
		System.out.println("Potato shape is " + shapeOfPotato);
	}
		public static void main(String[] args) {
			Vegetable onion = new Vegetable();
			Vegetable potato = new Vegetable ();
			
	
		
		onion.printVegetableInfo();
		
	}
		

}
