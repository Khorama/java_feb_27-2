package demo;// if else statement 

public class WeatherInformation {
	public static void main(String[] args) {
		int temperature = -21;
		
		if (temperature <-20) {
			System.out.println("Extremely Cold");
		}
		else if (temperature < 0) {
			System.out.println("Cold");
		}
		else if (temperature <15) {
			System.out.println("pleasent");
		}
		
		else {
			System.out.println("Hot");
		}
	}

}
