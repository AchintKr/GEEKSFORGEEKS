import java.util.*;

public class arrayda {
    public static int occur(int a[], int l) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == l) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of elements in array :-");
        int h = ob.nextInt();
        int a[] = new int[h];
        System.err.println("Enter elements in array :- ");
        for (int i = 0; i < h; i++) {
            int g = ob.nextInt();
            a[i] = g;
        }
        int max = a[0];
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Maximum element of array is " + max + " and occurs " + occur(a, max) + " times.");
        System.out.println("Minimum element of array is " + min + " and occurs " + occur(a, min) + " times.");
        int u = 0;
        level: for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                u = i + 1;
                break level;
            }
        }
        System.out.println("First occurence of maximum elements is :- " + u);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == min) {
                u = i + 1;

            }
        }
        System.out.println("last occurence of maximum elements is :- " + u);
    }
}
