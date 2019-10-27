package by.etc.java_online.programming_with_classes.task1;

public class Task1Test {
	
	public static void main(String[] args){
		
		Test1 task = new Test1();
	
		task.setFirstVariable(85975.785);
		task.setSecondVariable(255585.75558);
		
		System.out.println("Первая переменная: " + task.getFirstVariable());
		System.out.println("Вторая переменная: " + task.getSecondVariable());
		
		System.out.println("Сумма двух переменных " +
				task.summ(task.getFirstVariable(), task.getSecondVariable() ) );
		
		System.out.println("Наибольшее значение переменной равно " +
				task.biggestNumber(task.getFirstVariable(), task.getSecondVariable()));
	}	
}
