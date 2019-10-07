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
	
	public Book[] filterByAuthor(Book[] allbooks, String author) {
		
		Book[] filteredBooks = new Book[allbooks.length];
		int cellIndex = 0;
		
		for(int i = 0; i < allbooks.length; i++) {
			
			if( allbooks[i].getBookAuthor().contains(author) ) {
				
				filteredBooks[cellIndex] = allbooks[i];
				cellIndex++;
			}
		}
		
		return removeEmptyArrayCells(filteredBooks, cellIndex);
	}
	
	public Book[] removeEmptyArrayCells(Book[] sourceArray, int arraySize) {
		
		if(sourceArray.length == arraySize) {
			return sourceArray;
		}
		
		Book[] newArray = new Book[arraySize];
		
		for(int i = 0; i < arraySize; i++) {
			
			newArray[i] = sourceArray[i];
			
		}
		
		return newArray;
	}
	
	public Book[] filterByPublisher(Book[] allbooks, String publisher) {
		
		Book[] filteredBooks = new Book[allbooks.length];
		int cellIndex = 0;
		
		for(int i = 0; i < allbooks.length; i++) {
			
			if( allbooks[i].getPublisher().contentEquals(publisher) ) {
				
				filteredBooks[cellIndex] = allbooks[i];
				cellIndex++;
			}
		}
		
		return removeEmptyArrayCells(filteredBooks, cellIndex);
	}
	
	public Book[] publishedAfter(Book[] allbooks, int publishYear) {
		
		Book[] filteredBooks = new Book[allbooks.length];
		int cellIndex = 0;
		
		for(int i = 0; i < allbooks.length; i++) {
			
			if( allbooks[i].getYearOfPublishing() > publishYear ) {
				
				filteredBooks[cellIndex] = allbooks[i];
				cellIndex++;
			}
		}
		
		return removeEmptyArrayCells(filteredBooks, cellIndex);
		
	}
	
	

}
