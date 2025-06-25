// program that reads a set of integers,and then prints the sum of the even and odd integers.
package DSA.Assignments.Loops;
import java.util.*;
public class q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int even_sum = 0;
        int odd_sum = 0;
        while(true) {
            System.out.println("Enter your choice: \n1.Enter an integer \n2.Print sum of odds and evens \n3.Exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1: {
                    System.out.println("Enter an integer: ");
                    int n = sc.nextInt();
                    if (n % 2 ==0) {
                        even_sum += n;
                    } else { 
                        odd_sum += n;
                    }
                    break;
                }
                case 2: {
                    System.out.println("The odd sum is: " + odd_sum);
                    System.out.println("The even sum is: " + even_sum);
                    break;
                }
                case 3: {
                    System.out.println("Exiting the program...");
                    sc.close();
                    return;
                }
                default: {
                    System.out.println("Invalid Choice!");
                }
            }
        }  
    }
}
