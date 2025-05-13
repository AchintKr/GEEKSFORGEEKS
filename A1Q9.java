import java.util.Scanner;

public class A1Q9 {
	public static double sumMajorDiagonal(double[][] marks) {
		double sum = 0;
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j++) {

				if (i == j) {
					sum = sum + marks[i][j];
				}
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("ENter same number of rows and columns .");
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter number of rows in array :-  ");
		int m = ob.nextInt();
		System.out.println("Enter number of columns in array :- ");
		int n = ob.nextInt();
		double marks[][] = new double[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter element in (" + i + "," + j + ") matrix :- ");
				marks[i][j] = ob.nextDouble();
			}
		}
		double sum = 0;
		System.out.println("The 2D(matrix) array is :- ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(marks[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("The Major diagonal sum of matrix is  :- " + sumMajorDiagonal(marks));
		ob.close();
	}

}
