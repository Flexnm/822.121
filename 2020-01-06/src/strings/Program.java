package strings;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = new String("Hello2");
		
		System.out.println("length: " + str1.length());
		System.out.println("char at 0: " + str1.charAt(0));
		System.out.println("last char: " + str1.charAt(str1.length()-1));
		System.out.println("Index of 'l': " + str1.indexOf("l"));
		System.out.println("Last index of 'l': " + str1.lastIndexOf("l"));
		System.out.println("Is \"ell\" in str1? " + str1.contains("ell"));
		System.out.println("Start with 'H': "  +str1.startsWith("H"));
		
		System.out.println("Substring from index 3: " + str1.substring(3));
		// includes 0, does not include 4!!
		System.out.println("Substring from 0 to 4: " + str1.substring(0, 4)); 
		System.out.println("replace 'l' with 'g': " + str1.replace('l', 'g'));		
		System.out.println("str1 compare to str2: " + str1.compareTo(str2));
		
		System.out.println("str1 = " + str1);
		
		
		String sentence = "hello world! how are you?";
		String[] words = sentence.split(" ");
		//System.out.println(Arrays.toString(words));
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
		// STRING IS IMMUTABLE! 
		//IT DOES NOT CHANGE IN MEMORY
		
		String s1 = "a";
		for(int i=0; i<10; i++) {
			s1 += "b";
		}
		System.out.println("s1 = " + s1);
		
		StringBuilder builder = new StringBuilder();
		for(int i=0; i<10; i++) {
			builder.append("b");
		}
		System.out.println("builder = " + builder);
		
		
	}

}

















