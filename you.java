import java.util.Stack;

public class you {
    public static boolean paren(String x) {
        if (x.length() % 2 == 1) {
            return false;
        } else {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < x.length(); i++) {
                char c = x.charAt(i);
                if (c == '{' || c == '[' || c == '(') {
                    stack.add(c);
                } else if (!stack.isEmpty() && (c - stack.peek() < 3)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (stack.isEmpty()) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        String h = "{[])";
        System.out.println(paren(h));
    }
}
