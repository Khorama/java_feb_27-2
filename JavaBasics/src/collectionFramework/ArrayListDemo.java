package collectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {// In a Arraylist a set number of items have not been declared. we can keep adding to ArrayList but not to Arrays
	
	public static void main(String[] args) {
		// Class object = new Class();
		ArrayList<String> cities = new ArrayList<String>();
		
		// Store items inside computer's memory
		cities.add("London");
		cities.add("Paris");
		cities.add("New York");
		cities.add("Los Angeles");
		cities.add("Tokyo");
		cities.add("London");
		
		//Retrieve items from the arraylist using for-each loop
		
		for (String t: cities) {// Declaring a variable 
			System.out.println(t);// t= the stored items in the Arraylist starting from 0
		}
		
		// Retrieve the item stored at index 2 from the arraylist
		System.out.println("Item stored at index 2 = " + cities.get(2));
		
		//What is the index of New York
		System.out.println("Index of New York = " + cities.indexOf("New York"));
		
		//Is Berlin in the list of Cities?
		System.out.println("Is Berlin present in the list? " + cities.contains("Berlin"));
		
		//How many items are there in the list
		System.out.println("Total items in the list = " + cities.size());
	}
	

}
