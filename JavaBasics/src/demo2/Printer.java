package demo2;// constructor example

public class Printer {

	public String printName() {
		String name = "Tom";
		return name;
		
	}
	public static void main(String[] args) {
		Printer printer = new Printer ();
		
		//date type to be returned = object.method(); to call the method 
		String output = printer.printName();// if the method has a return type we have to declare the date type output
	System.out.println("My name is " + output);	
	}

}

