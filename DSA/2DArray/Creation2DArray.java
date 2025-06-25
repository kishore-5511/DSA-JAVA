import java.util.*;
public class Creation2DArray {

    public static void search(int matrix[][], int key) {
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Element found! ");
                    return;
                }
            } 
        }
        System.out.println("Element not found");       
    }
    
    public static void max(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                    max = Math.max(max, matrix[i][j]);
                }
            } 
            System.out.println("Max Element: " + max);
        }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;  //gives the number of rows in the 2D array matrix
        int m = matrix[0].length;  // gives the number of columns in the first row (assuming all rows have the same length).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }        
        }
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
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
