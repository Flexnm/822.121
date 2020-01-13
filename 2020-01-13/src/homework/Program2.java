package homework;

import java.io.FileWriter;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) {
		
		try(FileWriter writer = new FileWriter("data.txt")){
			
			writer.write("Hello this is my first line of text.\n");
			writer.write("Second line here...\n");
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
