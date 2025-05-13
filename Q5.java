import java.util.*;

public class Q5 {
    public static boolean isprime(int x) {
        for (int j = 2; j < Math.sqrt(x); j++) {
            if (x % j == 0) {
                return false;
            }
            j = j + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int n = ob.nextInt();
        boolean possible = false;
        for (int i = 2; i < n / 2; i++) {
            if (isprime(n - i) && isprime(i)) {
                possible = true;
                break;
            }
        }
        if (possible == false) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
