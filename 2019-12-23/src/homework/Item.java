package homework;

public abstract class Item {
	protected String title;
	protected double price;
	
	private static int numberOfItems;

	public Item() {
		numberOfItems++;
	}

	public Item(String title, double price) {
		super();
		this.title = title;
		this.price = price;
		numberOfItems++;
	}
	
	public static int getNumberOfItems() {
		return numberOfItems;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
