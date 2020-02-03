import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Company;
import config.SpringConfig;
import db.CompanyDBDAO;

public class Program3 {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class)){
			CompanyDBDAO compDB = ctx.getBean(CompanyDBDAO.class);
			try {
				compDB.addCompany(new Company("comp1", "password", "email"));
			} catch (SQLException e) {
				System.out.println("ERROR!" + e.getMessage());
			}
		}

	}

}
