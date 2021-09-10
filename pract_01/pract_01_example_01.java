import java.util.Scanner;

public class pract_01_example_01 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); // создание ввода
		int a; // создание целочисленной переменной a
		a = 5; // присвоение переменной значения
		System.out.println("a = " + a); // вывод текста в терминал
		int b,c;
		b = sc.nextInt(); // ввод значения переменной с клаватуры
		c = sc.nextInt();
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		sc.close(); // закрытие ввода
	}
}
