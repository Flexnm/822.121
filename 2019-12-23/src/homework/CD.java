package homework;

public class CD extends Item{
//	private String title;
//	private double price;
	private String band;
	
	public CD() {}
	
	public CD(String title, double price, String band) {
		super(title, price);
		this.band = band;
	}

//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	@Override
	public String toString() {
		return "CD [title=" + title + ", price=" + price + ", band=" + band + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
