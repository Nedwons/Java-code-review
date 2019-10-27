package by.etc.java_online.programming_with_classes.task4;

/*
 *	Создайте класс Train, содержащий поля: название пункта назначения,номер поезда,
 * время отправления. Создайте данные в массив из пяти элементов типа Train, добавьте
 * возможность сортировки элементов массива по номерам поездов. Добавьте возможность
 * вывода информации о поезде, номер которого введен пользователем. Добавьте  возможность
 * сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
 * должны быть упорядочены по времени отправления. 
 */

public class Train {
	
	public Train(String trainNumber, String destinationPoint, String departureTime) {
		
		this.trainNumber = trainNumber;
		this.destinationPoint = destinationPoint;
		this.departureTime = departureTime;
	}
	
	private String trainNumber;
	private String destinationPoint;
	private String departureTime;
	
	public String getTrainNumber() {
		return this.trainNumber;
	}
	
	public String getDestinationPoint() {
		return this.destinationPoint;
	}
	
	public String getDepartureTime() {
		return this.departureTime;
	}

}
