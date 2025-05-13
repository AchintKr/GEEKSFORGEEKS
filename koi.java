public class koi {
    public static int sec_max(int arr[]) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    x = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = x;
                }
            }
        }
        return arr[arr.length - 2];
    }

    public static int sec_min(int arr[]) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    x = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = x;
                }
            }
        }
        return arr[1];
    }

    public static void main(String[] args) {
        int arr[] = { 12, 32, 54, 23, 76, 89 };
        System.out.println(sec_max(arr));
        System.out.println(sec_min(arr));
    }
}
