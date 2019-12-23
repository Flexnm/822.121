package homework;

public class Book extends Item {
//	private String title;
//	private double price;
	private String author;
	
	public static int numberOfBooks;
	
	public Book() {
		numberOfBooks++;
	}
	
	public Book(String title, double price, String author) {
		super(title, price);
		this.author = author;
		
		numberOfBooks++;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", author=" + author + "]";
	}
	
	
}
