package Assignments;// assignment 32

public class Aeroplane extends FlyingMachine {
	
	public void fly () {
		System.out.println("Aeroplane flies at 800 mph!");
	}
	public static void main(String[] args) {
		//Class object = new Class();
		Aeroplane aeroplane = new Aeroplane();
		
		//object.method();
		aeroplane.fly();
		aeroplane.travel();
		
	}

}
