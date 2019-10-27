package by.etc.java_online.programming_with_classes.task1;
/*
 *  Создйте класс Test2 двумя переменными. Добавьте конструктор с
 *  входными параметрами. Добавьте конструктор, инициализирующий члены
 *  класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 */
public class Test1 {

	private double firstVariable = 0;
	private double secondVariable = 0;
	
	
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
	
	public double summ(double firstValue, double secondValue){
		
		return firstValue + secondValue;
		
	}
	
	public double biggestNumber(double firstValue, double secondValue){
		
		return (firstValue > secondValue) ? firstValue : secondValue;
		
	}
}
