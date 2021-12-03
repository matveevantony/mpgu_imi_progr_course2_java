//
// Контрольная работа № 2 (03 декабря 2021 года) - вариант № 35
//

import java.util.Scanner;

class Array16 { // класс одномерных массивов длины 16
	private static int n = 16;
	private int[] a = new int[n]; // поля класса
	Array16() { // конструктор создающий массив случайных чисел от 150 до 627
		for (int i = 0; i < n; i++) {
			a[i] = (int)(Math.random() * (627 - 150 + 1)) + 150;
		}
	}
	Array16(Scanner sc) { // конструктор с вводом элементов массива с клавиатуры
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
	}
	Array16(int[] array) { // конструктор копирования из обычного массива
		int skip = 0;
		if (array.length < n) {
			skip = (n - array.length) / 2;
		}
		for (int i = 0; i < n; i++) {
			int j = i - skip;
			if (j < 0) {
				a[i] = 0;
			}
			else {
				if (j < array.length) {
					a[i] = array[j];
				}
				else {
					a[i] = 0;
				}
			}
		}
	}
	public void print() { // метод вывода массива на экран
		for (int i = 0; i < (n-1); i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print(a[n-1]);
	}
	public int doublesum() { // метод вычисления удвоенной суммы элементов массива
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		sum *= 2;
		return sum;
	}
	public static int firstdigit(int x) { // статический метод нахождения первой цифры числа
		if (x == 0) {
			return 0;
		}
		x = Math.abs(x);
		while (x > 9) {
			x /= 10;
		}
		return x;
	}
	public int maxfirstdigitindexmod3() { // метод, определяющий наибольшую первую цифру среди элементов, остаток от деления идекса которых на 4 равен 3
		int maxdigit = 0;
		for (int i = 0; i < n; i++) {
			if ((i % 4 == 3) && (firstdigit(a[i]) > maxdigit)) {
				maxdigit = firstdigit(a[i]);
			}
		}
		return maxdigit;
	}
	public void ascevensort() { // метод сортировки массива по неубыванию, считая, что любое чётное число больше любого нечётного
		for (int i = 0; i < (n-1); i++) {
			for (int j = 0; j < (n-1); j++) {
				if (((a[j] > a[j+1]) && ((a[j] % 2) == (a[j+1] % 2))) || ((a[j] % 2 == 0) && (a[j+1] % 2 != 0))) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
	public static Array16 array16elsum(Array16 x, Array16 y) { // статический метод, выполняющий поэелемнтное сложение двух массивов
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			res[i] = x.a[i] + y.a[i];
		}
		return new Array16(res);
	}
}

public class control_02_01 { // основной класс
	public static void main (String[] args) { // главная функция
		Scanner sc = new Scanner(System.in);
		Array16 randomArray = new Array16();
		System.out.println("Одномерный массив длины 16, заполненный случайными числами от 150 до 627:");
		randomArray.print();
		System.out.println();
		int[] origArray = new int[11];
		for (int i = 0; i < 11; i++) {
			origArray[i] = (int)(Math.random() * 99 + 1);
		}
		Array16 copyArray = new Array16(origArray);
		System.out.println("Одномерный массив длины 16, скопированный из обычного одномерного массива случайных чисел длины 11:");
		copyArray.print();
		System.out.println();
		System.out.println("Удвоенная сумма элементов второго массива:" + copyArray.doublesum());
		System.out.println("Наибольшая первая цифра среди элементов первого массива, остаток от деления идекса которых на 4 равен 3: " + randomArray.maxfirstdigitindexmod3());
		randomArray.ascevensort();
		System.out.println("Первый массив, отсортированный по неубыванию, считая, что любое чётное число больше любого нечётного:");
		randomArray.print();
		System.out.println();
		System.out.println("Сумма двух массивов:");
		Array16.array16elsum(randomArray,copyArray).print();
		sc.close();
	}
}

