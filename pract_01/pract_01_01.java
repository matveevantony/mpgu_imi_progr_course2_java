import java.util.Scanner;

public class pract_01_01 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("Введите первое целое число: ");
		a = sc.nextInt();
		System.out.print("Введите второе целое число: ");
		b = sc.nextInt();
		if (a > b) {
			System.out.println("Первое больше");
		}
		else {
			if (a < b) {
				System.out.println("Второе больше");
			}
			else {
				System.out.println("Эти числа равны");
			}
		}
		sc.close();
	}
}
