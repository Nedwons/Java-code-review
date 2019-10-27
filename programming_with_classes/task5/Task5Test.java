package by.etc.java_online.programming_with_classes.task5;

public class Task5Test {

	public static void main(String[] args) {

		DecimalCounter counter = new DecimalCounter();
		
		System.out.println("Счетчик созданный дефолтным конструктором:");
		System.out.println("\t Максимальное значение: " + counter.getMaxLimit());
		System.out.println("\t Минимальное значение: " + counter.getMinLimit());
		System.out.println("\t Текущее значение счетчика: " + counter.getCounterValue());
		
		counter.decrementCounter();
		counter.decrementCounter();
		
		System.out.println("Значение счетчика после двух уменьшений: " + counter.getCounterValue());
		
		counter.incrementCounter();
		
		System.out.println("После увеличения: " + counter.getCounterValue() + "\n\n");
		
		DecimalCounter parameterizedCounter = new DecimalCounter(5, 20, 18);
		
		System.out.println("Счетчик созданный конструктором c параметрами:");
		System.out.println("\t Максимальное значение: " + parameterizedCounter.getMaxLimit());
		System.out.println("\t Минимальное значение: " + parameterizedCounter.getMinLimit());
		System.out.println("\t Текущее значение счетчика: " + parameterizedCounter.getCounterValue());
		
		
		
	}

}
