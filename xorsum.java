import java.util.*;

public class xorsum {
    public static long sumXOR(int arr[], int n) {
        long sum = 0;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                sum += (arr[i] ^ arr[j]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 5 };
        System.out.println(sumXOR(arr, arr.length));
    }
}
