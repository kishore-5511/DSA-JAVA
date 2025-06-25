package DSA.BitManipulation;

public class OddorEven {

    public static void checkEvenOdd(int n) {
        int BitMask = 1;
        if((n & BitMask) == 0) {
            System.out.println("Even Number.");
        } else {
            System.out.println("Odd Number.");
        }
    }

    public static void main(String args[]) {
        checkEvenOdd(3);
        checkEvenOdd(11);
        checkEvenOdd(18);
    }
}
