package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.CategoryType;
import beans.Coupon;

public class CouponDBDAO {
	
	private ConnectionPool pool = ConnectionPool.getInstance();
	
	public void addCoupon(Coupon coupon) throws SQLException {
		Connection con = pool.getConnection();
		try {
			
			PreparedStatement ps = con.prepareStatement("insert into coupons(company_id, title, category_id, start_date, end_date, amount) values(?,?,?,?,?,?)");
			ps.setInt(1, coupon.getCompanyId());
			ps.setString(2, coupon.getTitle());
			ps.setInt(3, coupon.getCategory().ordinal()+1);
			ps.setDate(4, coupon.getStartDate());
			ps.setDate(5, coupon.getEndDate());
			ps.setInt(6, coupon.getAmount());
			
			ps.execute();
			
			
		} finally {
			pool.restoreConnection(con);
		}
	}
	
	public Coupon getOneCoupon(int id) throws SQLException {
		Connection con = pool.getConnection();
		try {
			
			/*
			PreparedStatement ps = con.prepareStatement("select * from coupons join categories on coupons.category_id = categories.category_id where coupon_id=" + id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.first()) {
				return new Coupon(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getDate(5), 
					rs.getInt(6), CategoryType.valueOf(rs.getString("category_name")))
			} else {
				//return null;
				throw new CouponNotFoundException();
			}
			*/
			
			PreparedStatement ps = con.prepareStatement("select * from coupons where coupon_id=" + id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.first()) {
				return new Coupon(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getDate(5), 
						rs.getInt(6), CategoryType.values()[rs.getInt("category_id")-1]);
			} else {
				return null;
				//throw new CouponNotFoundException();
			}
			
		} finally {
			pool.restoreConnection(con);
		}
	}
	
	
}






















