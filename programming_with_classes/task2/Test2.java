package by.etc.java_online.programming_with_classes.task2;
/*
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и
 * get- методы для полей экземпляра класса.
 */
public class Test2 {
	
	public Test2(){
		
		firstVariable = 3.142856;
		secondVariable = 9.8;
		
	}
	
	public Test2(double firstValue, double secondValue){
		
		firstVariable = firstValue;
		secondVariable = secondValue;
		
	}
	
	private double firstVariable;
	private double secondVariable;
	
	
	public double getFirstVariable(){
		
		return firstVariable;
		
	}
	
	public double getSecondVariable(){
		
		return secondVariable;
		
	}
	
	
	public void setFirstVariable(double value){
		
		firstVariable = value;
		
	}
	
	public void setSecondVariable(double value){
		
		secondVariable = value;
		
	}

}
