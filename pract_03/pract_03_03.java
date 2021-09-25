// problem 306
import java.util.Scanner;

public class pract_03_03 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("M=");
		int m = sc.nextInt();
		System.out.print("N=");
		int n = sc.nextInt();
		int[][] matrix = new int[m][n];
		if (m * n <= 10) {
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print("a(" + (i + 1) + "," + (j + 1) + ")=");
					matrix[i][j] = sc.nextInt();
				}
			}
		}
		else {
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					matrix[i][j] = (int)(Math.random() * 50)*2;
				}
			}
		}
		int count3 = 0;
		System.out.println("Матрица:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.format("%3s", matrix[i][j]);
				if (matrix[i][j] % 3 == 0){
					count3++;
				}
			}
			System.out.println();
		}
		System.out.println("Количество элементов матрицы, кратных 3 равно " + count3);
		sc.close();
	}
}
