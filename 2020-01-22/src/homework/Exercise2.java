package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exercise2 {

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
			
			PreparedStatement ps = con
					.prepareStatement("select product_name, list_price, supplier_ids from products where "
							+ "list_price > 30 and supplier_ids in (1,3)");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getDouble(2) + " " + rs.getInt(3));
			}

		} catch (SQLException e) {
			System.out.println("Error! " + e.getMessage());
//					e.printStackTrace();
		}

	}

}
