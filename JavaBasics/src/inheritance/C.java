package inheritance;

public class C extends F {
	
	public void day() {
		System.out.println("Today is Thursday");	

	}
	public static void main(String[] args) {
		C c = new C();
		c.day();
		c.date();
		c.nextYear();
	}
}
