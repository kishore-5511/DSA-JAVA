public class SpiralMatrix {

    public static void printSpiral(int matrix[][]) { // Time Complexity - O(m*n)
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = matrix.length - 1;
        int EndCol = matrix[0].length - 1;

        while (StartCol <= EndCol && StartRow <= EndRow) {

            // Top
            for (int j = StartCol; j <= EndCol; j++) {
                System.out.print(matrix[StartRow][j] + " ");
            }

            // Right
            for (int i = StartRow + 1; i <= EndRow; i++) {
                System.out.print(matrix[i][EndCol] + " ");
            }

            // Bottom
            if (StartRow < EndRow) {
                // If StartRow == EndRow, that means the top and bottom are the same row, so
                // we've already printed it in the Top loop.
                for (int j = EndCol - 1; j >= StartCol; j--) {
                    System.out.print(matrix[EndRow][j] + " ");
                }
            }

            // Left
            if (StartCol < EndCol) {
                // If StartCol == EndCol, that means the left and right are the same column, so
                // we've already printed it in the Right loop.
                for (int i = EndRow - 1; i >= StartRow + 1; i--) {
                    System.out.print(matrix[i][StartCol] + " ");
                }
            }

            StartCol++;
            StartRow++;
            EndCol--;
            EndRow--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printSpiral(matrix);
    }
}
