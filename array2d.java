import java.util.*;

public class array2d {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of rows (m):- ");
        int m = ob.nextInt();
        System.out.println("Enter number of columns (n):- ");
        int n = ob.nextInt();
        int array[][] = new int[m][n];
        System.out.println("Enter elements in array :- ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Elements in matrix " + i + "," + j + ":- ");
                array[i][j] = ob.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int max = array[0][0];
        int min = array[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Maximum element :- " + max);
        System.out.println("Minimum element :- " + min);
    }
}
