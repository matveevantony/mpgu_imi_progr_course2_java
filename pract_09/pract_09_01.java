// problem 504
import java.util.Scanner;

class Array10 { // класс одномерных массивов длины 10
	private static int n = 10;
	private int[] a = new int[n]; // поля класса
	Array10() { // конструктор по умолчанию
		for (int i = 0; i < n; i++) {
			a[i] = 0;
		}
	}
	Array10(Scanner sc) { // конструктор с вводом элементов массива с клавиатуры
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
	}
	Array10(int[] array) { // конструктор копирования из обычного массива
		for (int i = 0; i < n; i++) {
			if (i < array.length) {
				a[i] = array[i];
			}
			else {
				a[i] = 0;
			}
		}
	}
	public void print() { // метод вывода массива на экран
		for (int i = 0; i < (n-1); i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print(a[n-1]);
	}
	public int readvalue (int i) { // метод, возвращающий значение i-го элемента массива
		if ((i > -1) && (i < n)) {
			return a[i];
		}
		return 0;
	}
	public void writevalue (int i, int v) { // метод присвоения i-му элементу массива значения v
		if ((i > -1) && (i < n)) {
			a[i] = v;
		}
	}
	public int minindex() { // метод нахождения индекса минимального элемента массива
		int minindex = 0;
		int minvalue = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] < minvalue) {
				minvalue = a[i];
				minindex = i;
			}
		}
		return minindex;
	}
	public int maxindex() { // метод нахождения индекса максимального элемента массива
		int maxindex = 0;
		int maxvalue = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] > maxvalue) {
				maxvalue = a[i];
				maxindex = i;
			}
		}
		return maxindex;
	}
	public int minvalue() { // метод нахождения значения минимального элемента массива
		return readvalue(minindex());
	}
	public int maxvalue() { // метод нахождения значения максимального элемента массива
		return readvalue(maxindex());
	}
	public void ascsort() { // метод сортировки массива по возрастанию
		for (int i = 0; i < (n-1); i++) {
			for (int j = n-2; j >= i; j--) {
				if (a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
	public void descsort() { // метод сортировки массива по убыванию
		for (int i = 0; i < (n-1); i++) {
			for (int j = n-2; j >= i; j--) {
				if (a[j] < a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
	public int sum() { // метод нахождения суммы всех элементов массива
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		return sum;
	}
	public int search(int x) { // метод поиска элемента с заданным значением
		for (int i = 0; i < n; i++) {
			if (a[i] == x) {
				return i;
			}
		}
		System.out.println("Элемент со значением " + x + " в массиве не найден");
		return -1;
	}
}

public class pract_09_01 { // основной класс
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		final int n = 10;
		System.out.println("Введите элементы одномерного целочисленного массива длины 10:");
		Array10 arrkey = new Array10(sc);
		System.out.println("Введённый массив:");
		arrkey.print();
		System.out.println();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = (int)(Math.random() * 199) - 99;
		}
		Array10 arr = new Array10(array);
		System.out.println("Массив случайных чисел, полученный копированием из обычного массива:");
		arr.print();
		System.out.println();
		System.out.println("Максимальный элемент массива " + arr.maxvalue() + " имеет индекс " + arr.maxindex());
		System.out.println("Минимальный элемент массива " + arr.minvalue() + " имеет индекс " + arr.minindex());
		Array10 arrasc = new Array10(array);
		arrasc.ascsort();
		System.out.println("Массив, отсортированный по возрастанию:");
		arrasc.print();
		System.out.println();
		Array10 arrdesc = new Array10(array);
		arrdesc.descsort();
		System.out.println("Массив, отсортированный по убыванию:");
		arrdesc.print();
		System.out.println();
		System.out.println("Сумма элементов массива равна " + arr.sum());
		System.out.print("Введите элемент, который хотите найти в массиве: ");
		int find = sc.nextInt();
		int found = arr.search(find);
		if (found != -1) {
			System.out.println("Элемент со значением " + find + " присутствует в массиве под индексом " + found);
		}
		sc.close();
	}
}

