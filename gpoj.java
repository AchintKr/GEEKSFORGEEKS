import java.util.Arrays;

class Pair {
    long first, second;

    public Pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

public class gpoj {
    public static long sumOfDivisors(int N) {
        long sum = 0;
        while (N > 0) {
            for (int i = N; i > 1; i--) {
                if (N % i == 0) {
                    sum += i;
                }
            }
            sum++;
            N--;
        }
        return sum;
    }

    static Pair getMinMax(long a[], long n) {
        int min = 0;
        int max = a.length - 1;
        for (int i = 1; i < a.length; i++) {
            if (a[min] > a[i]) {
                long temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
        for (int i = a.length - 2; i >= 0; i--) {
            if (a[max] < a[i]) {
                long temp = a[max];
                a[max] = a[i];
                a[i] = temp;
            }
        }
        Pair h = new Pair(a[0], a[a.length - 1]);
        return h;
    }

    public static void main(String[] args) {
        long h[] = { 2, 5, 4, 3, 1 };
        getMinMax(h, h.length);
    }
}
