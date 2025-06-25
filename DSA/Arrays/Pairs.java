public class Pairs {

    public static void pairs_array(int num[]) {
        int tp = 0;
        for(int i = 0; i < num.length; i++) {
            int curr = num[i];
            for(int j = i + 1; j < num.length; j++) {
                System.out.print("(" + curr + ", " + num[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + tp);
    }

    public static void main(String args[]) {
        int num[] = {1, 2, 3, 4, 5};
        pairs_array(num);
    }
}

// Total pairs is a arithmetic progession from 1 to n-1 
// formula = n(n-1)/2
// Time Complexity - O(n^2)
