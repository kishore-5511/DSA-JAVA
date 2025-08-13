package DSA.Pattern;
public class HollowRectangle {
    public static void hollowRectangle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // boundary cell condition
                if(i == 1 || j == 1 || i == rows || j == cols) {    
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        hollowRectangle(8, 5);
    }
}

//Output
// *****
// *   *
// *   *
// *   *
// *   *
// *   *
// *   *
// *****
