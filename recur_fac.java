public class recur_fac {
    public static int fac(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }

    public static int fibroncii(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 2 || n == 1) {
            return 1;
        }
        return (fibroncii(n - 1) + fibroncii(n - 2));

    }

    public static void main(String[] args) {
        System.out.println("Factorial of 4 is :- ");
        System.out.println(fac(4));
        System.out.println("The sum of fibroncii series is :- ");
        System.out.println(fibroncii(7));
    }
}
