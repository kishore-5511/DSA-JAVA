// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
package DSA.Assignments.Arrays;

import java.util.*;

public class q1 {

    // Bubble sort
    public static void sorting(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void frequency(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                System.out.println("number " + nums[i] + " is repeated more than once.");
                return;
            }
        }
        System.out.println("All the elements of the array are unique.");
    }

    public static boolean containsDuplicate(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemnts in the array.");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Any number is repeated more than once: " + containsDuplicate(nums));
        // sorting(nums);
        // frequency(nums);
        sc.close();
    }
}

// Time Complexity- O(n^2)
// one more technic HashSets can be used
