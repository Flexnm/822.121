package errors;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> texts = new ArrayList<String>();
		texts.add("A");
		texts.add("B");
		texts.add("C");
		texts.add("D");
		
		System.out.println(texts);
		
		try {
			texts.remove(10);
			texts.add(10, "New text here");
		} catch (IndexOutOfBoundsException k) {
			System.out.println("Error! " + k.getMessage());
		}

		System.out.println(texts);
		System.out.println("This is the end...");
	}

}
