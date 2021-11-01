// problem 601
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

public class pract_07_02 { // основной класс
	public static Segment longerSegment(Segment a, Segment b) { // функция сравнения длин двух отрезков
		if (a.length() >= b.length()) {
			return a;
		}
		else {
			return b;
		}
	}
	public static void main (String[] args) { // основная функция
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите координаты вершин пятиугольника в порядке обхода по часовой стрелке"); // ввод координат вершин пятиугольника
		double[][] points = new double[2][5];
		for (int i = 0; i < 5; i++) {
			System.out.print((i+1) + " вершина: ");
			for (int j = 0; j < 2; j++) {
				points[j][i] = sc.nextDouble();
			}
		}
		double p = 0; // вычисление периметра пятиугольника
		for (int i = 0; i < 4; i++) {
			Segment temp = new Segment(points[0][i],points[1][i],points[0][i+1],points[1][i+1]);
			p += temp.length();
		}
		System.out.println("Периметр пятиугольника равен " + p);
		Segment[] diag = new Segment[5]; // нахождение длины наибольшей диагонали
		for (int i = 0; i < 5; i++) {
			diag[i] = new Segment(points[0][i],points[1][i],points[0][(i+2) % 5],points[1][(i+2)%5]);
		}
		Segment maxdiag = diag[0];
		for (int i = 1; i < 5; i++) {
			maxdiag = longerSegment(maxdiag,diag[i]);
		}
		System.out.println("Длина наибольшей диагонали равна " + maxdiag.length());
		Segment[] radiusvector = new Segment[5]; // нахождение ближайшей к началу координат вершины
		for (int i = 0; i < 5; i++) {
			radiusvector[i] = new Segment(points[0][i],points[1][i]);
		}
		double mincenterdist = radiusvector[0].length();
		int mincenterdistindex = 0;
		for (int i = 1; i < 5; i++) {
			if (mincenterdist > radiusvector[i].length()) {
				mincenterdist = radiusvector[i].length();
				mincenterdistindex = i;
			}
		}
		System.out.println((mincenterdistindex + 1) + " вершина - ближайшая к началу координат");
		sc.close();
	}
}
