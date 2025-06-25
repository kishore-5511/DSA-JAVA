// Add 1 to an integer using Bit Manipulation.
// -x = ~x + 1;
// -~x = x + 1 (by replacing x by ~x)

package DSA.Assignments.BitManipulation;

public class q3 {
    public static void main(String[] args) {
        int x = 7;
        System.out.println(x + " + " + 1 + " is " + -~x);
        x = 9;
        System.out.println(x + " + " + 1 + " is " + -~x);
        x = -3;
        System.out.println(x + " + " + 1 + " is " + -~x);
    }
}
