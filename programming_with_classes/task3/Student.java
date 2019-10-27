package by.etc.java_online.programming_with_classes.task3;

/*
 * 	Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
 * номер группы, успеваемость (массив из пяти элементов). Создайте массив
 * из десяти элементов такого типа. Добавьте возможность вывода фамилий и 
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Student {
	
	public Student(String firstName, String lastName, String middleName,
			String groupNumber, String studentScore){
		
		data[0] = firstName;
		data[1] = lastName;
		data[2] = middleName;
		data[3] = groupNumber;
		data[4] = studentScore;
		
	}
	
	private String data[] = new String[5];
	
	public String getFirstName(){	
		return data[0];
	}
	
	public String getSecondName(){
		return data[1];
	}
	
	public String getMiddleName(){
		return data[2];
	}
	
	public String getGroupNumber(){
		
		return data[3];
		
	}
	
	public String getStudentScore(){
		
		return data[4];
		
	}
	

	public void setFirstName(String str){	
		data[0] = str;
	}
	
	public void setSecondName(String str){
		data[1] = str;
	}
	
	public void setMiddleName(String str){
		data[2] = str;
	}
	
	public void setGroupNumber(String str){
		data[3] = str;
	}
	
	public void setStudentScore(String str){
		data[4] = str;
	}
	
}
