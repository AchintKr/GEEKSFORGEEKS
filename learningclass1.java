class Employee1 {
    int salary;
    String name;

    public int getsalary() {
        return salary;
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }
}

class shape_cir {
    double radius;

    public double area() {
        return (Math.PI * radius);
    }

    public double circumference() {
        return (2 * Math.PI * radius);
    }
}

class shape_sqa {
    int side;

    public int area() {
        return (side * side);
    }

    public int perimeter() {
        return (4 * side);
    }

    public int volume() {
        return (side * side * side);
    }
}

class shape_rec {
    int length;
    int breadth;
    int height;

    public int area() {
        return (length * breadth);
    }

    public int perimeter() {
        return (2 * (length + breadth));
    }

    public int volume() {
        return (length * breadth * height);
    }
}

class cellphone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void callfriend() {
        System.out.println("Call Mukul ...");
    }
}

class tommyvecetti {
    public void hit() {
        System.out.println("Hitting ...");
    }

    public void run() {
        System.out.println("Running...");
    }
}

public class learningclass1 {

    public static void main(String[] args) {
        /*
         * Employee1 golu = new Employee1();
         * golu.salary = 15000;
         * golu.name = "Ketchup";
         * System.out.println(golu.getname());
         * golu.setname("Frooti.");
         * System.out.println(golu.getname());
         * System.out.println(golu.salary);
         * 
         * cellphone asus = new cellphone();
         * asus.callfriend();
         * asus.vibrate();
         * asus.ring();
         */
        shape_sqa square = new shape_sqa();
        square.side = 5;
        System.out.println("Square :- ");
        System.out.println(square.volume());
        System.out.println(square.perimeter());
        System.out.println(square.area());
        shape_rec rectangle = new shape_rec();
        rectangle.length = 3;
        rectangle.breadth = 4;
        rectangle.height = 5;
        System.out.println("Rectangle :- ");
        System.out.println(rectangle.volume());
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        shape_cir circle = new shape_cir();
        circle.radius = 4.5;
        System.out.println("Circle :- ");
        System.out.println(circle.area());
        System.out.println(circle.circumference());
        tommyvecetti game = new tommyvecetti();
        game.hit();
        game.run();
    }
}
