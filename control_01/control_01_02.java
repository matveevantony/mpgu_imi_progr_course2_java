//
// Контрольная работа № 1 (15 октября 2021 года) - вариант № 32
//
// Задача № 2
//

import java.util.Scanner;

public class control_01_02 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int minel = 62;
		int minindex = -1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ((int)(Math.random()*(61-(-80)+1))+(-80));
			System.out.println("arr[" + i + "]=" + arr[i]);
			if ((arr[i] < minel) && (arr[i] % 2 != 0)) {
				minel = arr[i];
				minindex = i;
			}
		}
		if (minindex != -1) {
			System.out.println("Минимальный среди нечетных элементов массива имеет индекс " + minindex);
		}
		else {
			System.out.println("Нечетных элементов нет");
		}
		sc.close();
	}
}
