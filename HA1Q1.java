import java.util.*;

public class HA1Q1 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter any value :- ");
		int a = ob.nextInt();
		System.out.println("Enter any value :- ");
		int b = ob.nextInt();
		System.out.println("Enter any value :- ");
		int c = ob.nextInt();
		if ((a + b) == c) {
			System.out.println(a + "+" + b + "=" + c);
		}
		if (a == (b - c)) {
			System.out.println(a + "=" + b + "-" + c);
		}
		if ((a * b) == c) {
			System.out.println(a + "." + b + "=" + c);
		}
		System.out.println("End of program .");
	}

}
