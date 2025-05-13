import java.util.Arrays;

public class arraysm {
    public static int getPairsCount(int[] arr, int n, int k) {
        int c = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < k) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < k) {
                        if ((arr[i] + arr[j] == k)) {
                            c++;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int h[] = { 1, 5, 7, 1 };
        System.out.println("Number of pairs with sum K is " + getPairsCount(h, 4, 6));
    }
}
