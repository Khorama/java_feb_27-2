package demo;

public class A {

	protected void cellPhone() {// can be accessed outside of the package if child of.
		System.out.println("CellPhone is a communication device");
	}

	void Java() {// default can only be accessed in the package
		System.out.println("Jave is an Object oriented Language");
	}

	public static void main(String[] args) {
		A a = new A();

		// object.method
		a.cellPhone();
		a.Java();
	}
}
