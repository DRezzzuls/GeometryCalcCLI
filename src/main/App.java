/**
 * Приложение консольного калькулятора геометрических фигур
 * 1. Позволяет выбрать одну из четырех геометрических фигур
 * 2. Задать размеры
 * 3. Выбрать одну из доступных операций
 * 4. Произвести расчеты
 * 
 * Статус: в разработке. 
 * Некоторые параметры могут не соответствовать техническому заданию. 
 * Геометрические фигуры были сделаны по принципу копировать / вставить 
 * с целью экономии времени и в ближайшее время 
 * будут приведены в соответствие. На данный момент ведется проработка 
 * алгоритма в точке входа. Известные в коде изъяны помечены 
 * как "TODO" с пояснением.  
 */


package main;

import java.util.Scanner;

import figures.Circle;
import figures.Rectangle;
import figures.Square;
import figures.Triangle;
import figures.abstractions.Shape;

// Точка входа в приложение
public class App {	
	public static void main(String[] args) {
		System.out.println(
			"========================================\n" + 
			"Rectangle CLI Calculator                \n" + 
			"========================================\n\n"
		);
		System.out.println(
			"----------------------------------------\n" + 
			"Выберите геометрическую фигуру:         \n" + 
			"----------------------------------------\n" +
			"1) Прямоугольник\n" +
			"2) Квадрат\n" +
			"3) Треугольник\n" +
			"4) Окружность\n" +
			"5) Выход\n\n"
		);
		System.out.print("Ваш выбор: ");
		
		Scanner in = new Scanner(System.in);
		Shape figure = createShape(in);
		calculateShape(figure, in);
	}
	
	// Выбор и создание экземпляра геометрической фигуры
	// Возвращает экземпляр созданной фигуры
	static Shape createShape(Scanner in) {
		int figureChooice = in.nextInt();
		
		return switch (figureChooice) {
			// Прямоугольник
			case 1: {
				Rectangle rectangle = new Rectangle();

				System.out.print("\nВведите длину прямоугольника a: ");
				double a = in.nextDouble();
			
				System.out.print("\nВведите ширину прямоугольника b: ");
				double b = in.nextDouble();
				
				rectangle.setA(a);
				rectangle.setB(b);
				
				System.out.printf(
					"----------------------------------------\n" + 
					"Параметры прямоугольника: a = %f, b = %f\n" + 
					"----------------------------------------\n", a, b
				);
			
				yield rectangle;
			}
			// Квадрат
			case 2: {
				Square square = new Square();

				System.out.print("\nВведите длину сторон квадрата: ");
				double a = in.nextDouble();
			
				square.setA(a);
				
				System.out.printf(
					"----------------------------------------\n" + 
					"Параметры квадрата: a = %f\n" + 
					"----------------------------------------\n", a
				);
				
				yield square;
			}
			// Треугольник
			case 3: {
				Triangle triangle = new Triangle();

				System.out.print("\nВведите длину стороны треугольника a: ");
				double a = in.nextDouble();
			
				System.out.print("\nВведите длину стороны треугольника b: ");
				double b = in.nextDouble();
				
				System.out.print("\nВведите длину стороны треугольника c: ");
				double c = in.nextDouble();
				
				triangle.setA(a);
				triangle.setB(b);
				triangle.setC(c);
				
				System.out.printf(
					"----------------------------------------\n" + 
					"Параметры треугольника: a = %f, b = %f, c = %f\n" + 
					"----------------------------------------\n", a, b, c
				);
				yield triangle;
			}
			// Окружность
			case 4: {
				Circle circle = new Circle();
				
				System.out.print("\nВведите радиус окружности: ");
				double a = in.nextDouble();
				
				circle.setA(a);
				
				System.out.printf(
					"----------------------------------------\n" + 
					"Параметры окружности: a = %f" + 
					"----------------------------------------\n", a
				);
				yield circle;
			}
			// Выбрана несуществующая фигура
			default: {
				throw new IllegalArgumentException("Unexpected value: " + in.nextInt());
			}
		};
	}
	
	// Расчет параметров геометрической фигуры
	static void calculateShape(Shape figure, Scanner in) {
		System.out.println(
			"Выберите действие:\n" +
			"1) Периметр P = 2(a + b)\n" +
			"2) Площадь  S = a * b\n" +
			"3) Диагональ d = sqrt(a^2 + b^2)\n" +
			"4) Длина описанной окружности C = π * d\n" +
			"5) Радиус вписанной окружности (только квадрат)\n" +
			"6) Ввести новые параметры\n" + 
			"7) Вернуться к выбору геометрических фигур\n" +
			"8) Выход\n\n"
		);
		System.out.print("Ваш выбор: ");
		int chooice = in.nextInt();
		
		switch (chooice) {
			case 1: {
				System.out.println("Периметр:\r\n");
				// TODO: откуда взять валидные значения для подстановки в строку
				System.out.printf("P = 2(a + b) = 2(%f + %f) = %f", a, b, figure.perimeter());
				break;
			}
			case 2: {
				System.out.println("Площадь:\r\n");
				// TODO: откуда взять валидные значения для подстановки в строку
				System.out.printf("S = a * b = %f * %f = %f", a, b, figure.area());
				break;
			}
			default: {
				throw new IllegalArgumentException("Unexpected value: ");
			}
		}
	}
}
