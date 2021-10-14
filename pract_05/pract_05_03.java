// problem 407
import java.util.Scanner;

public class pract_05_03 {
	public static int summlast4 (int[] arr) {
		int summ = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 10 > 4) {
				summ += arr[i];
			}
		}
		return summ;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = (int)(Math.random()*100);
			System.out.format("%3s",array[i]);
		}
		System.out.println();
		System.out.println(summlast4(array));
		sc.close();
	}
}
