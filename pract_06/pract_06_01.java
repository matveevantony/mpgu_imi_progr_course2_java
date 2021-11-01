// problem 502
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

public class pract_06_01 { // основной класс
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a=");
		double a = sc.nextDouble();
		System.out.print("b=");
		double b = sc.nextDouble();
		Complex z = new Complex(a,b);
		System.out.println("z=a+bi=" + z.print());
		System.out.print("c=");
		double c=sc.nextDouble();
		System.out.print("d=");
		double d=sc.nextDouble();
		Complex y = new Complex(c,d);
		System.out.println("y=c+di=" + y.print());
		Complex sum = z.plus(y);
		System.out.println("z+y=" + sum.print());
		Complex dif = z.minus(y);
		System.out.println("z-y=" + dif.print());
		Complex prod = z.multiply(y);
		System.out.println("z*y=" + prod.print());
		System.out.println("z=0? " + z.iszero());
		System.out.println("y=0? " + y.iszero());
		Complex zero = new Complex();
		System.out.println("0=0? " + zero.iszero());
		System.out.println("|z|=" + z.module());
		System.out.println("|y|=" + y.module());
		z.conj();
		y.conj();
		System.out.println("Комплексное число, споряжённое с z, равно " + z.print());
		System.out.println("Комплексное число, споряжённое с y, равно " + y.print());
		sc.close();
	}
}

