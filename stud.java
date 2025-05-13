import java.util.Scanner;

class student {
    int roll;
    String name;
    int DSA_marks;

    void displayData() {
        System.out.println("My name is " + name);
        System.out.println("My roll number is " + roll);
        System.out.println("I got " + DSA_marks + " in my DSA .");
    }

    void inputData() {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your name :- ");
        name = ob.next();
        System.out.println("Enter your roll number :- ");
        roll = ob.nextInt();
        System.out.println("Enter DSA_marks :- ");
        DSA_marks = ob.nextInt();
    }
}

public class stud {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of enteries :- ");
        int n = ob.nextInt();
        student s[] = new student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new student();
            s[i].inputData();
            s[i].displayData();
        }
        int max = s[0].DSA_marks;
        int g = 0;
        for (int i = 1; i < n; i++) {
            if (s[i].DSA_marks > max) {
                max = s[i].DSA_marks;
                g = i;
            }
        }
        System.out.println("Toppers data :- ");
        s[g].displayData();
    }
}
