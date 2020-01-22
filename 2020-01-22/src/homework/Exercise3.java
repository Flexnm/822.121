package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exercise3 {

	public static void main(String[] args) {
		// 1
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class " + e.getMessage() + " was not found");
		}

		// 2
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind?serverTimezone=UTC",
					"root", "1234")) {
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind?serverTimezone=UTC",
//					"root", "1234");
			PreparedStatement ps = con
					.prepareStatement("SELECT count(id) from orders");
			ResultSet rs = ps.executeQuery();
//			while (rs.next()) {
//				System.out.println("Count = " + rs.getInt(1) );
//			}
			rs.first(); // move ResultSet to first (and only) row!
			System.out.println("Count = " + rs.getInt(1) );

			
			
		} catch (SQLException e) {
			System.out.println("Error! " + e.getMessage());
//					e.printStackTrace();
		}

	}

}
