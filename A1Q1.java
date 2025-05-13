import java.util.*;

public class A1Q1 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("The positive integer greater than 2 from command line argument is");
		// int a = Integer.parseInt(args[0]);
		int a = ob.nextInt();
		System.out.println(a);
		int g = 0;
		for (int i = a; i > 2; i = i / 2) {
			g++;
		}
		System.out.println("The number of times " + a + " should be divided to get number less than two is :- " + g);

	}

}
