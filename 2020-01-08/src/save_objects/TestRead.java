package save_objects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestRead {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("c:\\nir\\car.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Car c = (Car) ois.readObject();
			System.out.println(c);
			
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
