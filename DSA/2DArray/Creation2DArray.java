import java.util.*;

public class Creation2DArray {

    public static void search(int matrix[][], int key) { // O(m*n)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element " + key + " is found in the Matrix.");
                    return;
                }
            }
        }
        System.out.println("Element " + key + " is not found in the Matirx.");
    }

    public static void max(int matrix[][]) { // O(m*n)
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = Math.max(max, matrix[i][j]);
            }
        }
        System.out.println("Max Element: " + max);
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int m = matrix.length; // gives the number of rows in the 2D array matrix (horizontal)
        int n = matrix[0].length; // gives the number of columns in the first row (Vertical)(assuming all rows
                                  // have the same length).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < m; i++) { // Creation - O(m*n)
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) { // Print - O(m*n)
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        search(matrix, key);
        max(matrix);
        sc.close();
    }
}
