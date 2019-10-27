package by.etc.java_online.programming_with_classes.task6;

public class Main {
	public static void main(String[] args) {
		
		Time t = new Time();
		
		t.setHours(20);
		t.setMinutes(45);
		t.setSeconds(55);
		
		System.out.println(t);
		
		t.changeHours(-1);
		System.out.println(t);
		
		t.changeMinutes(15);
		System.out.println(t);
		
		t.changeSeconds(3660);
		System.out.println(t);
	}
}
