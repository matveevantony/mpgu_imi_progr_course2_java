// problem 301
import java.util.Scanner;

public class pract_02_02 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 15) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		sc.close();
	}
}
