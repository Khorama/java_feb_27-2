package demo1;// Method overloading - creating same method but with different parameters/data type in the same class is method overloading. 

public class Calculator {
	
	public void add(int a, int b ) {
		System.out.println(a+b);
	}
	public void add(int a,int b, int c) {// method overloading 
		System.out.println(a+b+c);
		
	}
	
	public void add (double a, double b) {// still overloaded methods 
		System.out.println(a+b);
		
			}
	
	public static void main(String[] args) {
		// Class object = new Class();
		Calculator calculator = new Calculator();
		
		//object.method();
		calculator.add(20, 5);
		calculator.add(3, 3, 3);
		calculator.add(3.3, 3.3);
		
	}

}
