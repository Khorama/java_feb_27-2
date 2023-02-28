package methodOverriding;

public class F extends G {
	
	public void temperature () {
		System.out.println("It is 5 dregees Farhrenheit");
	
	}
	public static void main(String[] args) {
		F f = new F() ;
		f.temperature();
			
		
	}
	
}
