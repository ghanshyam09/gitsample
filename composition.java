import java.util.*;

class Book {

	public String title;
	public String author;

	Book(String title, String author)
	{

		this.title = title;
		this.author = author;
	}
}

class Library {

	private final List<Book> books;
	Library(List<Book> books) { this.books = books; }
	public List<Book> getBooks()
	{
		return books;
	}
}

class composition {
	public static void main(String[] args)
	{

		Book b1
			= new Book("Java", "James Gosling");
		Book b2
			= new Book("c", "Dennis Ritchie");
		Book b3 = new Book("C++","Bjarne Stroustrup");

		List<Book> book = new ArrayList<Book>();
		book.add(b1);
		book.add(b2);
		book.add(b3);

		Library library = new Library(book);

		List<Book> books = library.getBooks();
		for (Book bk : books) {

			System.out.println("Title : " + bk.title
							+ " and "
							+ " Author : " + bk.author);
		}
	}
}
