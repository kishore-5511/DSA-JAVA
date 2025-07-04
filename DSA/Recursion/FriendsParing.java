package DSA.Recursion;

public class FriendsParing {

    public static int pairing(int n) {
        // base case
        if(n == 1 || n ==2) {
            return n;
        }

        // single
        int single = pairing(n-1);

        //pair
        int pair = (n-1) * pairing(n-2);
        
        int totalWays = single + pair;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println("Total number of ways: " + pairing(5));
    }
}
