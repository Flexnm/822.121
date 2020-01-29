package facades;

import java.sql.SQLException;
import java.util.ArrayList;

import beans.Company;
import db.CompanyDBDAO;

public class AdminFacade extends ClientFacade {
	
	
	
	public void addCompany(Company company) throws SQLException {
		
		ArrayList<Company> companies = compDB.getAllCompanies();
		for (Company comp : companies) {
			if(comp.getName().equals(company.getName()) 
					|| comp.getEmail().equals(company.getEmail())) {
				throw new CompanyExistsException();
			}
		}
		
		compDB.addCompany(company);
	}
	
	
	public void deleteCompany(int id) throws SQLException {
		compDB.deleteCompany(id);
	}


	@Override
	public boolean login(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
