package arrays;// 2 Dimensional Array

public class Cities {
	
	public static void main(String[] args) {
		
		String [][] cities = new String [4][3];/// 4= rows 3= column
				
		cities [2][1] = "London"; // look at running notes from 1/10/2023
		cities [3][2] = "Paris";
		cities [0][1] = "New York";
		
		System.out.println(cities[2][1]);
		System.out.println(cities [3][2]);
	}


}
