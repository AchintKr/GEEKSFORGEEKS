import java.util.*;

public class spy {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter any number :- ");
        int a = ob.nextInt();
        int product = 1;
        int sum = 0;
        for (int i = a; i > 0; i = i / 10) {
            int j = i % 10;

            product = product * j;
            sum = sum + j;
        }

        if (product == sum) {
            System.out.println(a + " is a Spy number .");
        } else {
            System.out.println(a + " is not a spy number .");
        }
    }
}
