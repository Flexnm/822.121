package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import beans.Company;

@Component
@Scope("prototype")
public class CompanyDBDAO implements CompanyDAO {

	@Autowired
	private ConnectionPool pool;
	
	@Override
	public boolean isCompanyExists(String email, String password) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addCompany(Company company) throws SQLException {
		
		Connection con = pool.getConnection();
		try {
			
			System.out.println("ADDING NEW COMPANY TO DB....");
			
			
		}finally {
			pool.restoreConnection(con);
		}

	}

	@Override
	public void updateCompany(Company company) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCompany(int companyId) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Company> getAllCompanies() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company getOneCompany(int companyId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
