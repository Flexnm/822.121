import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
//		FileWriter writer = null;
//		
//		try {
//			writer = new FileWriter("c:\\nir\\test.txt");
//			writer.write("Shalom olam!\n");
//			writer.write("Bye world...\n");
//			//writer.close();
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			try {
//				writer.close();
//			} catch (IOException e) {
//				System.out.println(e.getMessage());
//			}
//		}
		
		try(FileWriter writer = new FileWriter("c:\\nir\\test.txt", true)){
			writer.write("Shalom olam!\n");
			writer.write("Bye world...\n");
			writer.write("\n65\n");
			int x = 100;
			writer.write(String.valueOf(x));
			
			writer.write("The end?");
			
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
