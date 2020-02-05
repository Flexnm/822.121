package beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Product {

	private int id;
	private String productName;
	private double listPrice;
	private String category;

	public Product(int id, String productName, double listPrice, String category) {
		super();
		this.id = id;
		this.productName = productName;
		this.listPrice = listPrice;
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		//return "Product [id=" + id + ", productName=" + productName + ", listPrice=" + listPrice + ", category="
		//		+ category + "]";
		
		return String.format("id = %s, product name = %s, list price = %s, category = %s", 
				id, productName, listPrice, category);
	}
	
}




















