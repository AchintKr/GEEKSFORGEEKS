import java.util.Scanner;

public class HA1Q4 {
	public static double[][] addMatrix(double[][] a, double[][] b){
		double res[][] =new double[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j =0;j<a[0].length;j++) {
				res[i][j]=(a[i][j]+b[i][j]);
			}
		}
		return res;
		
	}
	public static double[][] create_array(int m,int n) {
		Scanner ob = new Scanner(System.in);
		double [][] array = new double [m][n];
		for(int i = 0;i<m;i++) {
			for(int j= 0;j<n;j++) {
			System.out.println("Enter element in ("+i+","+j+") array :- ");
			array[i][j]=ob.nextDouble();
		}}
		System.out.println("End of array .");
		return array;}
	public static void display_array(double [][]array) {
		System.out.println("The array is :- ");
		for(int i =0;i<array.length;i++) {
			for(int j =0;j<array[i].length;j++) {
			System.out.print(array[i][j]+"  ");
		}System.out.println();}
		System.out.println("End .");
	}

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter number of rows in array :-  ");
		int m = ob.nextInt();
		System.out.println("Enter number of columns in array :- ");
		int n = ob.nextInt();
		double a[][] = create_array(m,n);
		double b[][] = create_array(m,n);
		double add [][]= addMatrix(a,b);
		display_array(a);
		display_array(b);
		display_array(add);
		

	}

}
