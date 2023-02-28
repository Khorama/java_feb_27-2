package Assignments;// Assignment 35 constructor examples 

public class Mobile {
	
	int batterBackup;
	String color;
	double screenSize;
	
	public Mobile (int batterTime, String colorMobile,double mobileScreenSize) {
		
		batterBackup = batterTime;
		color = colorMobile;
		screenSize = mobileScreenSize;		
		
	}
	public void printMobileIfo() {
		System.out.println("Mobile Batter Backup time is " + batterBackup);
		System.out.println("Mobile color is  " + color);
		System.out.println("Mobile Screen Size is " + screenSize);
	
		
	}
	public static void main(String[] args) {
		Mobile apple = new Mobile(15,"white",6);
		Mobile samsung = new Mobile(17,"Balck",6.5);
		
		//object.method();
		samsung.printMobileIfo();
	}

}
