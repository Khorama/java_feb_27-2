package Assignments;// assignment 35 constructor examples 

public class Birds2 {
	
	String color; // global variable
	boolean CanFly; // global variable
	
public Birds2 (String birds2color, boolean flyStatus) {
	
	color = birds2color;
	CanFly = flyStatus;
}
public void printBirds2Info() {
	System.out.println("Color of Birds = " + color);
	System.out.println(" Birds can Fly = " + CanFly);
}

public static void main(String[] args) {
	Birds2 parrot = new Birds2("Green" , true);
	Birds2 eagle = new Birds2 ("Brown", true);
	Birds2 Ostrich = new Birds2 ("Brown", false);
	
	//object.method
	Ostrich.printBirds2Info();
	
			
}
}
