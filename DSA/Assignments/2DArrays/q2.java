// Print out the sum of the numbers in the second row of the “nums” array
public class q2 {

    public static void secondsum(int matrix[][]) {
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[1][j];
        }
        System.out.println("Sum of Second row is : " + sum);
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        secondsum(matrix);
    }
}
