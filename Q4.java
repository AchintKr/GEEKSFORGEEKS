import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int n = ob.nextInt();
        int index = 0;
        int binary[] = new int[40];
        do {
            binary[index++] = n % 2;
            n = n / 2;
        } while (n != 0);
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}
