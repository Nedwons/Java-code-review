package by.etc.java_online.programming_with_classes.task10;

import by.etc.java_online.programming_with_classes.task10.date.Date;

/*
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- 
 * методы и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими
 * конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.  
 * 
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.  
 * Найти и вывести:  
 * a) список рейсов для заданного пункта назначения;  
 * b) список рейсов для заданного дня недели;  
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного. 
 */

public class Airline {
	
	private String destinationPoint;
	private String flightNumber;
	private String airplaneType;
	private Date scheduledDepartureDate;
	
	public Airline(String destinationPoint, String flightNumber,
			String airplaneType, Date date) {

		this.scheduledDepartureDate = date;
		
		this.destinationPoint = destinationPoint;
		this.flightNumber = flightNumber;
		this.airplaneType = airplaneType;
		
	}
	
	public String getDestinationPoint() {
		return destinationPoint;
	}
	
	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public String getAirplaneType() {
		return airplaneType;
	}
	
	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}
	
	public String getDepartureTime() {
		return scheduledDepartureDate.getHour() + ":" + scheduledDepartureDate.getMinute();
	}
	
	public String getWeekDays() {
		return scheduledDepartureDate.getWeekDay();
	}
	
	public Date getDate() {
		return scheduledDepartureDate;
	}
	
	public boolean flightIsScheduledOnThisDay( String day ) {
		return scheduledDepartureDate.flightIsScheduledOnThisDay(day);
	}
	
	public int compareTwoDates(Date second) {
		return scheduledDepartureDate.compareTwoDates( second );
	}
}
