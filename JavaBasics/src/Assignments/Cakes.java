package Assignments;// Assignment 29Q3

public class Cakes {
	
	public void chocolate () {
		System.out.println("Chocolate flavor is the best flavor");
	}
	public void vanilla () {
		System.out.println("Vanilla flavor is also good");
	}
	public void butterscotch () {
		System.out.println("Butterscotch flavor is liked by everyone");
	}
	public void strawberry () {
		System.out.println("Strawberry flavor is good too");
	}
	public static void main(String[] args) {
		// class object = new Class ();
		
		Cakes cakes = new Cakes();
		//object.method();
		cakes.butterscotch();
		cakes.chocolate();
		cakes.strawberry();
		cakes.vanilla();
	}

}
