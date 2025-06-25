package DSA.BitManipulation;

public class CountSetBits {

    public static int CountOneBits(int n) {
        int count = 0;
        while (n > 0) {
            if((n & 1) != 0) { // Checking LSB
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(CountOneBits(18));
        System.out.println(CountOneBits(15));
        System.out.println(CountOneBits(1));
    }
}
