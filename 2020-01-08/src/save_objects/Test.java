package save_objects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		
		Car car1 = new Car("Ferrari 458", "Bright Green", 2019, false);
//		System.out.println(car1);
		
		try(
			FileOutputStream fos = new FileOutputStream("c:\\nir\\car.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(car1);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
