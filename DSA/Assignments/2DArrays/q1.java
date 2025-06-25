// Print the number of 7’s that are inthe 2d array.
public class q1 {

    public static void count7(int matrix[][]) {
        int count = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("Total number of 7's in Matrix is: " + count);
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {1,7,3},
            {1,8,7},
            {0,0,7}
        };
        count7(matrix);
    }
}
