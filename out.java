import java.util.*;

public class out {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = ob.nextInt();
        int g = n;
        int f = 0, i = 2, x = 0;
        int sum = 0;
        while (i <= n / 2) {
            if (n % i == 0) {
                x++;
            }
            i++;
        }
        i = 2;
        if (x == 0) {
            while (n != 0) {
                sum = sum * 10 + (n % 10);
                n = n / 10;
            }
            while (i <= (sum / 2)) {
                if (sum % i == 0) {
                    f = f + 1;
                }
                i++;
            }
        }
        if (f == 0 && x == 0) {
            System.out.println(g + " is a twisted pair number ");
        } else {
            System.out.println(g + " is not a twisted pair number ");
        }

    }
}
