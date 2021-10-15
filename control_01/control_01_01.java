//
// Контрольная работа № 1 (15 октября 2021 года) - вариант № 32
//
// Задача № 1
//

import java.util.Scanner;

public class control_01_01 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[6];
		System.out.println("Введите 6 целых чисел:");
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		int result = 0;
		for (int i = 0; i < input.length; i++) {
			result += input[i];
		}
		if (input[4] <= input[3]) {
			result = result % 10;
			System.out.println("Остаток от деления суммы чисел на 10 равен " + result);
		}
		else {
			result = result * result * result;
			System.out.println("Куб суммы введенных чисел " + result);
		}
		sc.close();
	}
}
