package methodOverriding;

public class C extends D{
	
	public void day () {
		System.out.println("It is Tuesday");
	}

	public void month () {
		System.out.println("It is January");
	}
	public static void main(String[] args) {
		C c = new C();
		
		c.day();// only this method is over written because the others its not present in the parent class 
		c.year();
		c.month();
	}
	
}
