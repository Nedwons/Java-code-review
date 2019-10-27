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
	
	private int id;
	private String title;
	private String author;	
	private String publisher;
	private int yearOfPublishing;
	private int pageCount;
	private double price;
	private String bindingType; 
	
	public Book(int id, String title, String author, String publisher,
			int yearOfPublishing, int pageCount, double price, String bindingType) {
		
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.yearOfPublishing = yearOfPublishing;
		this.pageCount = pageCount;
		this.price = price;
		this.bindingType = bindingType;
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int bookId) {
		this.id = bookId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
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
	
	public String getBindingType() {
		return bindingType;
	}
	
	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}
	
}
