import java.util.*;

public class newfuc {
    public static void main(String[] args) {
        /*
         * Scanner ob = new Scanner(System.in);
         * System.out.println("Enter Pattern size :- ");
         * int g = ob.nextInt();
         */
        int p = 1;
        for (int i = 1; i < 10; i++) {
            if (i < 6) {
                for (int j = 5; j >= i; j--) {
                    System.out.print(p + "  ");
                    p++;
                }
                if (p == 16) {
                    p = 14;
                }
            } else {

                for (int k = 4; k < i; k++) {
                    System.out.print(p + "  ");
                    p--;
                }
            }
            System.out.println();

        }
    }
}
