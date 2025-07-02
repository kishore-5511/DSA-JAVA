package DSA.Recursion;

public class BasicPrint {

    public static void printDec(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int sumOfN(int n) {
        if(n == 1) {
            return 1;
        }
        return n + sumOfN(n-1);
    }

    public static void main(String args[]) {
        int n = 10;
        printDec(n);
        printInc(n);
        System.out.println();
        System.out.println(sumOfN(n));
    }
}
