import java.util.*;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter 0 for achint input and 1 for ankit input :- ");
        int g = 0;
        int j = 0;
        int achint_sum = 0;
        int ankit_sum = 0;
        int total_sum = 0;

        for (int i = 0; i < 20; i++) {
            int v = sc.nextInt();
            System.out.println("Enter amount :- ");
            int amount = sc.nextInt();
            if (v == 0) {
                g++;
                achint_sum = achint_sum + amount;
            } else if (v == 1) {
                j++;
                ankit_sum = ankit_sum + amount;
            }
            total_sum = total_sum + amount;
        }
        System.out.println("Total amount for " + g + " items are :- " + achint_sum);
        System.out.println("Total amount for " + j + " items are :- " + ankit_sum);
        System.out.println("Total price for " + (g + j) + " items are :- " + total_sum);

    }
}
