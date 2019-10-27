package by.etc.java_online.programming_with_classes.task2;

public class Task2Test {
	
	public static void main(String[] args){
		
		Test2 noArgumentsConstructor = new Test2();
		Test2 constructorWithArguments = new Test2(9.11, 1.02);
		
		System.out.println("Переменные первого объекта (конструктор по умолчанию:)");
		System.out.println( noArgumentsConstructor.getFirstVariable() + "\t" + 
				noArgumentsConstructor.getSecondVariable() + "\n");
		
		System.out.println("Переменные второго объекта (конструктор с параметрами:)");
		System.out.println( constructorWithArguments.getFirstVariable() + "\t" + 
				constructorWithArguments.getSecondVariable() );
		
	}
}
