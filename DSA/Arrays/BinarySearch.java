// Array must be sorted for this algo to work.
public class BinarySearch {

    public static int binary_search(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(key > numbers[mid]){
                start = mid+1;   //right(2nd half)
            } else {
                end = mid-1;     //left(1st half)
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 18;

        int index = binary_search(numbers, key);
        if(index == -1) {
            System.out.println("Element Not Fund.");
        } else {
            System.out.println("Element Found at Index: " + index);
        }

    }
}

// Time Complexity = O(logn)