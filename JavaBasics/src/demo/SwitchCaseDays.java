package demo;// switchcase statement is used when the options are more then 4 

public class SwitchCaseDays {
	
	public static void main(String[] args) {
		int day = 4;
		
		switch(day) {
		
		case 1:
		System.out.println("Monday");
		break;
		
		case 2:
		System.out.println("Tuesday");
		break;
		
		case 3:
		System.out.println("Wednesday");
		break;
		
		case 4:
		System.out.println("Thursday");
		break;
		
		case 5:
		System.out.println("Friday");
		break;
		
		case 6:
		System.out.println("Saturday");
		break;
		
		case 7:
			System.out.println("Sunday");
			break;
			
			default:
				System.out.println("please enter a valid in 1-7");
			
		
		}
	}

}
