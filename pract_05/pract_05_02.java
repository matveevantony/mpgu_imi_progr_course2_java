// problem 409
import java.util.Scanner;

public class pract_05_02 {
	public static int doublesumodd (int[][] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 == 1) {
					count += arr[i][j];
				}
			}
		}
		return count * 2;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		System.out.print("m=");
		int m = sc.nextInt();
		int [][] array = new int[n][m];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random()*100);
				System.out.format("%3s",array[i][j]);
			}
			System.out.println();
		}
		System.out.println(doublesumodd(array));
		sc.close();
	}
}
