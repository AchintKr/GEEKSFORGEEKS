import java.util.*;

public class pattern {

    public static void display_matrix(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] create_matrix() {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of rows in matrix :- ");
        int m = ob.nextInt();
        System.out.println("Enter number of columns in matrix :- ");
        int n = ob.nextInt();
        int array[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter elements in matrix " + i + "," + j + " :-");
                array[i][j] = ob.nextInt();
            }
        }
        return array;
    }

    public static int[][] transpose_matrix(int m[][]) {
        int give[][] = new int[m[1].length][m.length];
        for (int i = 0; i < m[1].length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i > j) {
                    give[i][j] = m[j][i];
                } else {
                    if (i == j) {
                        give[i][j] = m[i][j];
                    } else {
                        give[i][j] = m[j][i];
                    }
                }
            }
        }
        return give;
    }

    public static String check_upper_lower_triangle(int array[][]) {
        int count_up = 0;
        int count_down = 0;
        level: for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((j > i) && (array[i][j] != 0)) {
                    count_up = 1;
                    break level;
                }
            }
        }
        level: for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((j < i) && (array[i][j] != 0)) {
                    count_down = 1;
                    break level;
                }
            }
        }
        if (count_up == 0) {
            return "The Matrix is Upper triangular .";
        } else if (count_down == 0) {
            return "The Matrix is Lower triangular .";
        } else if (count_up == 1 && count_down == 1) {
            return "The matrix is neither Upper nor Lower triangle.";
        } else {
            return "The matrix is a null matrix .";
        }

    }

    public static boolean check_symmetric(int m[][]) {
        System.out.println("It is only possible for Square Matrix .");
        int count = 0;
        level: for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < i; j++) {
                if (m[i][j] != m[j][i]) {
                    count = 1;
                    break level;
                }
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int array[][] = create_matrix();
        display_matrix(array);
        System.out.println("Transpose of a matrix :- ");
        int transarray[][] = transpose_matrix(array);
        display_matrix(transarray);
        System.out.println("It is symmetric or not(array) :- " + check_symmetric(array));
        System.out.println(check_upper_lower_triangle(array));

    }
}
