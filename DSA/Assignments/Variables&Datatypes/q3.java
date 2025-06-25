// Taxation problem
import java.util.*;
public class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of Pencil: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the price of a Pen: ");
        float pen = sc.nextFloat();
        System.out.println("Enter the price of an Eraser: ");
        float eraser = sc.nextFloat();

        float bill = pencil + pen + eraser;
        System.out.println("Bill Before GST: ");
        System.out.println(bill);

        float total_bill = bill + bill*18/100;
        System.out.println("Bill After GST: ");
        System.out.println(total_bill);

        // q5
        // Names of variables are called identifiers in Java.Identifier rule says, identifiers can start with any alphabet or underscore (“_”) or dollar (“$”).According to the rule the given variable name is a valid identifier.
        int $ = 24;
        System.out.println($);

        sc.close();
    }
}
