package homework;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Store store = new Store();
		
		// create a new book and add it to the store
		Book book1 = new Book("OOP for begginers", 10000.90, "Eldar");
		store.addBook(book1);
		// create a new book and add it to the store
		Book book2 = new Book("Harry Potter", 5.78, "J.K. Rowling");
		store.addBook(book2);
		// print the books in the store
		System.out.println(Arrays.toString(store.getBooks()));
		
		// delete 2nd book
		store.deleteBook(1);
		System.out.println(Arrays.toString(store.getBooks()));

		// get the first book in the store
		Book book3 = store.getBook(0);
		//System.out.println(book3);
		book3.setPrice(100);
		System.out.println(Arrays.toString(store.getBooks()));
		
		System.out.println("***********************");
		
		CD cd1 = new CD("Ride", 120, "21 Pilots");
		store.addCD(cd1);
		CD cd2 = new CD("SomeAlbum", 45, "SomeBand");
		store.addCD(cd2);
		
		System.out.println(Arrays.toString(store.getCDs()));
		
		store.deleteCD(0);
		System.out.println(Arrays.toString(store.getCDs()));
		
		CD myCD = store.getCD(1);
		myCD.setBand("A new band...");
		System.out.println(Arrays.toString(store.getCDs()));
		
		
	}












}
