package DSA.BitManipulation;

public class BitWiseOperator {
    public static void main(String args[]) {
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);
        System.out.println(~5);
        System.out.println(~0);  // here it considers 0 to be positive number.
        System.out.println(5<<2);
        System.out.println(6>>1);
    }
}
