import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int n = ob.nextInt();
        int reverse = 0, temp = n;
        do {
            reverse = (reverse * 10) + n % 10;
            n = n / 10;
        } while (n != 0);
        if (reverse == temp) {
            System.out.println(temp + " is a palindrome");
        } else {
            System.out.println(temp + " is not a palindrome");
        }
    }
}