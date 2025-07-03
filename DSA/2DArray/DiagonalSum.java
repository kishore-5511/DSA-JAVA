// For Diagonal Sum to be calculated, Matrix must be Squared Matrix.
public class DiagonalSum {

    public static void sumDiagonal(int matrix[][]) { // O(n^2)
        int d_sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // primary diagonal
                if (i == j) {
                    d_sum += matrix[i][j];
                    // secondary diagonal
                } else if (i + j == matrix.length - 1) {
                    d_sum += matrix[i][j];
                }
            }
        }
        System.out.println("Total Diagonal Sum = " + d_sum);
    }

    public static int sumDiagonal2(int matrix[][]) { // O(n)
        int d_sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int n = matrix.length;
            // primary diagonal
            d_sum += matrix[i][i];

            // Secondary diagonal => i+j = n-1 => j = n-1-i
            // this condition is to skip the center element repeated both in the primary and
            // secondary diagonal when matrix is an odd dimentional matrix
            if (i != n - 1 - i) {
                d_sum += matrix[i][n - 1 - i];
            }
        }
        return d_sum;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        sumDiagonal(matrix);
        int sum = sumDiagonal2(matrix);
        System.out.println("Total Diagonal sum = " + sum);
    }
}
