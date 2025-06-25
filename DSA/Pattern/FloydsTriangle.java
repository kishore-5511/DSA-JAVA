package DSA.Pattern;

public class FloydsTriangle {

    public static void floyds_trianle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        floyds_trianle(5);
    }
}
