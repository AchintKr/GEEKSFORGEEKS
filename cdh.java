class X {
    static void run() {
        System.out.println("Lets play:- ");
    }

    static void walk() {
        System.out.println("Walk and run.");
    }
}

class animal {
    void sleep() {
        System.out.println("This animal love to sleep.");
    }

    void eat() {
        System.out.println("This animal love to eat food.");
    }

    void play() {
        System.out.println("They love to play with peoples .");
    }
}

class dog extends animal {
    void bark() {
        System.out.println("He used to bark loudly ");
    }

    void size() {
        System.out.println("He has small size .");
    }
}

class cat extends animal {
    void meow() {
        System.out.println("SHe used to meow smoothly . ");
    }

    void size() {
        System.out.println("She is small in size .");
    }
}

class breed1 extends dog {
    void bark() {
        System.out.println("He used to bark slowly .");
    }

    void size() {
        System.out.println("He is medium in size");
    }
}

class breed2 extends dog {
    void bark() {
        System.out.println("He used to bark moderately .");
    }

    void size() {
        System.out.println("He is large in size");
    }
}

class Cbreed1 extends cat {
    void meow() {
        System.out.println("SHe used to meow slowly .");
    }

    void size() {
        System.out.println("He is medium in size");
    }
}

class Cbreed2 extends cat {
    void meow() {
        System.out.println("SHe used to meow moderately .");
    }

    void size() {
        System.out.println("SHe is large in size");
    }
}

public class cdh {
    public static void main(String[] args) {
        breed1 b1 = new breed1();
        b1.sleep();
        breed2 b2 = new breed2();
        b2.eat();
    }
}
