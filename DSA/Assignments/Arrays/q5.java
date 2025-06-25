package DSA.Assignments.Arrays;

public class q5 {

    public static void triplet_sum_zero(int num[]) {
        int n = num.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (num[i] + num[j] + num[k] == 0 ) {  //&& (i != j && j != k && i != k)
                        System.out.println("[" + num[i] + ", " + num[j] + ", " + num[k] + "]");
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, -2, -3, 1 };
        triplet_sum_zero(num);
    }

}
