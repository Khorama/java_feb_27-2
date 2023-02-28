package Assignments;// Assignment 29Q2

public class Birds {
	
	public void fly() {
		System.out.println("Birds can fly");
	}

	public void sleep() {
	System.out.println("Birds sleep at night");
	
	}

	public void eat() {
	System.out.println("Birds eat insects");
	}
	
	public static void main(String[] args) {
		//Class object = new Class() ;
		Birds birds = new Birds();
		
		//object.method();
		birds.fly();
		birds.sleep();
		birds.eat();
		
	}
	
	}
	
	