// problem 307
import java.util.Scanner;

public class pract_05_04 {
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
		int count = 0;
		for (int i = 0; i < n; i++) {
			int maxstr = matrix[i][0];
			boolean maxisonly = true;
			for (int j = 1; j < n; j++) {
				if (matrix[i][j] == maxstr) {
					maxisonly = false;
				}
				if (matrix[i][j] > maxstr) {
					maxstr = matrix[i][j];
					maxisonly = true;
				}
			}
			if (maxisonly) {
				count++;
			}
		}
		System.out.println("Количество элементов строго больших, чем все другие элементы строки, равно " + count);
		sc.close();
	}
}
