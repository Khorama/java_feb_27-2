package abstraction;// is mainly used by developer we just have to learn the concepts 

public class Test { // 
	
	public static void main(String[] args) {
		//AbstractClass object = new ChildClass ();
		Animal ele = new Elephant();
		
		//object.method();
		ele.eats();
		ele.sleeps();
		ele.runs();
		ele.numberOfLegs();
		System.out.println();// This is to give empty space 
		
		
		// to call interface method
		//Interface object = new ImplementingClass();
		SpecialBehavior kitten = new Cat();
		kitten.pet();
		Animal kitty = new Cat();
		kitty.eats();
		kitty.sleeps();
		kitty.runs();
		kitty.numberOfLegs();
		System.out.println();// This is to give empty space 
		
		
		// to call interface method
		//Interface object = new ImplementingClass();
		SpecialBehavior doggo = new Dog();
		
		Animal buzz = new Dog();
		buzz.eats();
		buzz.sleeps();
		buzz.runs();
		buzz.numberOfLegs();
		doggo.pet();
	}

}
