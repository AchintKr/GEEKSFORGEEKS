import java.util.Scanner;

public class A1Q6 {
	public static boolean isOdd(int n) {
		if((n&1)==0) {
			return false;
		}
		else {
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter any number :- ");
		int a = ob.nextInt();
		System.out.println(a +" is a odd number :-  "+isOdd(a));
	}

}
