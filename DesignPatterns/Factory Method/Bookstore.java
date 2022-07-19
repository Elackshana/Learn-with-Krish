public abstract class Bookstore{
	
	public Book orderBook(){
		Book book = printBook();
		book.write();
		return book;
	}
	public abstract Book printBook();
}





