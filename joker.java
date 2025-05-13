import java.util.Arrays;

public class joker {
    public static int kthSmallest1(int[] arr, int l, int r, int k) {
        Arrays.sort(arr);
        return arr[r - k + 1];
    }

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = l; j < r; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr[r - k + 1];
    }

    public static void main(String[] args) {
        int h[] = { 4, 2, 6, 8, 9, 1, 6 };
        System.out.println(kthSmallest(h, 0, h.length - 1, 1));
    }
}
