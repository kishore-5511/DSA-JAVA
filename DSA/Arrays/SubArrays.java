// Brute force
public class SubArrays {

    public static void print_subarrays(int num[]) {
        int totalSubArrays = 0;
        int s = 0; // index for sumSubArray.
        int n = num.length;
        int sumSubArray[] = new int[n*(n+1)/2];  
        // n*(n+1)/2 is formula to calculate the total number of subarrays in a given array.
        for(int i = 0; i < num.length; i++) {
            int start = i;
            for(int j = i; j <num.length; j++) {
                int end = j;
                int subSum = 0;
                for(int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");
                    subSum = subSum + num[k];
                }
                sumSubArray[s] = subSum;
                s++;
                totalSubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: " + totalSubArrays);
        System.out.println("Sum of Subarrays: ");
        for(int i = 0; i < sumSubArray.length; i++) {
            System.out.print(sumSubArray[i] + " ");
        }
        int max = sumSubArray[0];
        for(int i = 1; i < sumSubArray.length; i++) {
            if(sumSubArray[i] > max) {
                max =sumSubArray[i];
            }
        }
        System.out.println("\nMax of subarrays: " + max);
    }

    public static void main(String args[]) {
        int num[] = {1, 2, 3, 4, 5};
        print_subarrays(num);
    }
}

// Total subarrays is sum of n terms 
// formula - n(n+1)/2

// time complexity - O(n^3)
