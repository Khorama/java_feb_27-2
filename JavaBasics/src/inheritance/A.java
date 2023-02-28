package inheritance;// is used to a void code repetition. we write the repeating code in a separate class(parent class). All other which need to access will be child of. 

public class A extends B {// A is child of B. Child can access all methods in parent class 

	public static void main(String[] args) {
		// Imagine the day method is a present in class A
		// need to create object of A
		A a = new A();
		
		// Object.method();
		a.day();
		a.month();
		
	}
}
