//
// Контрольная работа № 3 (17 декабря 2021 года) - вариант № 35
//
// Задача № 3
//

import java.util.Scanner;

class Rectangle { // класс прямоугольников
	private double a,b; // поля класса
	Rectangle(double _a, double _b) { // конструктор по двум сторонам
		a = _a;
		b = _b;
	}
	public double square() { // метод вычисления площади
		return a * b;
	}
}

class Square extends Rectangle { // класс квадратов, наследник класса прямоугольников
	Square(double a) { // конструктор по стороне
		super(a,a);
	}
}

public class control_03_03 { // основной класс
	public static void main (String[] args) { // главная функция
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите стороны прямоугольника:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		Rectangle rect = new Rectangle(a,b);
		System.out.println("Введите сторону квадрата:");
		double x = sc.nextDouble();
		Square sq = new Square(x);
		System.out.println("Площадь прямоугольника равна " + rect.square());
		System.out.println("Площадь квадрата равна " + sq.square());
		sc.close();
	}
}
