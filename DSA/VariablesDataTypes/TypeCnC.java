// Type Conversion And Casting
import java.util.*;
public class TypeCnC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Type Conversion (Small to Big)

        float price = sc.nextInt();
        System.out.println(price);

        // int rate = sc.nextFloat();   // This is not allowed.
        // System.out.println(rate);

        int a = 25;
        long b = a;  // This is called implicit conversion or widening Conversion
        System.out.println(b);

        // long c = 18;
        // int d = c;     // This throws an error bcoz it is considered to be lossy conversion.
        // System.out.println(d);

        // Type Casting (Big to Small)

        float marks = 75.99f;       
        int marks2 = (int) marks;     //Narrow conversion or explicit conversion
        System.out.println(marks);
        System.out.println(marks2);

        char ch ='a';
        int number = ch;
        System.out.println(number);

        sc.close();
    }
}
