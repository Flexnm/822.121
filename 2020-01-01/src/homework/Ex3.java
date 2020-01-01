package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a story: ");
		String text = scan.nextLine();
		
		HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
		for (int i = 0; i < text.length(); i++) {
			char tav = text.charAt(i);
			
			if(letters.containsKey(tav)) {
//				int countTav = letters.get(tav); // the current tav counter
//				countTav++; // increment the counter
//				letters.put(tav, countTav);
				
				letters.put(tav, letters.get(tav)+1);
			} else {
				letters.put(tav, 1);
			}
		}
		
		System.out.println(letters);
		
//		HashMap<String, ArrayList<Integer>> wow = new HashMap<String, ArrayList<Integer>>();
//		wow.put("ofir", new ArrayList<Integer>());
//		
//		wow.get("ofir").add(100);
//		wow.get("ofir").add(89);
//		wow.get("ofir").add(96);
//		
//		System.out.println(wow.get("ofir"));

	}

}
