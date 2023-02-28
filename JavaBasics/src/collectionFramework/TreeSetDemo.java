package collectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {// difference between HasSet and TreeSet is the in TreeSet the items are stored in Alphabetic order 
	
	public static void main(String[] args) {
		TreeSet<String> cities = new TreeSet<String>();
		// Store items inside computer's memory
		cities.add("London");
		cities.add("Paris");
		cities.add("New York");
		cities.add("Los Angeles");
		cities.add("Tokyo");
		cities.add("London");//duplicate items are not allowed in a Set  and will not be printed 
		//Retrieve items from the TreeSet using for-each loop
		
		for (String t: cities) {// Declaring a variable  and call it 
			System.out.println(t);// t= the stored items in the TreeSet starting 
		}
		
		// Retrieve the item stored at set 2 from the HashSet, index dose not exist in TreeSet. so we can ran the two lines below
		//System.out.println("Item stored at index 2 = " + cities.get(2));
		
		//What is the index of New York
		//System.out.println("Index of New York = " + cities.indexOf("New York"));
		
		//Is Berlin in the list of Cities?
		System.out.println("Is Berlin present in the list? " + cities.contains("Berlin"));
		
		//How many items are there in the list
		System.out.println("Total items in the list = " + cities.size());
	}
	

}