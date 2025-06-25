// Sum of digits of the number.
package DSA.Assignments.Functions;
import java.util.*;
public class q5 {

    public static void sum(int n) {
        int sum = 0;
        while (n > 0) {
            int last = n % 10;
            sum = sum + last;
            n = n / 10; 
        }
        System.out.println("Sum of digits of entered number is: " + sum);
    }
    public static void main(String argsp[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sum(n);
        sc.close();
    }
}
