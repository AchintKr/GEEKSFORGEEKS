import java.util.Scanner;

public class A1Q4 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter any String  :- ");
		String a = ob.next();
		int count = 0;

		char array[] = new char[a.length()];
		for (int i = 0; i < a.length(); i++) {
			array[i] = a.charAt(i);
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				for (int k = 0; k < array.length; k++) {
					if (i != k && j != k && i != j) {
						System.out.println("" + array[i] + array[j] + array[k]);
						count++;
					}
				}
			}
		}
		System.out.println(count);

	}

}
