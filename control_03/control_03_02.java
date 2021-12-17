//
// Контрольная работа № 3 (17 декабря 2021 года) - вариант № 35
//
// Задача № 2
//

import java.util.Scanner;

class GL6 { // класс квадртных матриц размера 6x6
	static final int n = 6;
	private int[][] matrix = new int[n][n];
	GL6() { // конструктор, заполняющий матрицу случайными числами от 2 до 73
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				matrix[i][j] = (int)(Math.random() * 72) + 2;
			}
		}
	}
	GL6(int x) { // констрактор, заполняющий матрицу числами, равными x
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				matrix[i][j] = x;
			}
		}
	}
	GL6(int[][] usualMatrix) { // конструктор копирования из обычного двумерного массива
		int ui = usualMatrix.length;
		int uj = usualMatrix[ui - 1].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i < ui) && (j < uj)) {
					matrix[i][j] = usualMatrix[i][j];
				}
				else {
					matrix[i][j] = 0;
				}
			}
		}
	}
	public void print() { // метод вывода матрицы на экран
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.format("%4s", matrix[i][j]);
			}
			System.out.println();
		}
	}
	public static GL6 dif(GL6 A, GL6 B) { // метод нахождения разности двух матриц
		GL6 AdifB = new GL6(0);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				AdifB.matrix[i][j] = A.matrix[i][j] - B.matrix[i][j];
			}
		}
		return AdifB;
	}
	public int minElRow(int k) { // метод, определяющий минимум в k-ой строке матрицы
		int trueK = (k - 1) % n;
		int minEl = matrix[trueK][0];
		for (int i = 1; i < n; i++) {
			if (matrix[trueK][i] < minEl) {
				minEl = matrix[trueK][i];
			}
		}
		return minEl;
	}
	public boolean isDownTriangle() { // метод проверки, является ли матрица нижнетреугольной
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (matrix[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}
}

public class control_03_02 { // основной класс
	public static void main (String[] args) { // главная функция
		Scanner sc = new Scanner(System.in);
		GL6 randomMatrix = new GL6();
		System.out.println("Матрица, состоящая случайных элементов от 2 до 73:");
		randomMatrix.print();
		int[][] matrix = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				matrix[i][j] = (int)(Math.random() * 10);
			}
		}
		GL6 copiedMatrix = new GL6(matrix);
		System.out.println("Матрица, скопированная из обычного двумерного массива:");
		copiedMatrix.print();
		GL6 difference = GL6.dif(randomMatrix, copiedMatrix);
		System.out.println("Разность этих двух матриц:");
		difference.print();
		System.out.print("Выберите строку: ");
		int k = sc.nextInt();
		System.out.println("Минимальный элемент последней матрицы в строке № " + k + " равен " + difference.minElRow(k));
		if (difference.isDownTriangle()) {
			System.out.println("Последняя матрица является нижнетреугольной");
		}
		else {
			System.out.println("Последняя матрица не является нижнетреугольной");
		}
		sc.close();
	}
}
