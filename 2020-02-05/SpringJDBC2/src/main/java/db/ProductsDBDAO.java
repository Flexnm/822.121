package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import beans.Product;

@Component
public class ProductsDBDAO implements RowMapper<Product> {

	@Autowired
	private JdbcTemplate dbt;
	
	public void addProduct(Product product) {
		dbt.update("insert into products(id, product_name, list_price, category) values(?,?,?,?) ",
				product.getId(), product.getProductName(), product.getListPrice(), product.getCategory());
		
		//String sql = String.format("insert into products(...) values(%s, '%s', %s, '%s') ", 
		//		product.getId(), product.getProductName(), product.getListPrice(), product.getCategory());
		//dbt.update(sql);
	}
	
	public void deleteProduct(int id) {
		dbt.update("delete from products where id=" + id);
	}
	
	public List<Product> getAllProducts(){
		return dbt.query("select id, product_name, list_price, category from products", this);
	}

	public Product getOneProduct(int id) {
		return dbt.queryForObject("select id, product_name, list_price, category from products where id="+id, this);
	}
	
	
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4));
	}
	
	
	
}
















