// problem 502
import java.util.Scanner;

class Complex {
	double re,im;
	Complex() {
		re = 0;
		im = 0;
	}
	Complex(double _re) {
		re = _re;
		im = 0;
	}
	Complex(double _re, double _im) {
		re = _re;
		im = _im;
	}
	public String print() {
		String output = String.valueOf(re);
		if (im > 0) {
			output += "+";
		}
		if (im != 0) {
			output += String.valueOf(im) + "i";
		}
		return output;
	}
	public Complex plus(Complex z) {
		return new Complex(re + z.re, im + z.im);
	}
	public Complex minus(Complex z) {
		return new Complex(re - z.re, im - z.im);
	}
	public Complex multiply(Complex z) {
		return new Complex(re * z.re + im * z.im, re * z.im + im + z.re);
	}
	public boolean iszero() {
		if ((re == 0) && (im == 0)) {
			return true;
		}
		return false;
	}
	public double module() {
		return Math.sqrt(re * re + im * im);
	}
	public Complex conj() {
		return new Complex(re,-im);
	}
}

public class pract_06_01 {
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
		Complex zc = z.conj();
		Complex yc = y.conj();
		System.out.println("Комплексное число, споряжённое с z, равно " + zc.print());
		System.out.println("Комплексное число, споряжённое с y, равно " + yc.print());
		sc.close();
	}
}

