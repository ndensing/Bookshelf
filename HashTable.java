import java.util.NoSuchElementException;

public interface HashTable {
	public int hashFunction(Book book);
	public boolean add(int hashKey , Book book);
	public Book get(int hashKey) throws NoSuchElementException;
	public int size();
	public boolean containsKey(int hashKey);
	public Book remove(int hashKey);
	public void clear();
	//public int hash();
}
