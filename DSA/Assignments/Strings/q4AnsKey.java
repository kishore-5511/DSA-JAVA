package DSA.Assignments.Strings;

import java.util.Arrays;

public class q4AnsKey {

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isAnagram("race", "care"));      // true
        System.out.println(isAnagram("aabb", "abab"));      // true
        System.out.println(isAnagram("hello", "olelh"));    // true
        System.out.println(isAnagram("abc", "abcc"));       // false
        System.out.println(isAnagram("listen", "silent"));  // true
        System.out.println(isAnagram("rat", "car"));        // false
    }
}
