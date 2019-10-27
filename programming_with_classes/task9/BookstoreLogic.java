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

public class BookstoreLogic {
	
	public Book[] filterByAuthor(Book[] bookshelf, String authorSearchReqest) {
		
		Book[] filteredBooks = new Book[bookshelf.length];
		Book currentBook;
		
		String currentBookAuthor;
		int cellIndex = 0;
		
		for(int i = 0; i < bookshelf.length; i++) {
			
			currentBook = bookshelf[i];
			currentBookAuthor = currentBook.getAuthor();
			
			if( currentBookAuthor.contains( authorSearchReqest ) ) {
				
				filteredBooks[cellIndex] = bookshelf[i];
				cellIndex++;
			}
		}
		
		return removeEmptyArrayCells(filteredBooks, cellIndex);
	}
	
	private Book[] removeEmptyArrayCells(Book[] sourceArray, int arraySize) {
		
		if(sourceArray.length == arraySize) {
			return sourceArray;
		}
		
		Book[] newArray = new Book[arraySize];
		
		for(int i = 0; i < arraySize; i++) {
			
			newArray[i] = sourceArray[i];
			
		}
		return newArray;
	}
	
	public Book[] filterByPublisher(Book[] allbooks, String publisherSearchReqest) {
		
		Book[] filteredBooks = new Book[allbooks.length];
		Book currentBook;
		
		int cellIndex = 0;
		String currentBookPublisher;
		
		for(int i = 0; i < allbooks.length; i++) {
			
			currentBook = allbooks[i];
			currentBookPublisher = currentBook.getPublisher();
			
			if( currentBookPublisher.contentEquals(publisherSearchReqest) ) {
				
				filteredBooks[cellIndex] = allbooks[i];
				cellIndex++;
				
			}
		}
		return removeEmptyArrayCells(filteredBooks, cellIndex);
	}
	
	public Book[] publishedAfter(Book[] bookshelf, int publishYear) {
		
		Book[] filteredBooks = new Book[bookshelf.length];
		Book currentBook;
		int currentBookPublishYear;
		
		int cellIndex = 0;
		
		for(int i = 0; i < bookshelf.length; i++) {
			
			currentBook = bookshelf[i];
			currentBookPublishYear = currentBook.getYearOfPublishing();
			
			if( publishYear > currentBookPublishYear ) {
				
				filteredBooks[cellIndex] = bookshelf[i];
				cellIndex++;
			}
		}
		return removeEmptyArrayCells(filteredBooks, cellIndex);
	}
}
