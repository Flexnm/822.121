package hashmap;

import java.util.HashMap;

public class Program2 {

	public static void main(String[] args) {
		
		HashMap<String, String> customers = new HashMap<String, String>();
		customers.put("ido@amazon.com", "Ido Berkenfeld");
		customers.put("anat@microsoft.com", "Anat Sheker Kulsheho");
		customers.put("bar@minan.co.il", "Bar Minan");
		
		System.out.println(customers);
		customers.put("ido@amazon.com", "Ido Doe");
		System.out.println(customers);
	}

}
