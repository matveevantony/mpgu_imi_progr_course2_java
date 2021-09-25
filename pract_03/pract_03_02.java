// problem 304
import java.util.Scanner;

public class pract_03_02 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++){
			arr[i] = (int)(Math.random() * 100);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		sc.close();
	}
}
