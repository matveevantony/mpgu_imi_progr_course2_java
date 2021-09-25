// problem 206
import java.util.Scanner;

public class pract_03_01 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("m=");
		int m = sc.nextInt();
		System.out.print("n=");
		int n = sc.nextInt();
		System.out.print("Отрезок (0) или интервал (1)? : ");
		int q = sc.nextInt();
		System.out.print("Чётные (0) или нечётные (1)? : ");
		int o = sc.nextInt();
		if (((q == 0) || (q == 1)) && ((o == 0) || (o == 1))) {
			if (q == 0){
				for (int i = m; i <= n; i++) {
					if (i % 2 == o) {
						System.out.print(i + " ");
					}
				}
			}
			else {
				for (int i = m + 1; i < n; i++) {
					if (i % 2 == o) {
						System.out.print(i + " ");
					}
				}
			}
		}
		else {
			System.out.print("Введенты неверные данные");
		}
		System.out.println();
		sc.close();
	}
}
