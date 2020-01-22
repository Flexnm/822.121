package college;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program3 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class " + e.getMessage() + " was not found");
		}
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college?serverTimezone=UTC", "root", "1234")){
			
			PreparedStatement st = 
					con.prepareStatement("insert into students(first_name, last_name, email, grade, course_num) "
										+ " values(?, ?, ?, ?, ?)");
			st.setString(1, "Winnie");
			st.setString(2, "The Pooh");
			st.setString(3, "pooh@bear.biz");
			st.setInt(4, 87);
			st.setInt(5, 2);
			
			st.execute();
			
			
			
			
		}catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
