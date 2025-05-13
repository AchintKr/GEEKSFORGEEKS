public class binsear {
    public static int binse(int arr[], int x) {
        int e = arr.length - 1;
        int s = 0;
        while (e >= s) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                s = mid + 1;
            } else if (arr[mid] > x) {
                e = mid - 1;
            }
        }
        return -1;

    }

    public static int astro_binse(int arr[], int x) {
        int e = arr.length - 1;
        int s = 0;
        boolean asc = arr[e] > arr[s];
        while (e >= s) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (asc) {
                if (arr[mid] < x) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } else {
                if (arr[mid] > x) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int g[] = { 6, 5, 4, 3, 2 };
        System.out.println(astro_binse(g, 6));
    }
}
