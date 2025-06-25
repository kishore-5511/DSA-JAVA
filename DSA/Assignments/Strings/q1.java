// Count how many times lower case vowels occurred in a String entered by the user.

package DSA.Assignments.Strings;
import java.util.*;

public class q1 {

    public static int VowelsCount(String vowel) {
        int count = 0;
        for (int i = 0; i < vowel.length(); i++) {
            if(vowel.charAt(i) == 'a' || vowel.charAt(i) == 'e' || vowel.charAt(i) == 'i' || vowel.charAt(i) == 'o' || vowel.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence or word.");
        String vowel = sc.nextLine();
        System.out.println("Number of vowels: " + VowelsCount(vowel));
        sc.close();
    }
}
