package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.Company;
import exceptions.CompanyNotFoundException;

public class CompanyDBDAO implements CompanyDAO {

	private ConnectionPool pool = ConnectionPool.getInstance();

	@Override
	public boolean isCompanyExists(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addCompany(Company company) throws SQLException {

		Connection con = pool.getConnection();

		try {
			// use the connection to add a new company to the companies table in DB
			PreparedStatement st = con.prepareStatement("insert into companies(name, password, email) values(?, ?, ?)");
			st.setString(1, company.getName());
			st.setString(2, company.getPassword());
			st.setString(3, company.getEmail());

			st.execute();

		} finally {
			pool.restoreConnection(con);
		}

	}

	@Override
	public void updateCompany(Company company) throws SQLException {
		Connection con = pool.getConnection();

		try {
			// use the connection to add a new company to the companies table in DB
			PreparedStatement st = 
					con.prepareStatement("update companies set name = ?, password = ?, email = ? where company_id=?");
			st.setString(1, company.getName());
			st.setString(2, company.getPassword());
			st.setString(3, company.getEmail());
			st.setInt(4, company.getCompanyId());

			st.execute();

		} finally {
			pool.restoreConnection(con);
		}

	}

	@Override
	public void deleteCompany(int companyId) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Company> getAllCompanies() throws SQLException {
		ArrayList<Company> companies = new ArrayList<Company>();
		Connection con = pool.getConnection();
		try {
			
			PreparedStatement st = con.prepareStatement("select * from companies");
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				companies.add(new Company(rs.getInt("company_id"), rs.getString("name"), rs.getString("password"), rs.getString("email")));
			}
			return companies;
		}finally {
			pool.restoreConnection(con);
		}
	}

	@Override
	public Company getOneCompany(int companyId) throws SQLException, CompanyNotFoundException{
		Connection con = pool.getConnection();
		try {
			
			PreparedStatement st = 
					con.prepareStatement("select * from companies where company_id=?");
			st.setInt(1, companyId);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				return new Company(rs.getInt("company_id"), rs.getString("name"), rs.getString("password"), rs.getString("email"));
			}
			
			//return null;
			throw new CompanyNotFoundException();
			
		}finally {
			pool.restoreConnection(con);
		}
	}

}













