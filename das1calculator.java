import java.util.*;

public class das1calculator {
    static double multiplication(double a, double b) {
        return (a * b);
    }

    static double division(double a, double b) {
        return (a / b);
    }

    static double addition(double a, double b) {
        return (a + b);
    }

    static double substraction(double a, double b) {
        return (a - b);
    }

    static double power(double a, double b) {
        return (Math.pow(a, b));
    }

    public static void main(String[] args) {
        char a = 'k';
        while (a != 'X' && a != 'x') {
            Scanner ob = new Scanner(System.in);
            System.out.println("Enter any Operation (+,-,*,/,^)or(for exit enter X) :- ");
            a = ob.next().charAt(0);
            if (a != 'X' && a != 'x') {
                System.out.println("Enter First number :- ");
                double f = ob.nextDouble();
                System.out.println("Enter Second number :- ");
                double s = ob.nextDouble();
                switch (a) {
                    case '+':
                        System.out.println("The sum of number " + f + " & " + s + " is " + addition(f, s));
                        break;
                    case '-':
                        System.out.println("The difference of number " + f + " & " + s + " is " + substraction(f, s));
                        break;
                    case '*':
                        System.out.println("The product of number " + f + " & " + s + " is " + multiplication(f, s));
                        break;
                    case '/':
                        if (s != 0)
                            System.out.println("The division of number " + f + " & " + s + " is " + division(f, s));
                        else
                            System.out.println("Invalid Input.");
                        break;
                    case '^':
                        System.out.println("The result of number " + f + " & " + s + " is " + power(f, s));
                        break;
                    default:
                        System.out.println("Invalid Input .");

                }
            } else {
                System.out.println("Thank you for Using my calculator");
            }
        }
    }
}
