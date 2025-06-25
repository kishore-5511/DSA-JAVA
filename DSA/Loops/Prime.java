// Check if a number is prime or not.

package DSA.Loops;
import java.util.*;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any  number greater than 1: ");
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("n is a prime number.");
        } else {
            boolean isprime = true;
            // If n is a composite number (i.e., not prime), then it must have at least one factor less than or equal to sqrt(n).
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isprime = false;
                }
            }
            if (isprime == true) {
                System.out.println("n is a prime number.");
            } else {
                System.out.println("n is not a prime number.");
            }
        }
        sc.close();
    }
}

