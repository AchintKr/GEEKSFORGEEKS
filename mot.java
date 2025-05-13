public class mot {
    public static int numget(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        return count;
    }

    public static void frequencyCount(int arr[], int N, int P) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(numget(arr, i + 1) + " ");
        }
    }

    public static void main(String[] args) {
        int af[] = { 2, 3, 2, 3, 5 };
        frequencyCount(af, 5, 5);
    }
}
