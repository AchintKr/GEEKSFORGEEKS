public class newpat {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("  ");
            }
            for (int x = 5; x > i; x--) {
                System.out.print("  ");
            }
            for (int b = 1; b <= i; b++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
