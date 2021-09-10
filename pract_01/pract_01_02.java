import java.util.Scanner;

public class pract_01_02 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("Введите, пожалуйста, 3 целых числа: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int counteq = 0;
		if (a == b) counteq++;
		if (a == c) counteq++;
		if (b == c) counteq++;
		if (counteq == 0) {
			System.out.println("Равных чисел нет");
		}
		else {
			System.out.println("Среди введённых чисел количество пар равных между собой чисел равно " + counteq);
		}
		sc.close();
	}
}
