import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int n = ob.nextInt();
        int sum = 0;
        do {
            sum = sum + n % 10;
            n = n / 10;
        } while (n != 0);
        System.out.println("Sum of the digits :- " + sum);
    }
}
