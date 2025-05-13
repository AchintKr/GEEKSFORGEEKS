public class bhat {
    public static int prodofarr(int arr[], int a, int b) {
        int prod = 1;
        for (int i = a; i <= b; i++) {
            prod *= arr[i];
        }
        return prod;
    }

    public static long maxsubarr(int arr[], int n) {
        long sum1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum1 = Math.max(sum1, prodofarr(arr, i, j));
            }
        }
        return sum1;
    }

    public static void main(String[] args) {
        int g[] = { -1, -2, -3, -7, -6 };
        System.out.println("Maximum subarray product is " + maxsubarr(g, 5));
    }
}
