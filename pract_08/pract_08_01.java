// problem 503
import java.util.Scanner;

class rat { // класс рациональных чисел
	int p,q; // поля класса
	rat() { // конструктор по умолчанию
		p = 0;
		q = 1;
	}
	rat(int _p) { // конструктор
		p = _p;
		q = 1;
	}
	rat(int _p, int _q) { // конструктор
		p = _p;
		q = _q;
		if (p == 0) {
			q = 1;
		}
		if (q == 0) {
			p = 0;
			q = 1;
		}
		if (q < 0) {
			p = -p;
			q = -q;
		}
	}
	public String print() { // метод вывода рационального числа в строку
		if (p == 0) {
			return "0";
		}
		else {
			if (q == 1) {
				return String.valueOf(p);
			}
			else {
				return String.valueOf(p) + "/" + String.valueOf(q);
			}
		}
	}
	private static int nod(int a, int b) { // функция нахождения НОД двух целых чисел
		a = Math.abs(a);
		b = Math.abs(b);
		if (b > a) {
			int t = a;
			a = b;
			b = t;
		}
		if ((a != 0) && (b == 0)) {
			return a;
		}
		if ((a == 0) && (b == 0)) {
			return 1;
		}
		if (a == b) {
			return a;
		}
		if (b == 1) {
			return 1;
		}
		if ((a % 2 == 0) && (b % 2 == 0)) {
			return 2 * nod(a/2, b/2);
		}
		if ((a % 2 == 0) && (b % 2 != 0)) {
			return nod(a/2, b);
		}
		if ((a % 2 != 0) && (b % 2 == 0)) {
			return nod(a, b/2);
		}
		if ((a % 2 != 0) && (b % 2 != 0)) {
			return nod((a-b)/2, b);
		}
		return 1;
	}
	public void reduce() { // метод сокращения раицональной дроби
		int d = nod(p,q);
		p /= d;
		q /= d;
	}
	public boolean iseq(rat x) { // метод проверки рационального числа на равенство другому рациональному числу
		int n = nod(p,q);
		int a = p / n;
		int b = q / n;
		rat y = x;
		y.reduce();
		if ((a == y.p) && (b == y.q)) {
			return true;
		}
		return false;
	}
	public rat plus(rat x) { // метод сложения двух рациональных чисел
		rat res = new rat((p*x.q)+(x.p*q),q*x.q);
		res.reduce();
		return res;
	}
	public rat minus(rat x) { // метод вычитания одного рационального числа из другого
		rat res = new rat((p*x.q)-(x.p*q),q*x.q);
		res.reduce();
		return res;
	}
	public rat multiply(rat x) { // метод перемножения двух рациональных чисел
		rat res = new rat(p * x.p, q * x.q);
		res.reduce();
		return res;
	}
	public rat devide(rat x) { // метод деления одного рационального числа на другое
		rat res;
		if (x.p != 0) {
			res = new rat(p * x.q, q * x.p);
		}
		else {
			res = new rat();
		}
		res.reduce();
		return res;
	}
}

public class pract_08_01 { // основной класс
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите числитель и знаменатель рационального числа (обыкновенной дроби)");
		int p = sc.nextInt();
		int q = sc.nextInt();
		rat a = new rat(p,q);
		System.out.println("Задано рациональное число " + a.print());
		a.reduce();
		System.out.println("Сократив эту дробь, получим " + a.print());
		System.out.println("Введите числитель и знаменатель ещё одного рационального числа (обыкновенной дроби)");
		p = sc.nextInt();
		q = sc.nextInt();
		rat b = new rat(p,q);
		System.out.println("Задано рациональное число " + b.print());
		if (a.iseq(b)) {
			System.out.println("Введённые числа равны");
		}
		else {
			System.out.println("Введённые числа не равны");
		}
		System.out.println("Сумма введённых рациональных чисел равна " + a.plus(b).print());
		System.out.println("Разность введённых рациональных чисел равна " + a.minus(b).print());
		System.out.println("Произведение введённых рациональных чисел равно " + a.multiply(b).print());
		System.out.println("Частное введённых рациональных чисел равно " + a.devide(b).print());
		sc.close();
	}
}

