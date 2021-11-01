// problem 602
import java.util.Scanner;

class Complex { // класс комплексных чисел
	double re,im; // поля класса
	Complex() { // конструктор по умолчанию
		re = 0;
		im = 0;
	}
	Complex(double _re) { // конструктор
		re = _re;
		im = 0;
	}
	Complex(double _re, double _im) { // конструктор
		re = _re;
		im = _im;
	}
	public String print() { // метод вывода на экран комплексного числа
		String output = "";
		if (re != 0) {
			output = String.valueOf(re);
			if (im > 0) {
				output += "+";
			}
		}
		if (im != 0) {
			output += String.valueOf(im) + "i";
		}
		else {
			if (re == 0) {
				output += "0";
			}
		}
		return output;
	}
	public Complex plus(Complex z) { // метод сложения комплексных чисел
		return new Complex(re + z.re, im + z.im);
	}
	public Complex minus(Complex z) { // метод вычитания комплексных чисел
		return new Complex(re - z.re, im - z.im);
	}
	public Complex multiply(Complex z) { // метод умножения комплексных чисел
		return new Complex(re * z.re - im * z.im, re * z.im + im * z.re);
	}
	public boolean iszero() { // метод сравнения комплексного числа с нулем
		if ((re == 0) && (im == 0)) {
			return true;
		}
		return false;
	}
	public double module() { // метод нахождения модуля комплексного числа
		return Math.sqrt(re * re + im * im);
	}
	public void conj() { // метод замены комплексного числа на сопряженного с ним
		im = -im;
	}
}

public class pract_07_03 { // основной класс
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Квадратное уравнение имеет вид:\nax^2+bx+c=0");
		System.out.print("a=");
		double a = sc.nextDouble();
		System.out.print("b=");
		double b = sc.nextDouble();
		System.out.print("c=");
		double c = sc.nextDouble();
		double d = b * b - 4 * a * c; // алгоритм решения уравнения
		Complex sqrtD;
		if (d >= 0) {
			sqrtD = new Complex(Math.sqrt(d));
		}
		else {
			sqrtD = new Complex(0,Math.sqrt(Math.abs(d)));
		}
		Complex ans1,ans2;
		if (d == 0) {
			ans1 = new Complex(-b);
			ans1 = ans1.multiply(new Complex(1 / (2 * a)));
			ans2 = ans1;
			System.out.println("Корень квадратного уравнения: " + ans1.print());
		}
		else {
			ans1 = sqrtD.minus(new Complex(b));
			ans2 = sqrtD.multiply(new Complex(-1));
			ans2 = ans2.minus(new Complex(b));
			ans1 = ans1.multiply(new Complex(1 / (2 * a)));
			ans2 = ans2.multiply(new Complex(1 / (2 * a)));
			System.out.println("Корни квадртаного уравнения: " + ans2.print() + "; " + ans1.print());
		}
		if ((ans1.plus(ans2).minus(new Complex(-b/a)).iszero()) && (ans1.multiply(ans2).minus(new Complex(c/a)).iszero())) { // проверка формул Виета
			System.out.println("Формулы Виета выполняются");
		}
		sc.close();
	}
}

