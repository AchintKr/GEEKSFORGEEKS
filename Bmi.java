import java.util.*;

public class Bmi {
    public static void person_is(double bmi) {
        System.out.print("The person is ");
        if (bmi < 18.5) {
            System.out.print("Underweight . ");
        } else if (bmi < 25.0 && bmi >= 18.5) {
            System.out.print("Normal Weight . ");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.print("Overweight . ");
        } else {
            System.out.print("Obese . ");
        }
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Eneter weight of the person :- ");
        double a = ob.nextDouble();
        System.out.println("Enter height in meters :- ");
        double b = ob.nextDouble();
        double reg = a / (b * b);
        person_is(reg);
    }
}
