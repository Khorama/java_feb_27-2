package Assignments;// assignment 34

public class Demo6 {
	
	public String getName() {
		String name = "James Bond";// we can also write "return James Bond"
		return name;
	}
public static void main(String[] args) {
	Demo6 demo6 = new Demo6();
	
	String value = demo6.getName();//  (object.method ();)a string variable(name) has used  to be stored to return 
			System.out.println("My name is " + value);
}
}
