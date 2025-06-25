package DSA.Assignments.ConditionalStatements;
// to check a number is positive or negative
import java.util.*;
public class q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number.");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Positive Number.");
        } else if (number < 0) {
            System.out.println("Negative Number.");
        } else {
            System.out.println("Number entered is ZERO.");
        }

        sc.close();
    }
}
