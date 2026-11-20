package figures;

import figures.abstractions.Shape;

//Класс-реализация сущности "Квадрат"
public class Square extends Shape {
	double a;

	// TODO: Объявлено два конструктора для 
	// большей универсальности и гибкости класса
	public Square() {
		this.a = 1;
	}
	public Square(double a) {
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
	
	// TODO: Реализовать правильно для квадрата
	@Override
	public double area() {
		return a;
	}
	// TODO: Реализовать правильно для квадрата
	@Override
	public double perimeter() {
		return 2 * this.a;
	}
}
