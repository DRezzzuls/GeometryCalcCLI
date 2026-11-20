package figures.abstractions;

import figures.interfaces.Calculates;

// Абстрактный класс геометрических фигур
// TODO: Нужен ли будет интерфейс?
public abstract class Shape implements Calculates{
	// Объявление контракта на реализацию 
	// метода area (Расчет площади геометрической фигуры)
	public abstract double area();
	
	// Объявление контракта на реализацию 
	// метода perimeter (Расчет периметра геометрической фигуры)
	public abstract double perimeter();
}
