package abstraction;

public class Dog extends Animal implements SpecialBehavior {// to make a connections between interface 

	@Override
	public void sleeps() {
		// TODO Auto-generated method stub
		System.out.println("Dog sleeps for 10 hours");
		
		
	}

	@Override
	public void runs() {
		// TODO Auto-generated method stub
		System.out.println("Dog runs at 50 MPH");
	}

	@Override
	public void eats() {
		// TODO Auto-generated method stub
		System.out.println("Dog eats 10Kg of food daily");
	}

	@Override
	public void pet() {
		// TODO Auto-generated method stub
		System.out.println("Pet Dogs are very cute");
		
	}

}
