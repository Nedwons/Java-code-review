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

public class Main {

	public static void main(String[] args) {
		
		FlightRadar radar = new FlightRadar();
		FlightRadarLogic logic = new FlightRadarLogic( radar.getAllAirlines() );
		View view = new View();
		
		String destinationPoint = "Munich";
		String weekDay = "SUNDAY";
		Date date = new Date(15, 51, weekDay);
		
		System.out.println("Cписок рейсов для пункта назначения " + destinationPoint + ":\n");
		
		ArrayList<Airline> certainDestinationPointAirlineList = 
				logic.getFlightsWithSpecifyedDestinationPoint( destinationPoint );
		view.printToConsole(certainDestinationPointAirlineList);
		
		System.out.println("\n\n Cписок рейсов для дня недели " + weekDay + ":\n");
		
		ArrayList<Airline> certainWeekDayAirlineList = 
				logic.getFlightsOnSpecifyedWeekDay( weekDay );
		view.printToConsole( certainWeekDayAirlineList );
		
		System.out.println("\n\n Cписок рейсов для дня недели " + weekDay + 
				", время вылета для которых позже " + date.getHour() + ":" + date.getMinute() + "\n");
		
		ArrayList<Airline> onlySpecifyedWeekDayLaterThan = 
				logic.getFlightsOnSpecifyedWeekDayLaterThan( date );
		view.printToConsole( onlySpecifyedWeekDayLaterThan );
	}

}
