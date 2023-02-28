package Assignments;// assignment 34

public class Demo7 {
	
	public int getTemperature() {
		return 23;
	}

	public static void main(String[] args) {
		Demo7 demo7 = new Demo7();

		int temperature = demo7.getTemperature();
		System.out.println("Today it is " + temperature + "F");
	}
}
