package by.etc.java_online.programming_with_classes.task9;

public class View {
	
	public String bookInfo(Book book) {
		
		String info = String.format("\n | %-3d | %-25s | %-17s | %-4d | %-5d | %-4.2f | %-10s |",
				book.getId(), book.getAuthor(), book.getPublisher(), book.getYearOfPublishing(),
				book.getPageCount(), book.getPrice(), book.getBindingType());
		
		return info;
		
	}
	
	public String bookstoreInfo(Book[] bookshelf) {
		
		String str = "";
		
		for(Book iterator : bookshelf) {
			
			str = str + bookInfo( iterator );
			
		}
		return str;
	}
	
	public void printToConsole(Book book) {
		
		System.out.println( bookInfo( book ) );
		
	}
	
	
	public void printToConsole(Book[] bookshelf) {
		
		System.out.println( bookstoreInfo( bookshelf ) );
		
	}

}
