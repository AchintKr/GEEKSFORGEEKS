
public class parenthe {
    static int top = -1;
    static int a[] = new int[100];

    public static int peek() {
        if (is_empty()) {
            return -1;
        }
        return a[top];
    }

    public static int pop(){
        if(is_empty())
    }

    public static boolean is_empty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
