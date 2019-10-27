package by.etc.java_online.programming_with_classes.task10.date;

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

public class Date {
	
	DateUtility utility;
	
	private int hour;
	private int minute;
	private String dayOfWeek;
	
	public Date(int hour, int minute, String dayOfWeek) {
		this.hour = hour;
		this.minute = minute;
		this.dayOfWeek = dayOfWeek;
		
		utility = new DateUtility( dayOfWeek );
		
	}
	

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public String getWeekDay() {
		return dayOfWeek;
	}
	
	public boolean flightIsScheduledOnThisDay( String day ) {
		return utility.flightIsScheduledOnThisDay(day);
	}
	
	public int compareTwoDates( Date second) {
		

		if( this.hour == second.hour ) {
			
			if( this.minute == second.minute ) {
				return 0;
			}
			
			if( this.minute < second.minute ) {
				return -1;
			}
			else {
				return 1;
			}
		}
		
		if( this.hour < second.hour ) {
			return -1;
		}
		else {
			return 1;
		}
	}
}
