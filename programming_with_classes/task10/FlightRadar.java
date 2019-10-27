package by.etc.java_online.programming_with_classes.task10;

import java.util.ArrayList;

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

public class FlightRadar {
	
//	String destinationPoint, String flightNumber,
//	String airplaneType, Date date
//	
//	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
//	THURSDAY, FRIDAY, SATURDAY;
	
	ArrayList<Airline> airlines = new ArrayList<Airline>();
	
	public FlightRadar() {
		
		airlines.add( new Airline( "Munich", "LH1993", "Airbus A320", new Date(20, 10, "SUNDAY,TUESDAY,THURSDAY") ) );
		airlines.add( new Airline( "Washington", "UA933", "Boeing 777", new Date(17, 10, "SATURDAY") ) );
		airlines.add( new Airline( "Milan", "AZ787", "Airbus A330", new Date(13, 20, "SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY") ) );
		airlines.add( new Airline( "Munich", "LH2041", "Airbus A321", new Date(16, 00, "SUNDAY,THURSDAY,FRIDAY") ) );
		airlines.add( new Airline( "Lyon", "EK81", "Boeing 777-31H", new Date(14, 50, "MONDAY,THURSDAY,FRIDAY") ) );
		airlines.add( new Airline( "Dubai", "EK30", "Airbus A380", new Date(15, 50, "SUNDAY,MONDAY,TUESDAY") ) );
		airlines.add( new Airline( "Munich", "LH2073", "Airbus A320", new Date(16, 15, "THURSDAY,FRIDAY,SATURDAY") ) );
		
	}
	
	public ArrayList<Airline> getAllAirlines() {
		return airlines;
	}
	
}
