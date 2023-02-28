package demo2;//examples of Constructor 

public class Test4 {
	
	//public void printSum () { this is the direct way but we have to learn the indirect way. See Running notes 1/03/2023
		//System.out.println("3+7 =" + (3+7));
	//}

	public int printSum () {
		int sum = 10;
		return sum;
		
	}
	public static void main(String[] args) {
		Test4 test4 = new Test4 ();
		
		// call the public int printSum method 
		
		int output = test4.printSum();
		
		System.out.println("3+7 =" + output);
	}
}
