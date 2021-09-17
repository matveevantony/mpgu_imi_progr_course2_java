// problem 303
import java.util.Scanner;

public class pract_02_03 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int)(Math.random() * 100);
			System.out.print(arr[i] + " ");
		}
		System.out.print("\nk=");
		int k = sc.nextInt();
		int less = 0;
		int divisable = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] < k) less++;
			if (arr[i] % k == 0) divisable++;
		}
		System.out.println("Элементов массива, меньших k, ровно " + less);
		System.out.println("Элементов массива, делящихся на k без остатка, ровно " + divisable);
		sc.close();
	}
}
