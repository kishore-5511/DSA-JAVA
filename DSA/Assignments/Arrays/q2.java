// Search in a rotated sorted array
// when its sorted array best way to find a element is binary search.
package DSA.Assignments.Arrays;

public class q2 {

    public static int rotated_sorted_array(int arr[], int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[start] <= arr[mid]) { // conditions check which part of the array is sorted
                if (arr[start] <= target && arr[mid] >= target) {  // left sorted
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            } else { // right sorted
                if (arr[mid] <= target && arr[end] >= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 4;
        System.out.println("Found at index: " + rotated_sorted_array(arr, target));
    }
}
