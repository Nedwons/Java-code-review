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
	
	private Book[] bookshelf;
	
	private static int bookCounter;
	
	public Bookstore(int booksCount) {
		
		bookshelf = new Book[booksCount];
		bookCounter = 0;
		
	}
	
	public Book[] getAllBooks() {
		return bookshelf;
	}
	
	public boolean addBook(Book newBook) {
		
		boolean successfulBookAddition = false; 
		
		if( bookCounter < bookshelf.length ) {
			
			bookshelf[ bookCounter++ ] = newBook;
			successfulBookAddition = true;
			
		} 
		
		return successfulBookAddition;
	}
}
