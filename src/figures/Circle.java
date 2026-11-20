package figures;

import figures.abstractions.Shape;

//Класс-реализация сущности "Окружность"
public class Circle extends Shape {
	double a;
	
	// TODO: Объявлено два конструктора для 
	// большей универсальности и гибкости класса
	public Circle() {
		this.a = 1;
	}
	public Circle(double a) {
		this.a = a;
	}
	
	// TODO: Добавить валидацию аргумента перед присваиванием
	public void setA(double a) {
		this.a = a;
	}
	
	// Получить значение a
	public double getA() {
		return this.a;
	}
	
	// TODO: Реализовать правильно для окружности
	@Override
	public double area() {
		return a;
	}
	
	// TODO: Реализовать правильно для окружности
	@Override
	public double perimeter() {
		return 2 * this.a;
	}
}
