// problem 307
import java.util.Scanner;

public class pract_04_04 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N=");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		System.out.println("Матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int)(Math.random() * 11);
				System.out.format("%3s", matrix[i][j]);
			}
			System.out.println();
		}
		int summ = 0;
		int prod = 1;
		for (int i = 0; i < n; i++) {
			summ += matrix[i][i];
			prod *= matrix[n-i-1][i];
		}
		System.out.println("Сумма элементов главной диагонали равна " + summ);
		System.out.println("Произведение элементов побочной диагонали равно " + prod);
		sc.close();
	}
}
