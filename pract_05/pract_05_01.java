// problem 410
import java.util.Scanner;

public class pract_05_01 {
	public static double strangefunc () {
		double a = Math.random() * 200 - 100;
		double b = Math.random() * 200 - 100;
		System.out.format("%6.2f",a);
		System.out.print(" ");
		System.out.format("%7.2f",b);
		System.out.println();
		return (a*a*a+b*b*b)*(a*a*a+b*b*b);
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.format("%7.2f",strangefunc());
		sc.close();
	}
}
