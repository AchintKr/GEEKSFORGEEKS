import java.util.*;

public class mJo {

    public static int majorityElement(int a[], int size) {
        if (size > 1) {
            Arrays.sort(a);
            int c = 1;
            for (int i = 0; i < size - 1; i++) {
                if (a[i] == a[i + 1]) {
                    c++;
                } else {
                    c = 1;
                }
                if (c >= (double) (size) / 2 && c != 1) {
                    return a[i];
                }
            }
            return -1;
        } else {
            return a[0];
        }
    }

    public static void main(String[] args) {
        int h[] = { 13 };
        System.out.println(majorityElement(h, h.length));
    }
}
