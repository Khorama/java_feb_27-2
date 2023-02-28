package demo;// switchcase statement is used when options are more then 4 

public class SwitchCaseDemo {
	
	public static void main(String[] args) {
		String day = "MONDAY";
		
		switch(day.toLowerCase()) {
		
		case "monday":
			System.out.println("wear a white dress today");
			break;
			
		case "tuesday":
			System.out.println("Wear a yellow dress today");
			break;
			
		case "wednesday":
			System.out.println("Wear a red dress today");
			break;
			
		case "thursday":
			System.out.println("Wear a pink dress today");
			break;
			
		case "friday":
			System.out.println("Wear a brown dress today");
			break;
			
		case "saturday":
			System.out.println("Wear an orange dress today");
			break;
			
		case "sunday":
			System.out.println("Wear a green dress today");
			
		default:
			System.out.println("please enter a valid input");
				
		}
	}

}
