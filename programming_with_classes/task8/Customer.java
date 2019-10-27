package by.etc.java_online.programming_with_classes.task8;

/*
 * Создать класс Customer, спецификация которого приведена ниже.
 *  Определить конструкторы, set- и get- методы и метод toString().
 *  Создать второй класс, агрегирующий массив типа Customer, с подходящими
 *  конструкторами и методами. Задать критерии выбора данных и вывести эти 
 *  данные на консоль. Класс Customer: id, фамилия, имя, отчество, адрес,
 *  номер кредитной карточки, номер банковского счета. 
 *  Найти и вывести:  
 *  	a) список покупателей в алфавитном порядке;  
 *  	b) список покупателей, у которых номер кредитной карточки находится 
 *  в заданном интервале.
 *  
 */

public class Customer {
	
	public Customer(int id, String lastName, String firstName, String middleName,
			String address, int creditCardNumber, int bankAccountNumber) {
		
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	private int id;
	private String lastName;
	private String firstName;
	private String middleName;
	private String address;
	private int creditCardNumber;
	private int bankAccountNumber;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		
		return String.format("\t %-10s %-10s %-11s %-6d   %-24s %-11s %-14s\n", getLastName(), getFirstName(),
				getMiddleName(), getId(), getAddress(), getCreditCardNumber(), getBankAccountNumber());
		
	}
	
	
}
