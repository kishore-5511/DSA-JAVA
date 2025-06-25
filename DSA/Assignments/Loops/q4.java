// multiplication of a number.
package DSA.Assignments.Loops;
import java.util.*;
public class q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
        sc.close();
    }
}
