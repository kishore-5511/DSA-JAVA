// Average of 3 numbers.
package DSA.Assignments.Functions;

import java.util.*;

public class q1 {
    public static void average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.println("Average of 3 numbers: " + avg);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        average(a, b, c);
        sc.close();
    }
}
