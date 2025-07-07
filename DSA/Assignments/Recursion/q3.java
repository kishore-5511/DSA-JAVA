package DSA.Assignments.Recursion;

public class q3 {

    public static int length(String str, int len, int i) {
        if(i != str.length()) {
            return length(str, len+1, i+1);
        }
        return len;
    }

    public static void main(String args[]) {
        System.out.println(length("Kishore Gowda", 0, 0));
    }
}
