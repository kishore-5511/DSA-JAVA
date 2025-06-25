package DSA.ConditionalStatements;
import java.util.*;

public class IfElse {
    public static void main(String args[]) {
        int age = 20;
        if (age >= 18) {
            System.out.println("Adult : drive, vote");
        }
        else if (age >= 13 && age < 18) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Not Adult");
        }
         // Largest of 2 numbers 
         int a = 12;
         int b = 14;
         if (a > b) {
            System.out.println("A is largest of 2");
        } else if (a < b) {
            System.out.println("B is largest of 2"); 
        } else {
            System.out.println("Both numbers are equal.");
        }

        // Print odd or even
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println("Even.");
        } else {
            System.out.println("Odd.");
        }

        // Income Tax Calculator
        float income = sc.nextFloat();
        float tax;
        if (income < 500000) {
            tax = 0;
        }
        else if ( income >= 500000 && income < 1000000) {
            tax = income * 0.2f;
        } else {
            tax = income * 0.3f;
        }

        System.out.println("Your tax is: " + tax);

        // Print the largest of 3 numbers
        int x = 12;
        int y = 18;
        int z = 10;
        if ((x > y) && (x > z)) {
            System.out.println("X is the largest of 3");
        } else if ( y > z) {
            System.out.println("Y is the largest of 3");
        } else {
            System.out.println("Z is the largest of 3");
        }

        sc.close();
    }
}