import java.util.*;

public class pnmm {

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> ant = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (!ant.contains(arr[i]) && arr[i] == arr[i + 1]) {
                ant.add(arr[i]);
            }
        }
        if (ant.isEmpty()) {
            ant.add(-1);
        }
        return ant;

    } 

    public static void main(String[] args) {
        int h[] = { 1, 7, 3 };
        ArrayList<Integer> goh = duplicates(h, h.length);
        System.out.println(goh.get(0));

    }
}
