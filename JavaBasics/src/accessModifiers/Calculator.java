package accessModifiers;

public class Calculator {
	
	protected  void add (int a, int b) {  // we can change the method"public" to any of the following, protected, private,public or default(which nothing is written)
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(25, 5);
	}

}
