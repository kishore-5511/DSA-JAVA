public class BubbleSort { 
    
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    swap++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (swap == 0) {
                break;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 2, 1, 3};
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Time Complexity - O(n^2)
// Best Case - O(n)