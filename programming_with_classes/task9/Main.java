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
		View view = new View();
		Book[] allBooks = store.getAllBooks();
		
		String author = "Michael Sipser";
		String publisher = "Cisco Press";
		int publishYear = 2015;
		
		
		store.addBook( new Book( 658, "Milkman: A Novel", "Anna Burns", "Graywolf Press", 2018, 360, 7.91, "paperback") );
		store.addBook( new Book( 357, "Introduction to Algorithms", "Charles E. Leiserson", "The MIT Press", 2009, 1292, 73.83, "hardcover") );
		store.addBook( new Book( 853, "SQL in 10 Minutes, Sams Teach Yourself", "Ben Forta", "Sams Publishing", 2012, 288, 25.78, "paperback") );
		store.addBook( new Book( 653, "Introduction to the Theory of Computation", "Michael Sipser", "Cengage Learning", 2012, 504, 76.55, "hardcover") );
		store.addBook( new Book( 364, "CCNA Routing and Switching", "Wendell Odom", "Cisco Press", 2016, 9998, 52.66, "hardcover") );
		store.addBook( new Book( 101, "Test array overflow", "Random author", "Random publisher", 2019, 1000, 99.99, "e-book") );
		
		System.out.println("\n Cписок книг автора " + author + ":\n ");
		
		Book[] byAuthor = storeLogic.filterByAuthor(allBooks, author);
		view.printToConsole( byAuthor );
		
		System.out.println("\n Книги, выпущенные издательством " + publisher + ":\n ");
		
		Book[] byPublisher = storeLogic.filterByPublisher(allBooks, publisher);
		view.printToConsole(byPublisher);
		
		
		System.out.println("\n список книг, выпущенных после "  + publishYear + " года:\n");
		
		Book[] byYear = storeLogic.publishedAfter(allBooks, publishYear);
		view.printToConsole( byYear );
	}
}
