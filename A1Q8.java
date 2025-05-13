import java.util.*;
public class A1Q8 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter number of rows in array :-  ");
		int m = ob.nextInt();
		System.out.println("Enter number of columns in array :- ");
		int n = ob.nextInt();
		int marks[][] = new int [m][n];
		for(int i= 0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("Enter element in ("+i+","+j+") matrix :- ");
				marks[i][j] = ob.nextInt();
			}
		}
		int sum =0;
		System.out.println("The 2D array is :- ");
		for(int i= 0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(marks[i][j]+" ");
				sum = sum + marks[i][j];
			}
			System.out.println();
		}
		System.out.println("The sum is :- "+sum);
		ob.close();
		
		

	}

}
