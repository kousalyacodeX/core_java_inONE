package new_javaAdvance;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashSet<String>cars = new HashSet<String>();
	
	
	//Add
	cars.add("Honda city");
	cars.add("BMW");
	cars.add("Marcedes");
	cars.add("Ford");
	cars.add("Honda city");
	
	//Display
	for(String Car : cars) {
		System.out.println(Car);
	}
	// Honda city -> 2, once only, unique
	//unordered collection -> no oder of elements
	//Particular elements
	//contains() methods
	System.out.println(cars.contains("Marcedes")); //true/flase
	
	// remove
	cars.remove("Marcedes");
	System.out.println("after removing");
	for(String car : cars) {
		System.out.println(car);
		
	}
	}
	}


