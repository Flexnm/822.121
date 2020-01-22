package college;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program4 {

	public static void main(String[] args) {
		// show all: first name, last name, grade, course name, teacher name
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class " + e.getMessage() + " was not found");
		}
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college?serverTimezone=UTC", "root", "1234")){
			
			PreparedStatement st = 
					con.prepareStatement("select students.first_name, students.last_name, students.grade, courses.name, teachers.fullname" + 
							" from students" + 
							" join courses" + 
							" on students.course_num = courses.course_number" + 
							" join teachers" + 
							" on students.course_num = teachers.course_number");
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " got " + rs.getInt(3) + " in course " + rs.getString(4) + " with " + rs.getString(5));
			}
			
			
			
		}catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
