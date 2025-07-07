package DSA.Pattern;

public class InvertedHalfPyramidWithNumbers {

    public static void invertHalfPyramidNumbers(int n) {
        int count = n;
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= count; j++) {  
                //n-i+1 this can also be written in place of count
                System.out.print(j);
            }
            count--;
            System.out.println();
        }
    }
    public static void main(String args[]) {
        invertHalfPyramidNumbers(5);
    }
}

//Output
// 12345
// 1234
// 123
// 12
// 1
