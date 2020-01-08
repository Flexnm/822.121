import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		
		try(
			FileWriter writer = new FileWriter("c:\\nir\\wtf.nir");
			Scanner scan = new Scanner(System.in)
		){
			
			System.out.println("Enter 1st sentence: ");
			String txt1 = scan.nextLine();
			System.out.println("Enter 2nd sentence: ");
			String txt2 = scan.nextLine();
			
			writer.write(txt1 + "\n");
			writer.write(txt2 + "\n");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
