package DSA.Recursion;

public class Occurence {

    public static int first(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return first(arr, key, i+1);
    }

    public static int last(int arr[], int key, int i) {
        if(i < 0) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return last(arr, key, i-1);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,6,7,3,5,6,3,5,9,1};
        System.out.println(first(arr, 5, 0));
        int n = arr.length;
        System.out.println(last(arr,5,n-1));
    }
}
