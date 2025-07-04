package DSA.Recursion;

public class TillingProblem {

    public static int tillingProblem(int n) {
        // Base Case
        if(n == 0 || n == 1) {
            return 1;
        }

        //Vertical Choice
        int vertical = tillingProblem(n-1);

        //Horizontal Choice 
        int horizontal = tillingProblem(n-2);

        int totalWays = vertical + horizontal;

        return totalWays;
    }

    public static void main(String args[]) {
        System.out.println("Total number of ways: " + tillingProblem(5));
    }
}
