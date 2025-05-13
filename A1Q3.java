import java.util.Scanner;

public class A1Q3 {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter any number :- ");
		int a = ob.nextInt();
		int product = 1;
		int sum = 0;
		int r = 0;
		for(int i = a;i>0;i=i/10) {
			r = i%10;
			product = r*product;
			sum=sum+r;
		}
		if(product == sum) {
			System.out.println(a+" is a spy number .");
		}
		else {
			System.out.println(a+" is not a spy number . ");
		}
	}

}
