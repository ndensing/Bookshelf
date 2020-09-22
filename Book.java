public class Book {
	
	private String title;
	private String author;
	private long isbn;
	
	public Book(String title, String author, long isbn) {
		title = this.title;
		author = this.author;
		isbn = this.isbn;	
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public long getIsbn() {
		return isbn;
	}
	
	public int hash() {
		String isbnString = Long.toString(isbn);
		return (author.hashCode() + 31*isbnString.hashCode());
	}
}
