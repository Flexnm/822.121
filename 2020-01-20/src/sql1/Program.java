package sql1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.cj.jdbc.Driver;

public class Program {
	public static void main(String[] args) {
		
		// load the mysql Driver to memory
		// java doesn't know the Driver yet...
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Did not find class: " + e.getMessage());
		}
		
		
		//insertNewEmployee();
		
//		insertNewEmployee2(12, "First1", "Last1");
//		insertNewEmployee2(13, "First2", "Last2");
//		insertNewEmployee2(14, "First3", "Last3");
		
		
		// insert new product into products table
		// id, product_name, list_price, description
		
//		insertNewProduct(100, "Magenta Nike Shoes", 4000, "THE nike shoes to buy");
		
		showAllEmployees();
		
	}

	
	private static void showAllEmployees() {
		try {
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind?serverTimezone=UTC", "root", "1234");
			
			PreparedStatement stmt = 
					con.prepareStatement("select id, first_name, email_address from employees order by email_address");
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id") +" " + rs.getString("first_name") +
						" " + rs.getString("email_address"));
			}
			
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void insertNewProduct(int id, String productName, double price, String description) {		
		try {
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind?serverTimezone=UTC", "root", "1234");
			
			PreparedStatement stmt = 
					con.prepareStatement("insert into products(id, product_name, list_price, description) " 
							+"values(?, ?, ?, ?)");
			stmt.setInt(1, id);
			stmt.setString(2, productName);
			stmt.setDouble(3, price);
			stmt.setString(4, description);

			stmt.execute();
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	
	private static void insertNewEmployee2(int id, String firstName, String lastName) {		
		try {
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind?serverTimezone=UTC", "root", "1234");
			
			PreparedStatement stmt = 
					con.prepareStatement("insert into employees(id, first_name, last_name) " 
							+"values(?, ?, ?)");
			stmt.setInt(1, id);
			stmt.setString(2, firstName);
			stmt.setString(3, lastName);

			stmt.execute();
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void insertNewEmployee() {
		// add a new Employee to Northwind
		
		try {
			// 1> open a connection
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind?serverTimezone=UTC", "root", "1234");
			

			// 2> create an SQL command
			PreparedStatement stmt = 
					con.prepareStatement("insert into employees(id, first_name, last_name) " 
							+"values(11, 'Donald', 'Trump')");

			// 3> Execute command!
			stmt.execute();
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}












