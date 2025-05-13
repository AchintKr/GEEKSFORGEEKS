import java.util.*;

public class swapc {
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int count_swap(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return count;
    }

    public static void main(String[] args) {
        int g[] = { 1, 3, 2, 5, 4 };
        System.out.println(count_swap(g));
    }
}
