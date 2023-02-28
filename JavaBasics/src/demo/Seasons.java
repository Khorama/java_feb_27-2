package demo;// methods examples without parameters

public class Seasons {
	
	public void winter () {
		System.out.println("Winter are cold");
	}
	
	public void summer ()	{
		System.out.println("Summer are hot");
	}
	
	public void springs ()	{
		System.out.println("Spring are pleasent");
	}
	
	public void autumn () {
		System.out.println("Autumn marks the onset of winters");
	}
	
	public static void main(String[] args) {
		// Class object = new Class ()	;
		Seasons seasons = new Seasons();
		
		// objects. method()
		seasons.winter();
		seasons.summer();
		seasons.autumn();
		seasons.springs();
		
	}

}
