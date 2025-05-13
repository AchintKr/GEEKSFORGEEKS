import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner ob1 = new Scanner(System.in);
        System.out.println("Enter 0 for achint input and 1 for ankit input :- ");
        int g = 0;
        int j = 0;
        int achint_sum = 0;
        int ankit_sum = 0;
        int total_sum = 0;
        do {
            int v = ob1.nextInt();
            System.out.println("Enter amount :- ");
            int amount = ob1.nextInt();
            switch (v) {
                case 0:
                    achint_sum = achint_sum + amount;
                    g++;
                    break;
                case 1:
                    ankit_sum = ankit_sum + amount;
                    j++;
                    break;
            }
            total_sum = total_sum + amount;
        } while ((g + j) != 83);
        System.out.println("Total amount for " + g + " items are :- " + achint_sum);
        System.out.println("Total amount for " + j + " items are :- " + ankit_sum);
        System.out.println("Total price for " + (g + j) + " items are :- " + total_sum);

    }
}
