package DSA.Recursion;

public class Power {

    public static int pow(int x, int n) {  // O(n)
        if(n == 0) {
            return 1;
        }
        return x * pow(x,n-1);
    }

    public static int powOptimized(int x, int n) {  // O(logn)
        if(n == 0) {
            return 1;
        }
        int halfPow = powOptimized(x, n/2);
        int halfPowSq = halfPow*halfPow;

        // n is odd
        if(n%2 != 0) {
            halfPowSq = x*halfPowSq;
        }
        return halfPowSq;
    }

    public static void main(String[] args) {
        System.out.println(pow(10, 3));
        System.out.println(powOptimized(2, 8));
    }
}
