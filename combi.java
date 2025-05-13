import java.util.*;

public class combi {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter String to which the combinations to be made :- ");
        String a = ob.next();
        char array[] = new char[a.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = a.charAt(i);
        }
        System.out.println("The 3 digit strings can be made without repetion with string :- " + a);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    if (i != j && j != k && i != k) {
                        System.out.println("" + array[i] + array[j] + array[k]);
                    }
                }

            }

        }
    }
}
