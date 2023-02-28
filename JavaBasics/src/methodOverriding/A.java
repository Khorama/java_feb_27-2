package methodOverriding;// when the methods are both in parent and child class are the same java will override parent and print what is in the child class 
	// the method and parameters has to be exactly same. 


public class A extends B{
	
	public void greetings () {// the green symbol is shown that it is over written method. 
		System.out.println("Wish you all first Good evening of 2023");
		
	}
	
	public void day () {
		System.out.println("Today is Tudesday");
		super.greetings(); // calling the greetings () method from the parents class by using the word "super". it has to be written in another method not in main method
		// we can also put into the greetings method above also
		}

	public static void main (String[] args) {
		// Class object = new Class();
		
		A a = new A ();
	
		// object.method();
		a.greetings();
		a.day();
		
	}
}
