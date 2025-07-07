package DSA.Assignments.Recursion;

public class q2 {

    public static void convert(String n, String num[], int i) {
        if(i == n.length()) {
            return;
        }
        // this will convert char to int
        int digit = n.charAt(i) - '0'; 
        System.out.print(num[digit] + " ");
        convert(n, num, i+1);
    }

    public static void main(String args[]) {
        String num[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        convert("2005", num, 0);
    }
}
