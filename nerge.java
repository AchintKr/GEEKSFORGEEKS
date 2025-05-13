import java.util.*;

public class nerge {
    public static int[] merge(int a[], int b[]) {
        int mix[] = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (a.length > i && b.length > j) {
            if (a[i] > b[j]) {
                mix[k++] = b[j++];
            } else {
                mix[k++] = a[i++];
            }
        }
        while (i < a.length) {
            mix[k++] = a[i++];
        }
        while (j < b.length) {
            mix[k++] = b[j++];
        }
        return mix;
    }

    public static int[] mergesort(int arr[]) {
        if (arr.length == 1) {
            return arr;
        }
        int fir[] = mergesort(Arrays.copyOfRange(arr, 0, arr.length / 2));
        int sec[] = mergesort(Arrays.copyOfRange(arr, arr.length / 2, arr.length));

        return merge(fir, sec);
    }

    public static void main(String[] args) {
        int h[] = { 7, 6, 5, 4, 3 };
        int g[] = mergesort(h);
        System.out.println(Arrays.toString(g));

    }
}
