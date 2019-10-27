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

public class FlightRadarLogic {
	
	private ArrayList<Airline> allFlights;
	
	public FlightRadarLogic( ArrayList<Airline> allFlights ) {
		
		this.allFlights = allFlights;
		
	}
	
	public ArrayList<Airline> getFlightsWithSpecifyedDestinationPoint( String destinationPoint ) {
		
		ArrayList<Airline> newList = new ArrayList<Airline>();
		String currentDestinationPoint = "";
		
		for(Airline iterator : allFlights) {
			
			currentDestinationPoint = iterator.getDestinationPoint();
			
			if( currentDestinationPoint.equalsIgnoreCase(destinationPoint) ) {
				newList.add(iterator);
			}
		}
		return newList;
	}
	
	public ArrayList<Airline> getFlightsOnSpecifyedWeekDay( String weekDay ) {
		
		ArrayList<Airline> newList = new ArrayList<Airline>();
		
		for(Airline iterator : allFlights) {
			
			if( iterator.flightIsScheduledOnThisDay( weekDay ) ) {
				
				newList.add(iterator);
			}
		}
		return newList;
	}
	
	public ArrayList<Airline> getFlightsOnSpecifyedWeekDayLaterThan(Date date){
		
		Date currentDate;
		ArrayList<Airline> tempList = getFlightsOnSpecifyedWeekDay( date.getWeekDay() );
		ArrayList<Airline> newList = new ArrayList<Airline>();
		
		for(Airline iterator : tempList) {
			
			currentDate = iterator.getDate();
			
			if( currentDate.compareTwoDates( date ) == 1) {
				newList.add(iterator);
			}
		}
		return newList;
	}
	
}
