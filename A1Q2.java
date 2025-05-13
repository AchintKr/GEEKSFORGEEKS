import java.util.*;
public class A1Q2 {
	public static void bmi(double q) {
		if(q<18.5) {
			System.out.println("The person is Underweight.");
		}
		else if(q>=18.5 && q<=24.9) {
			System.out.println("The person is Normal weight.");
		}
		else if(q>24.9 && q<30) {
			System.out.println("The person is Overweight.");
		}
		else {
			System.out.println("The person is Obese.");
		}
	}

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter Weight of the body(in kilograms) :- ");
		double w = ob.nextDouble();
		System.out.println("Enter height of the body(in meters) :- ");
		double h = ob.nextDouble();
		double t = w/(h*h);
		bmi(t);
		
	}

}
