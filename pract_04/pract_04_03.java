// problem 408
import java.util.Scanner;

public class pract_04_03 {
	public static int count2signkp(int[] arr, int p) {
		int r = 0;
		for (int i = 0; i < arr.length; i++) {
			if (((arr[i] > 9) && (arr[i] < 100)) && (arr[i] % p == 0)) {
				r++;
			}
		}
		return r;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N=");
		int n = sc.nextInt();
		System.out.print("P=");
		int p = sc.nextInt();
		int[] massiv = new int[n];
		for (int i = 0; i < massiv.length; i++) {
			massiv[i] = (int)(Math.random() * 100);
			System.out.print(massiv[i] + " ");
		}
		System.out.println();
		System.out.println(count2signkp(massiv,p));
		sc.close();
	}
}
