// problem 501
import java.util.Scanner;

class Segment { // класс отрезков на плоскоти
	double x1,y1,x2,y2; // поля класса
	Segment() { // конструктор по умолчанию
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
	}
	Segment(double _x2, double _y2) { // конструктор с указанием координат только одного конца отрезка
		x1 = 0;
		y1 = 0;
		x2 = _x2;
		y2 = _y2;
	}
	Segment(double _x1, double _y1, double _x2, double _y2) { // контруктор
		x1 = _x1;
		y1 = _y1;
		x2 = _x2;
		y2 = _y2;
	}
	public void println() { // метод вывода координат концов отрезка на экран
		System.out.println("(" + x1 + ";" + y1 + ") (" + x2 + ";" + y2 + ")");
	}
	public double length() { // метод вычисления длины отрезка
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}
}

public class pract_07_01 { // основной класс
	public static Segment longerSegment(Segment a, Segment b) { // функция сравнения длин двух отрезков
		System.out.println("Сравнение двух отрезков с концами в точках с координатами:");
		System.out.print("I  ");
		a.println();
		System.out.print("II ");
		b.println();
		if (a.length() > b.length()) {
			System.out.println("Первый отрезок имеет большую длину");
			return a;
		}
		else {
			if (a.length() == b.length()) {
				System.out.println("Отрезки равны по длине");
				return a;
			}
			else {
				System.out.println("Второй отрезок имеет большую длину");
				return b;
			}
		}
	}
	public static void main (String[] args) { // основная функция
		Scanner sc = new Scanner(System.in);
		System.out.println("Зададим отрезок");
		System.out.println("Введите координаты одного из концов отрезка:");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.println("Введите координаты второго конца отрезка:");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		Segment a = new Segment(x1,y1,x2,y2);
		System.out.println("Задан отрезок с концами в точках:");
		a.println();
		System.out.println("Его длина равна " + a.length());
		System.out.println("Зададим ещё один отрезок");
		System.out.println("Введите координаты одного из концов отрезка:");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		System.out.println("Введите координаты второго конца отрезка:");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		Segment b = new Segment(x1,y1,x2,y2);
		System.out.println("Задан отрезок с концами в точках:");
		b.println();
		longerSegment(a,b);
		sc.close();
	}
}
