import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) {
		
		try(FileReader reader = new FileReader("c:\\nir\\test.txt")){
			
			int tav = reader.read();
			while(tav != -1) {
				System.out.print((char)tav);
				tav = reader.read();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 

	}

}
