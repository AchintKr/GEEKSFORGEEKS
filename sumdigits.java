public class sumdigits {
    public static int sum_of_Digits(int n) {
        int sum = 0;
        int x = 0;
        while (n > 9) {
            while (n > 0) {
                x = n % 10;
                sum = sum + x;
                n = n / 10;
            }
            n = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum_of_Digits(9294));
    }
}
