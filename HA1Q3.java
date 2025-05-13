import java.util.*;
public class HA1Q3 {
	public static int[] create_array(int n) {
		Scanner ob = new Scanner(System.in);
		int [] array = new int [n];
		for(int i = 0;i<n;i++) {
			System.out.println("Enter element in array :- ");
			array[i]=ob.nextInt();
		}
		System.out.println("End of array .");
		return array;}
	public static void display_array(int []array) {
		System.out.println("The array is :- ");
		for(int i =0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("End .");
	}
	

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter length of array :-  ");
		int g= ob.nextInt();
		int []a = create_array(g);
		int []b = create_array(g);
		int []c = new int [g];
		for(int i = 0;i<g;i++) {
			c[i]=(a[i]*b[i]);
		}
		display_array(c);

	}

}
