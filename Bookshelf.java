import java.util.NoSuchElementException;

public class Bookshelf implements HashTable {
	
	private Book[] bookshelf;
	private int size;
	
	public int hashFunction(Book book) {
		return book.hash();
	}
	public boolean add(int hashKey , Book book) {
		return true;
	}
	
	public Book get(int hashKey) throws NoSuchElementException {
		Book book = Book("The Oddysey", "Homer", 9780140268867L);
		return book;
	}
	
	public int size() {
		return size;
	}
	public boolean containsKey(int hashKey) {
		for (int i = 0; i < size; i++) {
			if (bookshelf[i].hash() == hashKey)
				return true;
		}
		return false;
	}
	public Book remove(int hashKey) {
		Book book = Book("The Oddysey", "Homer", 9780140268867L);
		return book;
	}
	public void clear() {
		bookshelf = null;
		size = 0;
	}
}
