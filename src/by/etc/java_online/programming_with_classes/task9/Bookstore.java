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

public class Bookstore {
	
	public Bookstore(int booksCount) {
		bookshelf = new Book[booksCount];
	}
	
	private Book[] bookshelf;
	
	private int bookCounter = 0;
	
	public Book[] getAllBooks() {
		return bookshelf;
	}
	
	public void addBook(int bookId, String bookTitle, String bookAuthor, String publisher,
			int yearOfPublishing, int pageCount, double price, String bookbindingType) {
		
		if( bookCounter < bookshelf.length ) {
			Book newbook = new Book(bookId, bookTitle, bookAuthor, publisher, yearOfPublishing, 
					pageCount, price, bookbindingType);
			bookshelf[bookCounter++] = newbook;
		} else {
			System.out.println("Массив книг переполнен");
		}
	}
	
	public String toString(Book[] books) {
		
		String str = "\n";
		for(Book iterator : books) {
			
			str = str + iterator.toString();
			
		}
		return str;
	}
	
	public String toString() {
		
		return toString(bookshelf);
		
	}
}
