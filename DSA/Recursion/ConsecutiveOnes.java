package DSA.Recursion;

public class ConsecutiveOnes {

    public static void binString(int n, int prev, String str) {
        // Base Case
        if(n == 0) {
            System.out.println(str);
            return;
        }

        binString(n-1, 0, str+"0");
        if(prev == 0) {
            binString(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        binString(5, 0, "");
    }
}
