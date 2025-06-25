public class KadanesAlgo {

    public static void kadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if(currSum < 0) {
                currSum = 0;
            }
            // If at any point, the current subarray sum becomes negative, we reset it to 0.
            // Why? Because a negative sum will reduce the value of any future subarray that includes it.
            // So it’s better to start fresh from the next index.
            maxSum = Math.max(maxSum, currSum);
        }
        // this piece of code is to select the minimum number from the array when all the elements of the array are negative.
        if (maxSum == 0) {
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Max sum of subarray is: " + max);
        } else {            
            System.out.println("Max subarray sum is: " + maxSum);
        }
    }

    public static void main(String args[]) {
        int arr[] = {-2, -3, -10, -1, -2, -1, -5, -3};
        kadanes(arr);
    }
}

// Time Complexity - O(n)
