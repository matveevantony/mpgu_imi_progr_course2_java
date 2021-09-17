// problem 303
import java.util.Scanner;

public class pract_02_04 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("L=");
		int L = Math.abs(sc.nextInt());
		int absL = Math.abs(L);
		int sumdigL = 0;
		while (absL > 0) {
			sumdigL += absL % 10;
			absL /= 10;
		}
		System.out.println("Сумма цифр числа L равна " + sumdigL);
		if ((L * sumdigL) % 9 == 0) {
			System.out.println("Произведение L на сумму цифр этого числа делится на 9 без остатка.");
		}
		else {
			System.out.println("Произведение L на сумму цифр этого числа не делится на 9 без остатка.");
		}
		sc.close();
	}
}
