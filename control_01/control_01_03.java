//
// Контрольная работа № 1 (15 октября 2021 года) - вариант № 32
//
// Задача № 3
//

import java.util.Scanner;

public class control_01_03 {
	public static int summ3symb (int[][] matrix) {
		int result = 0;
		for (int i = 0; i < matrix.length; i++) {
			if ((matrix[matrix.length-i-1][i] > 99) && (matrix[matrix.length-i-1][i] < 1000)) {
				result += matrix[matrix.length-i-1][i] * matrix[matrix.length-i-1][i];
			}
		}
		return result;
	}
	public static int prod0morek (int[][] matrix, int k) {
		int result = 1;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[0][i] > k) {
				result *= matrix[0][i];
			}
		}
		return result;
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите размерность квадратной матрицы: ");
		int n = sc.nextInt();
		int[][] matrix = new int [n][n];
		System.out.println("Введите сначала нижнюю, а затем верхнюю границы выбора случайных чисел:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int)(Math.random()*(b-a+1))+a;
				System.out.format("%4s", matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println("Сумма квадратов трехзначных элементов побочной диагонали равна " + summ3symb(matrix));
		System.out.print("Введите параметр K: ");
		int k = sc.nextInt();
		System.out.println("Произведение элементов 0-й строки, больших параметра K, равно " + prod0morek(matrix,k));
		sc.close();
	}
}
