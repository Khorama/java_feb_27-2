package arrays;

public class arraysloops {
	public static void main(String[] args) {
	//int 1 = 5;
	//int 2 = 10;
	//int 3 = 20;
		
		// Declaration of array
		int [] numbers = new int[5];// 5 is the number of arrays to be stored. It can be and value. The index will always stared with zero 0. 
		
		//storing values in the array // we can use different data type in here  String[] name = new String [5];
		for (int i=0; i<5; i++) {
			numbers [i]= 20 +i;// look at running notes loop+arrays 1/11/2023
		}
		
		//Retrieve the values from the array
		for (int i=0; i<5; i++) {
			System.out.println(numbers [i]);
		}
		
	}
}
