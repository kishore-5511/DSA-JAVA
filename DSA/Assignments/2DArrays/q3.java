// Transpose of a matrix
public class q3 {

    public static void transpose(int matrix[][]) {
        int matrixT[][] = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrixT[j][i] = matrix[i][j];
            }
        }

        System.out.println("Tranpose Matrix : ");
        for(int i = 0; i < matrixT.length; i++) {
            for(int j = 0; j < matrixT[0].length; j++) {
                System.out.print(matrixT[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {11, 12, 13},
            {21, 22, 23}
        };
        transpose(matrix);
    }
}
