public class SubArraysMaxPrefix {

    public static void prefix_array(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // calculate prefix array
        // prefix array is sum of elements from index 0 to i(0 to n)
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                currSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];
                // If start == 0:
                // The subarray is from beginning to end, so:
                // 👉 sum = prefix[end]

                // If start > 0:
                // Subarray is from start to end, so we subtract the sum before start:
                // 👉 sum = prefix[end] - prefix[start - 1]

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum of subarray: " + maxSum);
    }

    public static void main(String args[]) {
        int arr[] = { 1, -2, 6, -1, 3 };
        prefix_array(arr);
    }
}

// Time Complexity - O(n^2)
