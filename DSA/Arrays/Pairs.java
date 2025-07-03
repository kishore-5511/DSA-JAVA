public class Pairs {

    public static void pairsArray(int num[]) {
        int totalPairs = 0;
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + curr + ", " + num[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + totalPairs);
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5 };
        pairsArray(num);
    }
}

// Total pairs is a arithmetic progession from 1 to n-1
// formula = n(n-1)/2
// Time Complexity - O(n^2)
