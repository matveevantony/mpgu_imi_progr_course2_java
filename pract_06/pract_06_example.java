// example
import java.util.Scanner;

class Complex {
	double a,b;
	Complex() {
		a = 0;
		b = 0;
	}
	Complex(double _a) {
		a = _a;
		b = 0;
	}
	Complex(double _a, double _b) {
		a = _a;
		b = _b;
	}
	public double module() {
		return Math.sqrt(a * a + b * b);
	}
}

public class pract_06_example {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		Complex c = new Complex(a,b);
		Complex d = new Complex(4,5);
		Complex z = new Complex ();
		System.out.println(c.module());
		System.out.println(d.module());
		System.out.println(z.module());
		System.out.println(d.a); // 4
		sc.close();
	}
}

