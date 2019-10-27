package by.etc.java_online.programming_with_classes.task6;

/*
 *  Составьте описание класса для представления времени. Предусмотрте возможности установки времени 
 *  и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
 *  В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения 
 *  времени на заданное количество часов, минут и секунд.
 */

public class Time {
	
	private int hours;
	private int minutes;
	private int seconds;
	
	private final int MAX_SECOND = 59;
	private final int MAX_MINUTE = 59;
	private final int MAX_HOUR = 23;
	private final int MIN = 0;
	private final int HOURS_IN_DAY = 24;
	private final int MINUTES_IN_HOUR = 60;
	private final int SECONDS_IN_MINUTE = 60;
	
	public void setSeconds(int seconds) {
		
		if(seconds <= MAX_SECOND  || seconds >= MIN) {
			
			this.seconds = seconds;
			
		}
		else {
			
			this.seconds = 0;
			
		}
	}
	
	public void setMinutes(int minutes) {
		
		if(minutes <= MAX_MINUTE  || minutes >= MIN) {
			
			this.minutes = minutes;
			
		}
		else {
			
			this.minutes = 0;
			
		}
	}
	
	public void setHours (int hours) {
		
		if(hours <= MAX_HOUR  || hours >= MIN) {
			
			this.hours = hours;
			
		}
		else {
			
			hours = 0;
			
		}
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getHours() {
		return hours;
	}
	
	@Override
	public String toString() {
		return getHours() + " часов " + getMinutes() + "минут " + getSeconds() + "секунд";
	}
	
	public int getTimeInHours() {
		return hours;
	}
	
	public int getTimeInMinutes() {
		return hours * MINUTES_IN_HOUR + minutes;
	}
	
	public int getTimeInSeconds() {
		return getTimeInMinutes() * SECONDS_IN_MINUTE + seconds; 
	}
	
	public void changeHours(int value) {
		
		int totalHours = hours + value;
		
		int days = totalHours / HOURS_IN_DAY;
		
		hours = totalHours - days * HOURS_IN_DAY;
		
	}
	
	public void changeMinutes(int value) {
		
		int totalMinutes = getTimeInMinutes() + value;
		int totalHours = totalMinutes / MINUTES_IN_HOUR;

		changeHours(totalHours - getTimeInHours());
		
		minutes = totalMinutes - totalHours * MINUTES_IN_HOUR;
	}
	
	public void changeSeconds(int value) {
		
		int totalSeconds = getTimeInSeconds() + value;
		
		int totalMinutes = totalSeconds / SECONDS_IN_MINUTE;
		
		changeMinutes(totalMinutes - getTimeInMinutes());
		
		seconds = totalSeconds - totalMinutes * SECONDS_IN_MINUTE;
	}
}
