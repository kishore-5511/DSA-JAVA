package DSA.Assignments.ConditionalStatements;

// Leap year
import java.util.*;

public class q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if ((year % 4) == 0) {
            if ((year % 100) == 0) {
                if ((year % 400) == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not a Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }
}

// More optimized solution

// import java.util.*;
// public class Solution {
// public static void main(String[]args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Input the year: ");

// int year=sc.nextInt();
// boolean x = (year%4) == 0;
// boolean y = (year%100) != 0;
// boolean z= ((year%100==0) && (year%400==0));

// if(x && (y||z)) {
// System.out.println(year +" is a leap year");
// } else {
// System.out.println(year +" is not a leapyear");
// sc.close();
// }
// }