package DSA.Assignments.DivideAndConquer;

public class q2 {

    public static void majority(int arr[]) {
        int major = arr[0];
        int count = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == major) {
                count++;
            } else {
                count--;
                if(count < 0) {
                    major = arr[i];
                    count = 1;
                }
            }
        }
        if(count > 0) {
            System.out.println("Majority Element is: " + major);
        } else if(count == 0) {
            System.out.println("Equal number of elments from both side.");
        }
    }

    public static void main(String args[]) {
        int arr[] = {2,2,1,1,1,2,2};
        majority(arr);
    }
}
