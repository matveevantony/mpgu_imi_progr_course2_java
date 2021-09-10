import java.util.Scanner;

public class pract_01_03 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char c1 = 'L', c2 = 'M';
		int l1 = 44, l2 = 23;
		for (int i = 0; i < l1; i++) {
			System.out.print(c1);
		}
		for (int i = 0; i < l2; i++) {
			System.out.print(c2);
		}
		System.out.print("\n");
		sc.close();
	}
}
