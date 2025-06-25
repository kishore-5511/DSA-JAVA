public class LinearSearch {

    public static int linear_search(int numbers[], int key) {
        for(int i = 0; i < numbers.length; i++) {
            if(key == numbers[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int key = 18;

        int found = linear_search(numbers, key);
        if(found == -1) {
            System.out.println("Element Not Found.");
        } else {
            System.out.println("Element found at index: " + found);
        }
    }
}

// Time Complexity - O(n)
