package college;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class " + e.getMessage() + " was not found");
		}
		
		try(Scanner scan = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college?serverTimezone=UTC", "root", "1234")){
			
			PreparedStatement ps = con.prepareStatement("insert into students(first_name, last_name, email, grade) values(?, ?, ?, ?)");
			System.out.print("Please enter your first name: ");
			ps.setString(1, scan.next());
			System.out.print("Please enter your last name: ");
			ps.setString(2, scan.next());
			System.out.print("Please enter your email: ");
			ps.setString(3, scan.next());
			System.out.print("Please enter your grade: ");
			ps.setInt(4, scan.nextInt());
			
			ps.execute(); // run the INSERT command!!
			System.out.println("Student inserted successfully...");
			
		} catch(SQLException e) {
			System.out.println("Error: " +e.getMessage());
		}
		
		// 1) display all students with grades equals or greater than 60
		// 2) display all students with last name that begins with "M" and 
		//    grade between 80 and 100 

	}

}



















