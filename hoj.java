import java.util.Arrays;

public class hoj {
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void pushZerosToEnd(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == 0 && arr[j] != 0) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n[] = { 3, 0, 0, 0, 5, 6 };
        System.out.println("Array before pushing zeros to end:");
        pushZerosToEnd(n, n.length);
        System.out.println(Arrays.toString(n));
    }
}
