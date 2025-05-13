import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter size of the array :- ");
        int n = ob.nextInt();
        System.out.println("Enter elements in array :- ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
        System.out.println("Arrays created .");
        System.out.println("ENter number to found :- ");
        int x = ob.nextInt();
        int position = -1, l = 0, r = n - 1, m = 0;
        do {
            m = (l + r) / 2;
            if (arr[m] == x) {
                position = m;
                break;
            } else if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m;
            }
        } while (l < r);
        if (position == -1) {
            System.out.println("Element not present in array.");
        } else {
            System.out.println("Element is present at : " + position);
        }
    }
}
