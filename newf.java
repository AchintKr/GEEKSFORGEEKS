public class newf {
    public static void main(String[] args) {
        int h = 1;
        System.out.print("1+");
        for (int i = 2; i <= 5; i++) {
            System.out.print("(");
            for (int j = 1; j <= i; j++) {
                System.out.print(h);
                h = h + 2;
                if (j != i) {
                    System.out.print("+");
                }
            }
            h = 1;
            if (i != 5)
                System.out.print(")+");
            else
                System.out.print(")");
        }
    }
}
