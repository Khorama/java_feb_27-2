package demo;// if else statement is used if the option are 4 or less. 

public class Clock {
	public static void main(String[] args) {
		int time = 16;
		
		if (time < 12) {
			System.out.println("Good Morning");
		}
		
		else if(time < 16) {
			System.out.println("Good afternoon");
		}
		
		else if (time < 20) {
			System.out.println("Good evening");
		}
		else {
			System.out.println("Good night");
		}
	}

}
