package hashmap;

import java.util.HashMap;

public class Program {

	public static void main(String[] args) {
		
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		
		students.put(1111, "Nir Gal");
		students.put(2222, "Avi Cohen");
		students.put(3333, "Avi Cohen");
		System.out.println(students);
		
		students.put(1111, "Shiri B.");
		System.out.println(students);
		
		if(students.containsKey(1112)) {
			System.out.println("Found id 1112");
		} else {
			System.out.println("Did not find id 1112");
		}
		
		System.out.println(students.get(2222));
		System.out.println("***********************");
		System.out.println("keys: " + students.keySet() );
		
		System.out.println("***********************");
		for (int key : students.keySet()) {
			System.out.println(key + ": " + students.get(key));
		}
		
		// create a HashMap of customer names attached to cutomer emails
		// add a few emails and names to the Map
		
	}

}
