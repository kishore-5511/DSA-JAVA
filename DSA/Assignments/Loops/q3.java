// Factorial of a number.
package DSA.Assignments.Loops;

import java.util.*;

public class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
        if (n == 0) {
            System.out.println("Factorial of 0 is 1.");
            sc.close();
            return;
        }
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of n is: " + fact);
        sc.close();
    }
}
