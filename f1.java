class student {
    String name;
    int roll;
    String branch;
    int year;

    student() {
        branch = "CSE";
        year = 2023;

    }

    void introduce() {
        System.out.println("My name is " + name);
        System.out.println("My branch is :- " + branch);
        System.out.println("My roll number is :- " + roll);
        System.out.println("I am pusuing my btech from year :- " + year);
    }

}

public class f1 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Achint kumar";
        s1.roll = 1;
        s1.branch = "ECE";
        s1.year = 2021;
        student s2 = new student();
        s2.name = "Ankit RAj";
        s2.roll = 2;
        s1.introduce();
        s2.introduce();
    }
}