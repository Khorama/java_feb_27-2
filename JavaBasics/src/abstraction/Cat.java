package abstraction;

public class Cat extends Animal implements SpecialBehavior {

	@Override
	public void sleeps() {
		// TODO Auto-generated method stub
		System.out.println("Cat sleeps for 7 hours");
		
	}

	@Override
	public void runs() {
		// TODO Auto-generated method stub
		System.out.println("Cat runs at 40MPH");
		
	}

	@Override
	public void eats() {
		// TODO Auto-generated method stub
		System.out.println("Cat eats 2 kg of food daily");

		
	}

	@Override
	public void pet() {
		// TODO Auto-generated method stub
		System.out.println("Cat pets are very Funny");
		
	}

}
