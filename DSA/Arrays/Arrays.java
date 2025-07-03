import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        int marks[] = new int[18];

        Scanner sc = new Scanner(System.in);

        // to find length of an array
        System.out.println("Length of array: " + marks.length);

        System.out.println("Enter three subject marks: ");

        // input
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // output
        System.out.println("Subject1: " + marks[0]);
        System.out.println("Subject2: " + marks[1]);
        System.out.println("Subject3: " + marks[2]);

        // update
        marks[0] = marks[0] + 1;
        System.out.println("Subject1: " + marks[0]);

        sc.close();
    }
}