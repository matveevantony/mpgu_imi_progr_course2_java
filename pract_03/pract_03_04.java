// problem 308
import java.util.Scanner;

public class pract_03_04 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][][][][] arr = new int[2][2][2][2][2];
		int maxel = 0;
		boolean first = true;
		for (int i1 = 0; i1 < 2; i1++) {
			for (int i2 = 0 ; i2 < 2; i2++) {
				for (int i3 = 0; i3 < 2; i3++) {
					for (int i4 = 0; i4 < 2; i4++) {
						for (int i5 = 0; i5 < 2; i5++) {
							System.out.print("a(" + i1 + "," + i2 + "," + i3 + "," + i4 + "," + i5 + ")=");
							arr[i1][i2][i3][i4][i5]=sc.nextInt();
							if (i1 + i2 + i3 + i4 + i5 >= 3) {
								if (first == true) {
									maxel = arr[i1][i2][i3][i4][i5];
									first = false;
								}
								if (arr[i1][i2][i3][i4][i5] > maxel) {
									maxel = arr[i1][i2][i3][i4][i5];
								}
							}
						}
					}
				}
			}
		}
		System.out.println("Наибольший из элементов, индексы которых отличаются от набора из всех единиц не более, чем в 2 позициях, равен " + maxel);
		sc.close();
	}
}
