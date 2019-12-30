package arrylist;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<String> texts = new ArrayList<String>();
		texts.add("One");
		texts.add("Two");
		texts.add(1, "Three");
		
		System.out.println(texts);
		texts.set(1, "Four");
		System.out.println(texts);

		texts.remove(1);
		System.out.println(texts);
		
		//System.out.println(texts.get(0));
		
//		for (int i = 0; i < texts.size(); i++) {
//			System.out.println(texts.get(i));
//		}
		
		for (String txt : texts) {
			System.out.println(txt);
		}
		
	}

}
