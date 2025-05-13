import java.util.*;

public class homeassignment1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter total number of entries :- ");
        int num = ob.nextInt();
        String name[] = new String[num];
        int marks[][] = new int[num][5];
        for (int i = 0; i < num; i++) {

            System.out.println("Enter Candidate name :- ");
            String p = ob.next();
            name[i] = p;
            for (int j = 0; j < 5; j++) {
                System.out.println("Enter " + name[i] + " marks in subject - (" + (j + 1) + ") out of 100 :- ");
                marks[i][j] = ob.nextInt();

            }
        }
        System.out.println("Name" + "\t" + "subject 1" + "\t" + "subject 2" + "\t" + "subject 3" + "\t" + "subject 4"
                + "\t" + "subject 5");
        for (int i = 0; i < num; i++) {
            System.out.print(name[i] + "\t");
            for (int j = 0; j < 5; j++) {
                System.out.print(marks[i][j] + "\t" + "\t");
            }
            System.out.println();
        }
    }
}
