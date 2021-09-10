import java.util.Scanner;

public class pract_01_04 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n;
		System.out.print("Введите 2 целых числа m и n. Причём m <= n!\nm = ");
		m = sc.nextInt();
		System.out.print("n = ");
		n = sc.nextInt();
		if (m > n) {
			System.out.println("Ошибка! m > n...");
		}
		else {
			for (int i = m; i <= n; i++){
				if (i % 2 == 0) System.out.print(i + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
