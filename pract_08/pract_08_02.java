// problem 603
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

public class pract_08_02 { // основной класс
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		rat[] arr = new rat[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = new rat((int)(Math.random()*100),(int)(Math.random()*100));
			arr[i].reduce();
		}
		rat summ = new rat();
		for (int i = 0; i < 5; i++) {
			summ = summ.plus(arr[i]);
		}
		System.out.println(arr[0].print() + "+" + arr[1].print() + "+" + arr[2].print() + "+" + arr[3].print() + "+" + arr[4].print() + "=" + summ.print());
		sc.close();
	}
}

