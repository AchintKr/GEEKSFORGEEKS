import java.util.*;

public class paren {
    public static boolean ispar(String x) {
        Stack<Character> num = new Stack<>();
        if (x.length() % 2 == 0) {
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == '[' || x.charAt(i) == '{' || x.charAt(i) == '(') {
                    num.push(x.charAt(i));
                } else if ((!num.isEmpty()) && (x.charAt(i) - num.peek() < 3)) {
                    num.pop();
                } else {
                    return false;
                }
            }
            if (num.isEmpty()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int minJumps(int[] arr) {
        int n = arr.length;
        int jump = 0;
        int max = 0;
        int k = 0;
        int sum = 0;
        for (int i = 0; i < n;) {
            k = arr[i];
            sum = sum + k;
            if (sum >= n - 1) {
                return jump + 1;
            }
            if (k == 0) {
                return -1;
            }
            int m = 0;
            max = 0;
            for (int j = i + 1, l = 0; j < n - 1 && l < k; j++, l++) {
                max = Math.max(max, l + arr[j]);
                if (max == l + arr[j] && arr[j] != 0)
                    m = j;
            }
            if (m == 0)
                return -1;
            jump++;
            i = m;

        }
        return -1;

    }

    /*
     * public static int minJumps1(int[] arr) {
     * if (arr == null || arr.length <= 1)
     * return -1;
     * int count = 0;
     * int i = 0;
     * while (i < arr.length - 1) {
     * if (arr[i] != 0) {
     * i += arr[i];
     * count++;
     * } else {
     * return -1;
     * }
     * }
     * if (i >= arr.length - 1) {
     * return count;
     * } else {
     * return -1;
     * }
     * }
     */

    public static void main(String[] args) {
        int h[] = { 2, 3, 6, 4, 9, 8 };
        System.out.println(minJumps(h));
    }
}
