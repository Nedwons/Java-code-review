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

public class Main {

	public static void main(String[] args) {
	
		Bookstore store = new Bookstore(5);
		BookstoreLogic storeLogic = new BookstoreLogic();
		
		store.addBook(658, "Milkman: A Novel", "Anna Burns", "Graywolf Press", 2018, 360, 7.91, "paperback");
		store.addBook(357, "Introduction to Algorithms", "Charles E. Leiserson", "The MIT Press", 2009, 1292, 73.83, "hardcover");
		store.addBook(853, "SQL in 10 Minutes, Sams Teach Yourself", "Ben Forta", "Sams Publishing", 2012, 288, 25.78, "paperback");
		store.addBook(653, "Introduction to the Theory of Computation", "Michael Sipser", "Cengage Learning", 2012, 504, 76.55, "hardcover");
		store.addBook(364, "CCNA Routing and Switching 200-125 Official Cert Guide Library", "Wendell Odom", "Cisco Press", 2016, 9998, 52.66, "hardcover");
		
		System.out.println("\n Cписок книг заданного автора");
		
		Book[] byAuthor = storeLogic.filterByAuthor(store.getAllBooks(), "Michael Sipser");
		System.out.println( store.toString( byAuthor ) );
		
		System.out.println("\n список книг, выпущенных заданным издательством");
		
		Book[] byPublisher = storeLogic.filterByPublisher(store.getAllBooks(), "Cisco Press");
		System.out.println( store.toString( byPublisher ) );
		
		System.out.println("\n список книг, выпущенных после заданного года");
		
		Book[] byYear = storeLogic.publishedAfter(store.getAllBooks(), 2015);
		System.out.println( store.toString( byYear ) );
	}
	
	
}
