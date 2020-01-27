package testing;

import java.sql.SQLException;

import beans.Company;
import db.CompanyDBDAO;
import db.ConnectionPool;
import exceptions.CompanyNotFoundException;

public class Test {

	public static void main(String[] args) {
		
		CompanyDBDAO compDB = new CompanyDBDAO();
		try {
			//compDB.addCompany(new Company("Coca", "123456", "coca@cola.com"));
			
			System.out.println("GET ALL:");
			System.out.println(compDB.getAllCompanies());
			
		} catch (SQLException e) {
			System.out.println("Add failed! " + e.getMessage());
		}
		
		
		try {
			System.out.println("GET ONE:");
			System.out.println(compDB.getOneCompany(3));
		} catch (SQLException | CompanyNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		
		
		ConnectionPool.getInstance().closeAllConnections();

	}

}
