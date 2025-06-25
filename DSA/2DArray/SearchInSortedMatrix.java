public class SearchInSortedMatrix {

    public static void staircaseSearch(int matrix[][], int key) {  // O(m+n)
        int row = 0;
        int column = matrix[0].length - 1;
        while(row < matrix.length && column >= 0) {
            if(matrix[row][column] == key ) {
                System.out.println("Element is present at ( " + row + ", " + column + " )");
                return;
            } else if(matrix[row][column] > key) {
                column--;
            } else {
                row++;
            }
        }
        System.out.println("Element not found!");
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int key = 33;
        staircaseSearch(matrix, key);
    }
}
