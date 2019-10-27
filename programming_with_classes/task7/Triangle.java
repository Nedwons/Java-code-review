package by.etc.java_online.programming_with_classes.task7;

/* 
 *  Описать класс, представляющий треугольник. Предусмотреть методы для создания
 *   объектов, вычисления площади, периметра и точки пересечения медиан.
 */

public class Triangle {
	
	public Triangle() {
		
		firstVertexCoordinateX = 1;
		firstVertexCoordinateY = 4;
		secondVertexCoordinateX = 5;
		secondVertexCoordinateY = 1;
		thirdVertexCoordinateX = 1;
		thirdVertexCoordinateY = 1;
	}
	
	private double firstVertexCoordinateX;
	private double firstVertexCoordinateY;
	
	private double secondVertexCoordinateX;
	private double secondVertexCoordinateY;

	private double thirdVertexCoordinateX;
	private double thirdVertexCoordinateY;
	
	public double firstEdgeLenght() {
		return Math.hypot( secondVertexCoordinateX - firstVertexCoordinateX,
				secondVertexCoordinateY - firstVertexCoordinateY );
	}
	
	public double secondEdgeLenght() {
		return Math.hypot( thirdVertexCoordinateX - secondVertexCoordinateX,
				thirdVertexCoordinateY - secondVertexCoordinateY );
	}
	
	public double thirdEdgeLenght() {
		return Math.hypot( thirdVertexCoordinateX - firstVertexCoordinateX,
				thirdVertexCoordinateY - firstVertexCoordinateY );
	}
	
	public double definePerimeter() {
		return firstEdgeLenght() + secondEdgeLenght() + thirdEdgeLenght();
	}
	
	public double defineArea() {
		
		double halfPerimeter = definePerimeter() / 2;
		double area = Math.sqrt( halfPerimeter * ( halfPerimeter - firstEdgeLenght()) *
				( halfPerimeter - secondEdgeLenght()) * ( halfPerimeter - thirdEdgeLenght()) );
		return area;
		
	}
	
	public double getMedianCrossXaxis() {
		return  (firstVertexCoordinateX + secondVertexCoordinateX + thirdVertexCoordinateX) / 3;
	}
	
	public double getMedianCrossYaxis() {
		return  (firstVertexCoordinateY + secondVertexCoordinateY + thirdVertexCoordinateY) / 3;
	}
	
	@Override
	public String toString() {
		return "Длины сторон треугольника: " + this.firstEdgeLenght() + " " + 
				this.secondEdgeLenght() + " " + this.thirdEdgeLenght() + "\n" 
				+ "Периметр тругольника равен: " + this.definePerimeter() + "\n" +
				"Площадь треугольника: " + this.defineArea() + "\n" +
				"Точка координаты точки пересечения медиан: " + this.getMedianCrossXaxis() + "," +
				this.getMedianCrossYaxis();
	}
	
}
