import java.util.*;

public class experiment {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int hew[] = new int[6];
        int few[];
        System.out.println("Enter elemets in array :-");
        for (int i = 0; i < hew.length; i++) {
            hew[i] = ob.nextInt();
        }
        few = hew;
        System.out.println("Last element in array :- " + few[5]);
    }
}
