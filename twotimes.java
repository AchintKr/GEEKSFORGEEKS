import java.util.Scanner;

public class twotimes {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("ENter any number greater than 2");
        int a = ob.nextInt();
        int g = 0;
        for (int i = a; i > 2; i = i / 2) {
            g++;
        }
        System.out.println(g);

    }
}
