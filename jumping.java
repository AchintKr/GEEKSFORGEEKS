public class jumping {
    static int minJumps(int[] arr) {
        if (arr == null || arr.length <= 1)
            return -1;
        int count = 0;
        for (int i = 0; i < arr.length;) {
            if (i == arr.length - 1) {
                return count;
            } else {
                i += arr[i];
                count++;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int h[] = { 3, 5, 6, 7 };
        System.out.println(minJumps(h));
    }
}
