// problem 702
import java.util.Scanner;

abstract class Figure { // абстрактный класс геометрических фигур
	public abstract double perimeter(); // абстрактный метод нахождения периметра фигуры
	public abstract double square(); // абстрактный метод нахождения площади фигуры
	public abstract String name(); // абстрактный метод получения названия фигуры
}

class Circle extends Figure { // класс окржуностей
	double x,y,r; // поля класса (координаты центра окружности и её радиус)
	Circle() { // конструктор по умолчанию
		x = 0;
		y = 0;
		r = 0;
	}
	Circle(double _x, double _y, double _r) { // конструктор по точке (центру) и радиусу)
		x = _x;
		y = _y;
		r = Math.abs(_r);
	}
	Circle (double x1, double y1, double x2, double y2) { // конструктор по двум точкам, задающим диаметр
		x = (x1 + x2) / 2;
		y = (y1 + y2) / 2;
		r = Math.sqrt(Math.abs(x1 - x2) * Math.abs(x1 - x2) + Math.abs(y1 - y2) * Math.abs(y1 - y2)) / 2;
	}
	public double perimeter() { // метод нахождения периметра окружности
		return 2 * Math.PI * r;
	}
	public double square() { // метод нахождения площади круга
		return Math.PI * r * r;
	}
	public String name() { // метод получения названия фигуры
		return "окружность";
	}
}

class Rectangle extends Figure { // класс прямоугольников
	double x1, y1, x2, y2; // поля класса (координаты левой верхней и правой нижней вершины прямоугольника)
	Rectangle () { // конструктор по умолчанию
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
	}
	Rectangle (double _x1, double _y1, double _x2, double _y2) { // конструктор по координатам левой верхней и правой нижней вершин
		x1 = _x1;
		y1 = _y1;
		x2 = _x2;
		y2 = _y2;
	}
	public double perimeter() { // метод нахождения периметра прямоугольника
		return 2 * (Math.abs(x1 - x2) + Math.abs(y1-y2));
	}
	public double square() { // метод нахождения площади прямоугольника
		return Math.abs(x1 - x2) * Math.abs(y1-y2);
	}
	public String name() { // метод получения названия фигуры
		return "прямоугольник";
	}
}

class Square extends Rectangle { // класс квадратов
	Square() { // конструктор по умолчанию
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
	}
	Square(double _x1, double _y1, double _x2, double _y2) { // конструктор по координатам левой верхней и правой нижней вершин
		x1 = _x1;
		y1 = _y1;
		x2 = _x2;
		y2 = _y2;
	}
	Square(double x, double y, double a) { // конструктор по левой верхней вершине и стороне
		x1 = x;
		y1 = y;
		x2 = x + a;
		y2 = y - a;
	}
	public double perimeter() { // метод нахождения перимертра квадрата
		return Math.sqrt(Math.abs(x1 - x2) * Math.abs(x1 - x2) + Math.abs(y1 - y2) * Math.abs(y1 - y2)) * 2 * Math.sqrt(2);
	}
	public double square() { // метод нахождения площади квадрата
		return 0.5 * Math.sqrt(Math.abs(x1 - x2) * Math.abs(x1 - x2) + Math.abs(y1 - y2) * Math.abs(y1 - y2)) * Math.sqrt(Math.abs(x1 - x2) * Math.abs(x1 - x2) + Math.abs(y1 - y2) * Math.abs(y1 - y2));
	}
	public String name() { // метод получения названия фигуры
		return "квадрат";
	}
}

public class pract_11_01 { // основной класс
	public static void main (String[] args) { // главная функция
		Scanner sc = new Scanner(System.in);
		final int n = 7;
		Figure[] arrayOfFigures = new Figure[n];
		for (int i = 0; i < n; i++) {
			arrayOfFigures[i] = randomFigure();
		}
		double averageSquare = 0;
		for (int i = 0; i < n; i++){
			System.out.println("Фигура № " + (i + 1));
			System.out.println(arrayOfFigures[i].name());
			System.out.println("периметр: " + arrayOfFigures[i].perimeter());
			System.out.println("площадь: " + arrayOfFigures[i].square());
			averageSquare += arrayOfFigures[i].square();
			System.out.println();
		}
		averageSquare /= n;
		System.out.println("Среднее арифместическое площадей фигур: " + averageSquare);
		sc.close();
	}
	public static Figure randomFigure() { // функция (статический метод) создания случайной фигуры
		int i = (int)(Math.random() * 3);
		if (i == 0) {
			return new Circle((int)(Math.random() * 21)-10, (int)(Math.random() * 21)-10, (int)(Math.random()*5) + 1);
		}
		if (i == 1) {
			int x1=(int)(Math.random() * 21)-10;
			int y1 = (int)(Math.random() * 21)-10;
			int x2 = (int)(Math.random() * 21)-10;
			int y2 = (int)(Math.random() * 21)-10;
			while ((x1 == x2) || (y1 == y2)) {
				x2 = (int)(Math.random() * 21)-10;
				y2 = (int)(Math.random() * 21)-10;
			}
			return new Rectangle(x1, y1, x2, y2);
		}
		return new Square((int)(Math.random() * 21)-10, (int)(Math.random() * 21)-10, (int)(Math.random()*5) + 1);
	}
}
