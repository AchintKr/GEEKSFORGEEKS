public class allsub {
    public static void printarr(int arr[], int a, int b) {
        for (int i = a; i <= b; i++)
            System.out.print(" " + arr[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 6, 8 };
        System.out.println("The subarrays are :- ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                printarr(arr, i, j);
            }
        }
        System.out.println("The end .");
    }
}
