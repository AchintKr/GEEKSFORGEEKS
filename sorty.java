public class sorty {
    public static int find_max_index_no(int a[], int L) {
        int max = a[0];
        for (int i = 1; i <= L; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public static int find_max_index(int a[], int L) {
        int max = a[0];
        int pos = 0;
        for (int i = 1; i <= L; i++) {
            if (max < a[i]) {
                max = a[i];
                pos = i;
            }
        }
        return pos;
    }

    public static int[] selectionsort(int a[]) {
        int c = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            int g = find_max_index(a, c);
            int temp = a[g];
            a[g] = a[c];
            a[c] = temp;
            c--;
        }
        return a;
    }

    public static int[] bubblesort(int a[]) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public static void displayarray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int ax[] = { 12, -5, -9, 5, 34, 65 };
        int ko[] = { 3, 1, 5, 0, -2, 8 };
        System.out.println("Array :- ");
        displayarray(ax);
        selectionsort(ax);
        System.out.println("Selection Sorted :- ");
        displayarray(ax);
        System.out.println("New array :- ");
        displayarray(ko);
        System.out.println("Bubble Sorted :- ");
        bubblesort(ko);
        displayarray(ko);

    }
}
