package by.etc.java_online.programming_with_classes.task8;

public class Main {

	public static void main(String[] args) {
		
		CustomerService service = new CustomerService();
		
		System.out.println("Исходный список клиентов: \n \n");
		System.out.println( service.toString() );
		
		System.out.println("Список отсортированный в алфавитном порядке по фамилиям: \n \n");
		
		service.sortCustomerByAlfabet();
		System.out.println( service.toString() );
		
		Customer[] customer = service.filterCustomerByCreditCardNumber(100, 500);
		System.out.println("Клиенты с кридитными картами из выбранного диапазона: \n");
		System.out.println( service.toString( customer ) );

	}

}
