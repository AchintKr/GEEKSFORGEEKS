import java.util.*;

class circle {
    double r;

    void setData(Scanner sc, Scanner sb) {

        System.out.println("Enter the radius :- ");
        r = sc.nextDouble();
        System.out.println("Enter the radius :- ");
        r = sb.nextDouble();
    }

    void area() {
        System.out.println("The area is :- " + (Math.PI * r * r));
    }

    void circumference() {
        System.out.println("The circumference is :- " + (2 * Math.PI * r));
    }
}

public class newtry {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        circle c1 = new circle();
        c1.setData(ob, ob);
        c1.area();
        c1.circumference();
    }
}
