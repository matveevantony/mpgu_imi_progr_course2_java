// problem 701
import java.util.Scanner;

class Triangle { // класс треугольников
	double[] side = new double[3]; // поля класса
	public static final int n = 3;
	Triangle() { // конструктор по умолчанию
		for (int i = 0; i < n; i++) {
			side[i] = 0;
		}
	}
	Triangle(double _a, double _b, double _c) { // конструктор
		if (((_a + _b <= _c) || (_a + _c <= _b)) || (_b + _c <= _a)) {
			System.out.println("Ошибка: Не выполняется неравенство треугольника! Треугольник не был проинициализирован!");
			side[0] = 0;
			side[1] = 0;
			side[2] = 0;
		}
		else {
			side[0] = _a;
			side[1] = _b;
			side[2] = _c;
		}
	}
	public String figurename() { // метод вывода названия фигуры
		return "Треугольник";
	}
	public double perimeter() { // метод вычисления периметра треугольника
		double P = 0;
		for (int i = 0; i < n; i++) {
			P += side[i];
		}
		return P;
	}
	public double square() { // метод вычисления площади треугольника
		double p = perimeter() / 2;
		return Math.sqrt(p * (p - side[0]) * (p - side[1]) * (p - side[2]));
	}
	public static void printinfo(Triangle fig) { // статический метод вывода на экран всей информации о треугольнике
		System.out.println(fig.figurename());
		System.out.println("Стороны треугольника: " + fig.side[0] + " " + fig.side[1] + " " + fig.side [2]);
		System.out.println("Периметр треугольника равен " + fig.perimeter());
		System.out.println("Площадь треугольника равна " + fig.square());
	}
}

class RightTriangle extends Triangle { // класс прямоугольных треугольников
	RightTriangle() { // конструктор по умолчанию
		for (int i = 0; i < n; i++) {
			side[i] = 0;
		}
	}
	RightTriangle(double _a, double _b) { // конструктор по двум катетам
		side[0] = _a;
		side[1] = _b;
		side[2] = Math.sqrt(_a * _a + _b * _b);
	}
	public String figurename() { // метод вывода названия фигуры
		return "Прямоугольный треугольник";
		
	}
}

class IsoscelesTriangle extends Triangle { // класс равнобедренных треугольников
	IsoscelesTriangle() { // конструктор по умолчанию
		for (int i = 0; i < n; i++) {
			side[i] = 0;
		}
	}
	IsoscelesTriangle(double _a, double _c) { // конструктор по боковой строноне и основанию
		side[0] = _a;
		side[1] = _a;
		side[2] = _c;
	}
	public String figurename() { // метод вывода названия фигуры
		return "Равнобедренный треугольник";	
	}
}

class RegularTriangle extends Triangle { // класс равносторонних треугольников
	RegularTriangle() { // конструктор по умолчанию
		for (int i = 0; i < n; i++) {
			side[i] = 0;
		}
	}
	RegularTriangle(double _a) { // конструктор по стороне
		for (int i = 0; i < n; i++) {
			side[i] = _a;
		}
	}
	public String figurename() { // метод вывода названия фигуры
		return "Равносторонний треугольник";
	}
}

public class pract_10_01 { // основной класс
	public static void main (String[] args) { // главная функция
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите стороны произвольного треугольника:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		Triangle common = new Triangle(a,b,c);
		Triangle.printinfo(common);
		System.out.println();
		System.out.println("Введите катеты прямоугольного треугольника:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		RightTriangle right = new RightTriangle(a,b);
		Triangle.printinfo(right);
		System.out.println();
		System.out.println("Введите боковую сторону и основание ранобедренного треугольника:");
		a = sc.nextDouble();
		c = sc.nextDouble();
		IsoscelesTriangle isosc = new IsoscelesTriangle(a,c);
		Triangle.printinfo(isosc);
		System.out.println();
		System.out.println("Введите сторону равностороннего треугольника:");
		a = sc.nextDouble();
		RegularTriangle reg = new RegularTriangle(a);
		Triangle.printinfo(reg);
		sc.close();
	}
}
