package DSA.Assignments.OOPS;

import java.util.*;

public class q1 {
    public static void main(String args[]) {
        Complex c = new Complex();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b: ");
        int a = sc.nextInt();
        int b =  sc.nextInt();
        System.out.println(c.sum(a,b));
        System.out.println(c.difference(a,b));
        System.out.println(c.product(a,b));
        sc.close();
    }
}

class Complex {
    int sum(int a, int b) {
        return a+b;
    }
    int difference(int a, int b) {
        return a-b;
    }
    int product(int a, int b) {
        return a*b;
    }
}
