package by.etc.java_online.programming_with_classes.task5;

/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или
 * уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию
 * счетчика значениями по умолчанию и произвольными значениями. Счетчик имеет методы
 * увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
 * Написать код, демонстрирующий все возможности класса. 
 */

public class DecimalCounter {
	
	public DecimalCounter() {
		
		minLimit = 0;
		maxLimit = 1000;
		counterValue = 8;
		
	}
	
	
	public DecimalCounter(int minValue, int maxValue, int initValue) {
		
		if( minValue > maxValue || initValue > maxValue || initValue < minValue ) {
			
			minLimit = 0;
			maxLimit = 1000;
			counterValue = 8;
			
		} else {
			
			minLimit = minValue;
			maxLimit = maxValue;
			counterValue = initValue;
			
		}
	}
	
	private int counterValue;
	private int maxLimit;
	private int minLimit;
	
	public int getMaxLimit() {
		return maxLimit;
	}
	
	public int getMinLimit() {
		return minLimit;
	}
	
	public void setMaxLimit(int value) {
		maxLimit = value;
	}
	
	public void setMinLimit(int value) {
		minLimit = value;
	}
	
	public void setCounterValue(int value) {
		counterValue = value;
	}
	
	public void incrementCounter() {
		
		if( counterValue + 1 <= maxLimit) {
			
			counterValue++;
			
		} else {
			System.out.println("Счетчик переполнен");
		}
		
		
	}
	
	public void decrementCounter() {
		
		if(counterValue - 1 >= minLimit ) {
			
			counterValue--;
			
		} else {
			
			System.out.println("Достигнуто минимальное значение");
		
		}
		
	}
	
	public int getCounterValue() {
		
		return counterValue;
		
	}

}
