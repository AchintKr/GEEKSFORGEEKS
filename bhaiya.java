class temp {
    int a, b, c;

    temp(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    temp(int x, int y) {
        a = x;
        b = y;

    }

    void display() {
        System.out.println(a + b + c);
    }
}

public class bhaiya {
    public static void main(String[] args) {
        temp t1 = new temp(5, 10);
        t1.display();
        temp t2 = new temp(4, 7, 8);
        t2.display();
    }
}
