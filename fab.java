import java.util.*;

class odd_no {
    int number;

    void odd() {

    }
}

class bot {
    int age;
    String name;
    char Gender;
    long mobile;

    void introduce() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("Gender :- " + Gender);
        System.out.println("Contact number :- " + mobile);
    }
}

class for_circus {
    String name;
    long mobile;
    char section;
    char going;

    void Students_going() {
        if (going == 'Y') {
            System.out.println(name + " of section :- " + section + " is going to circus .");
        } else {
            System.out.println(name + " of section :- " + section + " is not going to circus .");
        }
    }
}

public class fab {
    public static void main(String[] args) {
        bot b1 = new bot();
        b1.age = 20;
        b1.name = "Ashutosh";
        b1.Gender = 'M';
        b1.mobile = 9324332212l;
        bot c1 = new bot();
        c1.introduce();
        c1.age(19);
        c1.name("Ashutosh");
        c1.Gender('M');
        c1.mobile(9324332212l);
        c1.introduce();

        for_circus b2 = new for_circus();
        for_circus b3 = new for_circus();
        b2.section = ('A');
        b2.name = ("Sidhant");
        b2.going = ('Y');
        b2.mobile = (9326432762l);
        b3.section = ('B');
        b3.name = ("Sib");
        b3.going = ('N');
        b3.mobile = (9325785762l);
        b3.Students_going();
        b2.Students_going();

    }
}
