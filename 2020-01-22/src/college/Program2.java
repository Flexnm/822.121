package college;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Program2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class " + e.getMessage() + " was not found");
		}
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college?serverTimezone=UTC", "root", "1234")){
			
			PreparedStatement st = con.prepareStatement("select * from students where last_name like 'm%' AND grade between 60 AND 100");
			
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				System.out.println("id: " +rs.getInt(1) + ", " + rs.getString(2) + " " + rs.getString(3) + " got " + rs.getInt(5));
			}
			
			
		} catch(SQLException e) {
			System.out.println("Error: " +e.getMessage());
		}
	}

}
