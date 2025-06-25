package DSA.BitManipulation;

public class IsPowerOfTwo {

    public static boolean CheckPowerOfTwo(int n) {
        return (n&(n-1)) == 0;
    }

    public static void main(String args[]) {
        System.out.println(CheckPowerOfTwo(18));
        System.out.println(CheckPowerOfTwo(8));
    }
}
