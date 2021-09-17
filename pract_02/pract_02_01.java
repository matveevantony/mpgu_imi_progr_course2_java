// problem 202
import java.util.Scanner;

public class pract_02_01 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("a=");
		a = sc.nextInt();
		System.out.print("b=");
		b = sc.nextInt();
		int m;
		if (a < b) {
			m = a;
		}
		else {
			m = b;
		}
		char c, d;
		String in;
		System.out.print("c=");
		in = sc.next();
		c = in.charAt(0);
		System.out.print("d=");
		in = sc.next();
		d = in.charAt(0);
		for (int i = 0; i < m; i++) {
			System.out.print(c + "" + d);
		}
		System.out.println();
		sc.close();
	}
}
