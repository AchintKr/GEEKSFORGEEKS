import java.util.Scanner;

public class HA1Q5 {
	public static int max(int[] a) {
		int max = a[0];
		int a1 = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				a1 = i;
			}
		}
		return a1;
	}

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter number of rows in array :-  ");
		int m = ob.nextInt();
		System.out.println("Enter number of columns in array :- ");
		int n = ob.nextInt();
		int marks[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				marks[i][j] = (int) (Math.random() + (0.5));
			}
		}
		int[] max_row = new int[m];
		int[] max_col = new int[n];
		System.out.println("The 2D array is :- ");
		int sum = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(marks[i][j] + " ");
				sum = sum + marks[i][j];
			}
			max_row[i] = sum;
			sum = 0;
			System.out.println();
		}
		System.out.println("End");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sum = sum + marks[j][i];
			}
			max_col[i] = sum;
			sum = 0;

		}
		System.out.println("The largest row index: " + max(max_row));
		System.out.println("The largest column index:" + max(max_col));
	}

}
