package by.etc.java_online.programming_with_classes.task9;

/*
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
 * и метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *   
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.  
 * Найти и вывести:  
 * a) список книг заданного автора;  
 * b) список книг, выпущенных заданным издательством;  
 * c) список книг, выпущенных после заданного года
 */

public class Book {
	
	public Book(int bookId, String bookTitle, String bookAuthor, String publisher,
			int yearOfPublishing, int pageCount, double price, String bookbindingType) {
		
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.publisher = publisher;
		this.yearOfPublishing = yearOfPublishing;
		this.pageCount = pageCount;
		this.price = price;
		this.bookbindingType = bookbindingType;
		
	}

	@Override
	public String toString() {
		return "\nBook [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ","
				+ " publisher=" + publisher + ", yearOfPublishing=" + yearOfPublishing + ","
				+ " pageCount=" + pageCount + ", price=" + price + ", bookbindingType=" 
				+ bookbindingType + "]";
	}

	private int bookId;
	private String bookTitle;
	private String bookAuthor;	
	private String publisher;
	private int yearOfPublishing;
	private int pageCount;
	private double price;
	private String bookbindingType; // дженерики?
	
	public int getBookId() {
		return bookId;
	}
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public int getYearOfPublishing() {
		return yearOfPublishing;
	}
	
	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}
	
	public int getPageCount() {
		return pageCount;
	}
	
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getBookbindingType() {
		return bookbindingType;
	}
	
	public void setBookbindingType(String bookbindingType) {
		this.bookbindingType = bookbindingType;
	}
	
}
