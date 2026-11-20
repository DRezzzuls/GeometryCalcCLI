package figures;

import figures.abstractions.Shape;

//Класс-реализация сущности "Треугольник"
public class Triangle extends Shape {
	double a, b, c;
	
	// TODO: Объявлено два конструктора для 
	// большей универсальности и гибкости класса
	public Triangle() {
		this.a = 1;
		this.b = 1;
		this.c = 1;
	}
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	// TODO: Добавить валидацию аргумента перед присваиванием
	public void setA(double a) {
		this.a = a;
	}
	// TODO: Добавить валидацию аргумента перед присваиванием
	public void setB(double b) {
		this.b = b;
	}
	// TODO: Добавить валидацию аргумента перед присваиванием
	public void setC(double c) {
		this.c = c;
	}
	
	// Получить значение a
	public double getA() {
		return this.a;
	}
	// Получить значение b
	public double getB() {
		return this.b;
	}
	// Получить значение c
	public double getC() {
		return this.c;
	}
	
	// TODO: Реализовать правильно для треугольника
	@Override
	public double area() {
		return a * b;
	}
	// TODO: Реализовать правильно для треугольника
	@Override
	public double perimeter() {
		return 2 * (this.a + this.b);
	}
}
