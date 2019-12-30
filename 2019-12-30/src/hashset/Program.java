package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		names.add("a");
		names.add("b");
		names.add("c");
		names.add("d");

		System.out.println(names);
		names.add("b");
		names.add("ddddd");
		System.out.println(names);
		
//		Iterator<String> iterator = names.iterator();
//		while(iterator.hasNext()) {
//			String name = iterator.next();
//			System.out.println(name);
//		}
		
		for (String name : names) {
			if(name.length() > 3)
				System.out.println(name);
		}
		
		
		
		// Write a program that creates a Set of 5 random numbers (1-10)!
		
		HashSet<Integer> randomNums = new HashSet<Integer>();
		while(randomNums.size()<5) {
			randomNums.add((int)(Math.random()*10)+1);
		}
		
		System.out.println(randomNums);
		
		char[] colors = {'R', 'G', 'B', 'Y', 'O'};
		HashSet<Character> compColors = new HashSet<Character>();
		while(compColors.size()<3) {
			compColors.add(colors[(int)(Math.random()*colors.length)]);
		}
		
		System.out.println(compColors);
		
	}

}


















