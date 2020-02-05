package app;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Product;
import config.SpringConfig;
import db.ProductsDBDAO;

public class Program {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx
				= new AnnotationConfigApplicationContext(SpringConfig.class)){
			
			ProductsDBDAO prodDB = ctx.getBean(ProductsDBDAO.class);
			// get all products
//			List<Product> products = prodDB.getAllProducts();
//			for (Product product : products) {
//				System.out.println(product);
//			}
			
			// get one product
//			System.out.println(prodDB.getOneProduct(34));
			
			// delete product
//			prodDB.deleteProduct(99);
			
			// add new product
			prodDB.addProduct(new Product(99, "Chicken Soup", 1.99, "Soups"));
			prodDB.addProduct(ctx.getBean(Product.class, 100, "Nutella", 25.87, "Sweets"));
			
		}

	}

}








