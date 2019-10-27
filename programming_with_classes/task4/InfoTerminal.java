package by.etc.java_online.programming_with_classes.task4;

import java.util.Scanner;

public class InfoTerminal {
	
	public InfoTerminal() {
		initialize();
	}
	
	Train[] trainList = new Train[5];
	
	private void initialize() {
		
		trainList[0] = new Train("711", "Brest", "19:45");
		trainList[1] = new Train("674", "Grodno", "20:02");
		trainList[2] = new Train("6835", "Baranovichi", "20:41");
		trainList[3] = new Train("714", "Vitebsk", "12:45");
		trainList[4] = new Train("727Б", "Brest", "13:38");
		
	}
	
	public void sortByTrainNumber() {
		
		int compareResult = 0;
		
		for(int i = trainList.length - 1; i > 0; i--) {
			
			for(int j = 0; j < i; j++) {
				
				compareResult = this.compareTrainNumber( trainList[ j ], trainList[ j + 1 ]);
				
				if( compareResult > 0  ) { 
					
					swapArrayElements(j);
				}		
			}
		}
	}
	
	public void sortByDestinationPoint() {
		
		int compareResult = 0;
		
		for(int i = trainList.length - 1; i > 0; i--) {
			
			for(int j = 0; j < i; j++) {
				
				compareResult = compareDestinationPoint(trainList[ j ], trainList[ j + 1 ]);
				
				if( compareResult > 0  ) { 
					
					swapArrayElements(j);
					
				}
				
				if( compareResult == 0 ) { // если пункты назначения совпадают - сортируем их по времени отправления
					
					compareResult = compareDepartureTime( trainList[ j ], trainList[ j + 1] );
					
					if( compareResult > 0  ) { 
						
						swapArrayElements(j);
						
					}
				}
			}
		}
	}
	
	
	
	private int compareTrainNumber(Train currentTrain, Train nextTrain) {
		
		String currentTrainNumber = currentTrain.getTrainNumber();
		String nextTrainsNumber = nextTrain.getTrainNumber();
		
		return currentTrainNumber.compareToIgnoreCase( nextTrainsNumber );
		
	}
	
	private int compareDepartureTime(Train currentTrain, Train nextTrain) {
		
		String currentTrainDepartureTime = currentTrain.getDepartureTime();
		String nextTrainDepartureTime = nextTrain.getDepartureTime();
		
		return currentTrainDepartureTime.compareToIgnoreCase(nextTrainDepartureTime);
		
	}
	
	private int compareDestinationPoint(Train currentTrain, Train nextTrain) {
		
		String currentTrainDestinationPoint = currentTrain.getDestinationPoint();
		String nextTrainDestinationPoint = nextTrain.getDestinationPoint();
		
		return currentTrainDestinationPoint.compareToIgnoreCase(nextTrainDestinationPoint);
		
	}
	
	private void swapArrayElements( int j ) {
		
		Train temp = trainList[j];
		trainList[j] = trainList[j + 1];
		trainList[j + 1] = temp;
		
	}
	
	public void showTrainInfo(int trainIndex) {
		
		if( trainIndex < 0 || trainIndex > trainList.length ) {
			
			System.out.println("Поезда с указанным индексом не существует");
			return;
			
		}
		Train train = trainList[ trainIndex ] ;
		
		System.out.println( "Номер поезда: " + train.getTrainNumber() 
				 + " Пункт назначения: " + train.getDestinationPoint() 
			     + " Время отправления: " + train.getDepartureTime() +"\n");
		
	}
	
	public void showTrainInfoByUserInput() {
		
		System.out.println("Введите номер поезда:");
		
		Scanner sc = new Scanner(System.in);
		
		String userInput = sc.nextLine();
		
		int trainIndex = findTrainByNumber(userInput);
		
		if( trainIndex == -1 ) {
			System.out.println("Поезд с указанным номером не найден.");
			return;
		}
		
		showTrainInfo( trainIndex );
		
	}
	
	public int findTrainByNumber(String trainNumber) {
		
		String currentTrainNumber;
		
		for(int i = 0; i < trainList.length; i++) {
			
			currentTrainNumber = trainList[i].getTrainNumber();
					
			if( currentTrainNumber.equalsIgnoreCase(trainNumber)) {
				
				return i;
				
			}
		}
		return -1; // если ничего не найдено.
	}
	
	public void showAlltrains() {
		
		for(int i = 0; i < trainList.length; i++) {
			
			showTrainInfo( i );
			
		}
	}
	
	public void showMenu() {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("\n1 - Информации о всех поездах");
		System.out.println("2 - Отсортировать поезда по их номеру");
		System.out.println("3 - Отсортировать поезда по пункту назначения");
		System.out.println("4 - Информации о поезде по введенному номеру");
		System.out.println("0 - выход\n");
		
		while( !sc.hasNextInt() ) {
				
			System.out.println("Некорректный ввод\n Попробуй еще раз:");
			
			sc.next();
		}
			
		int selection = sc.nextInt();
		
		switch( selection ) {
		
			case 1: 
				showAlltrains();
				showMenu();
				break;
				
			case 2: 
				sortByTrainNumber();
				showMenu();
				break;
				
			case 3: 
				sortByDestinationPoint();
				showMenu();
				break;
				
			case 4: 
				showTrainInfoByUserInput();
				showMenu();
				break;
				
			case 0:
				break;
				
			default: System.out.println("Что-то пошло не так");
		
		}
	}
}
