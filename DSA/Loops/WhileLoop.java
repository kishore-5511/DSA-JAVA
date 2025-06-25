package DSA.Loops;
import java.util.*;

public class WhileLoop {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
        // Basic
        int counter = 0;
        while (counter < 10) {
            System.out.println("Hello World");
            counter++;
        }

        // Print number from 1 to 10
        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }

        // Print number from 1 to n
        System.out.println("Enter a number: ");
        int range = sc.nextInt();
        int count = 1;
        while (count <= range) {
            System.out.println(count);
            count++;
        }

        // Print sum of first n natural numbers
        int sum = 0;
        int i = 1;
        while (i <= range) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of n numbers is: " + sum);

        // Print Reverse of a number
        int n = 1835; 
        while (n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n/10;
        }

        // Reverse the given number 
        int m = 12345;
        int rev = 0;
        while (m > 0) {
            int last = m % 10;
            rev = (rev * 10) + last;
            m = m/10;
        }
        System.out.println("\n" + rev);

        // Do while
        int c =1;
        do {
            System.out.println("Hello");
            c++;
        } while(c <= 5);

        // Keep entering numbers till user enters a multiple of 10
        do {
            System.out.println("Enter a number: ");
            int z = sc.nextInt();
            if(z % 10 == 0) {
                break;
            }
            System.out.println(z);
        } while(true);

        // Dispaly all numbers entered by user except multiples of 10.
        do {
            System.out.println("Enter a number (Enter -1 to exit): ");
            int t = sc.nextInt();
            if (t == -1) {
                break;
            }
            if(t % 10 == 0) {
                continue;
            }
            System.out.println(t);
        } while(true);

        sc.close();   
        // here its showing an error bcoz before lines of the program lead to a infinte program and program never reaches the sc.close() line
    }
}