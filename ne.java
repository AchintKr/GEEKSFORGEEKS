public class ne {
    public static int bin_sear(int arr[], int x) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        while (s != e) {
            int mid = (e + s) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        if (arr[e] == x) {
            return e;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int h[] = { 2, 3, 4, 5, 6 };
        System.out.println("Element found at index " + bin_sear(h, 7));
    }
}
