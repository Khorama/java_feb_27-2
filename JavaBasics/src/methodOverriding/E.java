package methodOverriding;

public class E extends G {
	public void temperature () {
		System.out.println("It is 10 dregees Farhrenheit");
	}
	
	public static void main(String[] args) {
		E e = new E()	;		
		e.temperature();
	
	}

}
