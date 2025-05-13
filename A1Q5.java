import java.util.*;
public class A1Q5 {
	public static int sum_Of_Digits(int n) {
		int sum = 0;
		int r =0;
		for(int i = n;i>0;i=i/10) {
			r = i%10;
			sum=sum+r;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter any number :- ");
		int a = ob.nextInt();
		int j = a;
		while(a>9) {
			a =sum_Of_Digits(a);
		}
		System.out.println("Sum of digits of "+ j +" until the number is a single digit is :- " + a);

	}

}
