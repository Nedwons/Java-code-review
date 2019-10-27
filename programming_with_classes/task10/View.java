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

public class View {
	
	public void printToConsole(ArrayList<Airline> list) {
		
		for(Airline iterator : list) {
			
			System.out.println("Пункт назначения: " + iterator.getDestinationPoint() + 
					"\t Номер рейса: " + iterator.getFlightNumber() +
					"\t тип самолета: " + iterator.getAirplaneType() + 
					"\t время вылета: " + iterator.getDepartureTime() + 
					"\t дни недели: " + iterator.getWeekDays() + "\n");			
		}
	}
}
