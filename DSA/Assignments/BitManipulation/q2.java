// Swap two numbers without using any thirdvariable.

package DSA.Assignments.BitManipulation;

public class q2 {

    public static void SwapXor(int a, int b) {
        System.out.println("Before Swapping a = " + a + " and b = " + b);
        a = a^b;  // a = a^b
        b = a^b;  // b = a^b^b     b^b = 0 => b = a
        a = a^b;  // a = a^b^a     a^a = 0 => a = b
        System.out.println("After Swapping a = " + a + " and b = " + b);
    }

    public static void main(String args[]) {
        int a = 8;
        int b = 7;
        SwapXor(a, b);
    }
}
