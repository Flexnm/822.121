package homework;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		Store2 store = new Store2();
		Book book1 = new Book("OOP for begginers", 10000.90, "Eldar");
		store.addItem(book1);
		Book book2 = new Book("Harry Potter", 5.78, "J.K. Rowling");
		store.addItem(book2);
		
		CD cd1 = new CD("Ride", 120, "21 Pilots");
		CD cd2 = new CD("SomeAlbum", 45, "SomeBand");
		store.addItem(cd1);
		store.addItem(cd2);
		
		System.out.println(Arrays.toString(store.getItems()));
		
		System.out.println("Number of books: " + Book.numberOfBooks);
		System.out.println("Number of items: " + Item.getNumberOfItems());
		
		store.delteItem(0);
		//System.out.println(Arrays.toString(store.getItems()));
		for (int i = 0; i < store.getItems().length; i++) {
			if(store.getItem(i) != null)
				System.out.println(store.getItem(i));
		}
		
		

	}

}
