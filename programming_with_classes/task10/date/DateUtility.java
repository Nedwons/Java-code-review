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

public class DateUtility {
	
	enum WeekDay {
		
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
		THURSDAY, FRIDAY, SATURDAY;
	
	}
	private final int DAYS_IN_WEEK = 7;
	
	private boolean[] flightDays = new boolean[DAYS_IN_WEEK]; // каждый элемент массива представляет день недели. Если == true - вылет на данный день запланирован.
	
	public DateUtility(String daysOfWeek) {
		
		parseUserInput( daysOfWeek ); // да, в конструкторе так делать некрасиво, но другого выхода не вижу (( 
	
	}
	
	private void parseUserInput(String daysOfWeek) {
		
		WeekDay day;
		String[] daysArray = daysOfWeek.split(",");
		
		for(String stringDay : daysArray) {
			
			day = findDayByStringRepresentation( stringDay ); // ищем элемент перечисления по строковому представлению
			
			switch( day ) {
				case SUNDAY: case MONDAY: case TUESDAY: case WEDNESDAY:
				case THURSDAY: case FRIDAY: case SATURDAY:
					int index = findDayIndex( day ); // находим порядковый номер дня недели
					setDaysOfWeek( index );
					break;
				default:
					break;
			}
		}
	}
	
	private WeekDay findDayByStringRepresentation(String str) {
		return WeekDay.valueOf( str );
	}
	
	private int findDayIndex( WeekDay day) {
		return day.ordinal();
	}
	
	/*
	 * Метод устанавливает дни недели, в которые производятся полеты данного рейса.
	 * 
	 */
	private void setDaysOfWeek(int dayNumber) {
		flightDays[dayNumber] = true;
	}
	
	
	// метод проверяет запланирован ли вылет в заданный день недели.
	public boolean flightIsScheduledOnThisDay( String day ) {
		
		WeekDay element = findDayByStringRepresentation( day );
		int index = findDayIndex( element );
		
		return flightDays[ index ];
		
	}
}
