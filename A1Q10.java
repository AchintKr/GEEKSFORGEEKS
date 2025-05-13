import java.util.Scanner;

public class A1Q10 {
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum =0;
		for(int i = 0;i<m.length;i++) {
			sum =sum + m[i][columnIndex];
		}
		return sum ;
	}

	public static void main(String[] args) {
		
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter number of rows in array :-  ");
		int m = ob.nextInt();
		System.out.println("Enter number of columns in array :- ");
		int n = ob.nextInt();
		double marks[][] = new double [m][n];
		for(int i= 0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("Enter element in ("+i+","+j+") matrix :- ");
				marks[i][j] = ob.nextDouble();
			}
		}
		System.out.println("The 2D(matrix) array is :- ");
		for(int i= 0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(marks[i][j]+"  ");}
			System.out.println();
		}
		for(int i= 0;i<n;i++) {
			System.out.println("Sum of the elements at column "+i+" is :- "+sumColumn(marks,i));
		}
		ob.close();
		
	}

}
