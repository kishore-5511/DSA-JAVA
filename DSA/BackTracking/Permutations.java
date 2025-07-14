package DSA.BackTracking;

public class Permutations {

    public static void findPermutation(String str, String ans) {
        // Base Case
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }

        //Recursion - O(n*n!)
        for(int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            //Removing selected char from og string
            String Newstr = str.substring(0, i) + str.substring(i+1);
            findPermutation(Newstr, ans+curr);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        findPermutation(str, "");
    }
}

// for n character there are n! permutations.
