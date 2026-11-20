package figures;

import figures.abstractions.Shape;

// Класс-реализация сущности "Прямоугольник"
public class Rectangle extends Shape {
	double a, b;
	
	// TODO: Объявлено два конструктора для 
	// большей универсальности и гибкости класса
	public Rectangle() {
		this.a = 1;
		this.b = 1;
	}
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	// TODO: Добавить валидацию аргумента перед присваиванием
	public void setA(double a) {
		this.a = a;
	}
	
	// TODO: Добавить валидацию аргумента перед присваиванием
	public void setB(double b) {
		this.b = b;
	}
	
	// Получение значения a
	public double getA() {
		return this.a;
	}
	
	// Получение значения b
	public double getB() {
		return this.b;
	}
	
	// Реализация контракта на метод area
	@Override
	public double area() {
		return this.a * this.b;
	}
	
	// Реализация контракта на метод perimeter
	@Override
	public double perimeter() {
		return 2 * (this.a + this.b);
	}
}
