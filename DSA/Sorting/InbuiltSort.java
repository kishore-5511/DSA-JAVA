import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String args[]) {
        Integer arrRev[] = { 5, 4, 3, 1, 2 };
        int arr[] = { 5, 4, 3, 2, 1 };
        Arrays.sort(arr);

        // to Sort in a range of numbers
        Arrays.sort(arr, 0, 3);

        // To sort in descending order
        Arrays.sort(arrRev, Collections.reverseOrder());
        // for working of this int should be changed to Integer bcoz this function only
        // works on objects

        // to sort in a range of index in descending order
        Arrays.sort(arrRev, 0, 3, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrRev.length; i++) {
            System.out.print(arrRev[i] + " ");
        }
    }
}

// Time complexity - O(nlogn)
// For primitive types (int[], double[], etc.): Not Stable
// Java uses Dual-Pivot QuickSort.
// For objects (Integer[], String[], etc.): Stable
// Java uses TimSort, a hybrid algorithm derived from Merge Sort and Insertion
// Sort
