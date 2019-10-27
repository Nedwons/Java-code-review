package by.etc.java_online.programming_with_classes.task3;

public class University {
	
	public University() {
		studentInitialization();
	}
	
	Student[] studentList = new Student[10];
	
	private final void studentInitialization(){
		
		studentList[0] = new Student("Иванов", "Иван", "Иванович", "ЭС-12", "9");
		studentList[1] = new Student("Петров", "Сергей", "Николаевич", "ЭМ-42", "7");
		studentList[2] = new Student("Сидоров", "Артем", "Стефанович", "ЭТ-51", "10");
		studentList[3] = new Student("Кузнецов", "Дмитрий", "Юрьевич", "ЭС-11", "4");
		studentList[4] = new Student("Попов", "Александр", "Петрович", "УК-43", "6");
		studentList[5] = new Student("Васильев", "Олег", "Александрович", "УР-24", "8");
		studentList[6] = new Student("Соколова", "Наталья", "Юрьевна", "МЭ-33", "9");
		studentList[7] = new Student("Новикова", "Елена", "Николаевна", "МТ-14", "6");
		studentList[8] = new Student("Волков", "Александр", "Петрович", "СА-14", "7");
		studentList[9] = new Student("Филенкова", "Ольга", "Владимировна", "МВ-11", "8");
	}
	
	public void filterStudentsByScore(String ... score ){  
// аргументы метода - это оценки, которые должны иметь интересующие нас студенты
		
		if( score.length == 0) {
			System.out.println("Не заданы параметры фильтрации");
			return;
		}
		
		for(Student iterator : studentList) {
			
			String studentScore = iterator.getStudentScore();
			
			if( studentScore != null ){
				
				for(int i = 0; i < score.length; i++){
					
					if( studentScore.equals( score[i] ) ){
						
						System.out.println(iterator.getFirstName() + 
											" " + iterator.getSecondName() +
											" " + iterator.getMiddleName() +
											" " + iterator.getGroupNumber() + 
											" " + iterator.getStudentScore() );
					}
					
				}
				
			}
			
		}
		
	}
	
}
