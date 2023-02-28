package Assignments;// Assignment 32

public class Helicopter extends FlyingMachine {
	
	public void hover () {
		System.out.println("Helicopter can hover over ground");
	
	}
	public static void main(String[] args) {
		Helicopter helicopter = new Helicopter();
		
		//object.method();
		helicopter.hover();
		helicopter.travel();
	}

}
