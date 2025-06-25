package DSA.BitManipulation;

public class Operations {

    public static int getIthBit(int n, int i) {
        int BitMask = 1<<i;
        if((n & BitMask) == 0) {
            return 0;
        }
        return 1;
    }

    public static int setIthBit(int n, int i) {
        int BitMask = 1<<i;
        return n | BitMask;
    }

    public static int clearIthBit(int n, int i) {
        int BitMask = ~(1<<i);
        return n & BitMask;
    }

    public static int UpdateIthBit(int n, int i, int newBit) {
        // Traditional Approach
        // if(newBit == 0) {
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        // Logical Approach
        n = clearIthBit(n, i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }

    public static int clearIBits(int n, int i) {
        int BitMask = (~0)<<i;
        return n & BitMask;
    }

    public static int clearBitsinRange(int n, int i, int j) {
        int a = (~0)<<(j+1);
        int b = (1<<i) - i;
        int BitMask = a | b;
        return n & BitMask;
    }

    public static void main(String args[]) {
        System.out.print(getIthBit(18, 4));
        System.out.print(getIthBit(18,3));
        System.out.print(getIthBit(18, 2));
        System.out.print(getIthBit(18, 1));
        System.out.println(getIthBit(18, 0));
        System.out.println(setIthBit(18, 3));
        System.out.println(clearIthBit(18, 1));
        System.out.println(UpdateIthBit(18, 3, 1));
        System.out.println(UpdateIthBit(18, 1, 0));
        System.out.println(clearIBits(15, 2));
        System.out.println(clearBitsinRange(18,0,3));
        System.out.println(clearBitsinRange(10,2,4));
    }
}
