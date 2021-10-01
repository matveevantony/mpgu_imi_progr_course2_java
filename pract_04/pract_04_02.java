// problem 402
import java.util.Scanner;

public class pract_04_02 {
	public static int summ(int a, int b) {
		return a + b;
	}
	
	public static void printsumm(int a, int b) {
		System.out.println("Сумма чисел " + a + " и " + b + " равна числу " + summ(a,b));
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите, пожалуйста, 2 целых числа:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		printsumm(x,y);
		sc.close();
	}
}
