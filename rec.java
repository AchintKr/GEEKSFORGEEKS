class rectangle {
    int b;
    int h;

    rectangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    rectangle(rectangle t) {
        b = t.b;
        h = t.h;
    }

    void area() {
        System.out.println("Area = " + (b * h));
    }
}

public class rec {
    public static void main(String[] args) {
        rectangle r1 = new rectangle(10, 20);
        rectangle r2 = new rectangle(r1);
        r1.area();
        r1.b = 30;
        r1.h = 25;
        r1.area();

        r2.area();
        System.out.println(r2.b);
        System.out.println(r2.h);
    }
}
