package collections;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) {
		 
//		ArrayList myList = new ArrayList();
//		System.out.println(myList.size());
//		myList.add(22);
//		myList.add(34);
//		myList.add(109);
//		System.out.println(myList.size());
//		System.out.println(myList.toString());
//		
//		myList.remove(1);
//		System.out.println(myList.toString());
//		
//		System.out.println("index 1: "+ myList.get(1));
//		myList.set(1, 555);
//		System.out.println(myList.toString());
//		
//		//myList.clear();
//		//System.out.println("after clear: " + myList.toString());
//		
//		myList.add("Nir");
//		myList.add(new Car("Porsche", "Red"));
//		System.out.println(myList.toString());
//		
//		Car myCar = (Car) myList.get(1);
//		System.out.println(myCar);
		
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Nir");
		strings.add("111");
		//strings.add(new Car("", ""));
		strings.add(2,"last");
		System.out.println(strings);
		
		
//		ArrayList<Integer> nums = new ArrayList<Integer>();
//		nums.add(111);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Anat");
		names.add("Yossi");
		names.add("Danni");
		
		//strings.addAll(names);
		strings.add(names.get(1));
		System.out.println(strings);

	}

}






