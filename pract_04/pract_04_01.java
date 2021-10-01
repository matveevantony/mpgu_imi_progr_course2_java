// problem 401
import java.util.Scanner;

public class pract_04_01 {
	public static int summ(int a, int b) {
		return a + b;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A=");
		int x = sc.nextInt();
		System.out.print("B=");
		int y = sc.nextInt();
		System.out.println("A+B=" + summ(x,y));
		sc.close();
	}
}
