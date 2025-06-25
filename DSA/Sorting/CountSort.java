public class CountSort {

    public static void counting_sort(int arr[]) {

        // to find the largest number in the array.
        int largest = Integer.MIN_VALUE;
        for (int i =0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {1,2,1,4,1,5,3,1,1,4,7};
        counting_sort(arr);
        for(int i = arr.length - 1; i>=0; i--) {
            System.out.print(arr[i]+ " ");
        }
    }
}
