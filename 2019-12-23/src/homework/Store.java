package homework;

public class Store {
	private Book[] books = new Book[10];
	private CD[] cds = new CD[10];

	// add a new book to the array
	public void addBook(Book book) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				break;
			}
		}
	}

	// delete book from array by index
	public void deleteBook(int index) {
		if (index >= 0 && index < books.length) {
			books[index] = null;
		} else {
			System.out.println("Index is out of bounds!");
		}
	}

	// get book by index from array
	public Book getBook(int index) {
		if (index >= 0 && index < books.length) {
			return books[index];
		} else {
			System.out.println("Index is out of bounds!");
			return null;
		}
	}
	


	// get all books
	public Book[] getBooks() {
		return books;
	}

	// add a new CD to the array
	public void addCD(CD cd) {
		for (int i = 0; i < cds.length; i++) {
			if (cds[i] == null) {
				cds[i] = cd;
				break;
			}
		}
	}

	// delete CD from array by index
	public void deleteCD(int index) {
		if (index >= 0 && index < cds.length) {
			cds[index] = null;
		} else {
			System.out.println("Index is out of bounds!");
		}
	}

	// get CD by index from array
	public CD getCD(int index) {
		if (index >= 0 && index < cds.length) {
			return cds[index];
		} else {
			System.out.println("Index is out of bounds!");
			return null;
		}
	}

	// get all CDs
	public CD[] getCDs() {
		return cds;
	}

}
