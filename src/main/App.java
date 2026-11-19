package main;

import java.util.Scanner;

import figures.*;


public class App {
//	static figures.Square square = new Square();
//	static figures.Triangle triangle = new Triangle();
//	static figures.Circle circle = new Circle();
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println(
			"========================================\n" + 
			"Rectangle CLI Calculator\n" + 
			"========================================\n"
		);
		System.out.print("\nВведите длину прямоугольника a: ");
		double a = in.nextDouble();
		System.out.print("\nВведите ширину прямоугольника b: ");
		double b = in.nextDouble();
		
		figures.Rectangle rectangle = new Rectangle(a, b);
		
		System.out.printf(
			"----------------------------------------\n" + 
			"Параметры прямоугольника: a = %f, b = %f\n" + 
			"----------------------------------------\n", a, b
		);
		System.out.println(
			"Выберите действие:\n" +
			"1) Периметр P = 2(a + b)\n" +
			"2) Площадь  S = a * b\n" +
			"3) Диагональ d = sqrt(a^2 + b^2)\n" +
			"4) Длина описанной окружности C = π * d\n" +
			"5) Радиус вписанной окружности (только квадрат)\n" +
			"6) Ввести новые параметры\n" + 
			"7) Выход\n"
		);
		System.out.print("Ваш выбор: ");
		int chooice = in.nextInt();
		
		switch (chooice) {
		case 1: {
			System.out.println("Периметр:\r\n");
			System.out.printf("P = 2(a + b) = 2(%f + %f) = %f", a, b, rectangle.perimeter());
			break;
		}
		case 2: {
			System.out.println("Площадь:\r\n");
			System.out.printf("S = a * b = %f * %f = %f", a, b, rectangle.area());
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " );
		}
		in.close();
	}
}
