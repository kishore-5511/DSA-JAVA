public class DiagonalSum {

    public static void sumdiagonal(int matrix[][]) {  // O(n^2)
        int d_sum = 0;  
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i == j) {   //primary diagonal
                    d_sum += matrix[i][j];
                } else if(i+j == matrix.length - 1) {  // secondary diagonal
                    d_sum += matrix[i][j];
                }
            }
        }
        System.out.println("Total Diagonal Sum = " + d_sum);
    }

    public static int sumdiagonal2(int matrix[][]) {  // O(n)
        int d_sum = 0;
        for (int i = 0; i <  matrix.length; i++) {
            int n = matrix.length;
            // primary diagonal
            d_sum += matrix[i][i];

            // Secondary diagonal  => i+j = n-1 => j = n-1-i
            if(i != n-1-i){
                d_sum += matrix[i][n-1-i];
            }
        }
        return d_sum;
    }

    public static void main(String args[]) {
        int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        sumdiagonal(matrix);
        int sum = sumdiagonal2(matrix);
        System.out.println("Total Diagonal sum = " + sum);
    }
}
