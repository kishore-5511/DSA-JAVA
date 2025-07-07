// Palindrome number checker.
package DSA.Assignments.Functions;

import java.util.*;

public class q3 {
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            rev = rev * 10 + lastdigit;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int reverse = reverse(n);
        if (n == reverse) {
            System.out.println("The entered number is a palindrome.");
        } else {
            System.out.println("The Entered number is not a palindrome.");
        }
        sc.close();
    }
}
