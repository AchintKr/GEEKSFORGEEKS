public class che_tri {
    public static boolean checkTriplet(int[] arr, int n) {
        if (n > 2) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    for (int j2 = 0; j2 < arr.length; j2++) {
                        if (i != j && j != j2 && i != j2) {
                            if (arr[i] * arr[i] + arr[j] * arr[j] == arr[j2] * arr[j2]) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int j[] = { 3, 8, 5, 6, 7 };
        System.out.println(checkTriplet(j, j.length));

    }
}
