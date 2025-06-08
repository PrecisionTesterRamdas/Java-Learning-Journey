package step03_constructors;

public class Book {
	String title;
	String author;
	double price;

	Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void displayBooks() {
		System.out.println("Title: " + title + "| Author: " + author + "| Price: " + price);

	}

	public static void main(String[] args) {
		Book book1 = new Book("Book A", "Author A", 200.5);
		Book book2 = new Book("Book B", "Author B", 100);
		Book book3 = new Book("Book C", "Author C", 300);
		Book[] library = new Book[3];
		library[0] = book1;
		library[1] = book2;
		library[2] = book3;

		for (Book bk : library) {
			bk.displayBooks();
		}
	}
}