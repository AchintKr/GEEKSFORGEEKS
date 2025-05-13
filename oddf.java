import java.util.*;

public class oddf {
    public static boolean isOdd(int n) {
        if ((n & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter any number greater than 2");
        int a = ob.nextInt();
        System.out.println(a + " is  odd :" + isOdd(a));
    }
}
