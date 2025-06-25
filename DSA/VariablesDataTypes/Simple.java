import java.util.*;
public class Simple {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int a = 10;
        // int b = 12;
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Code to calculate sum and product
        int sum = a + b;
        System.out.println(sum);

        int product = a*b;
        System.out.println(product);

        // Radius of a circle
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;  // java by default considers any decimal value as double.
        System.out.println(area);

        sc.close();
    }
}

// Single line comment.
/*
 multiple 
 line
 comment.
 */