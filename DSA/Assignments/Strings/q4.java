// Determine if 2 Strings are anagrams of each other.
package DSA.Assignments.Strings;

public class q4 {

    public static boolean Anagram(String str1, String str2) {
        if(str1.length() == str2.length()) {
            StringBuilder sb1 = new StringBuilder(str1);
            StringBuilder sb2 = new StringBuilder(str2);
            for(int i = 0; i < sb1.length(); i++) {
                int check = -1;
                for(int j = 0; j < sb2.length(); j++) {
                    if(sb1.charAt(i) == sb2.charAt(j)) {
                        sb2.deleteCharAt(j);
                        check = 1;
                        break;
                    }
                }
                if(check < 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        String str1 = "arace";
        String str2 = "acare";
        System.out.println(Anagram(str1, str2));
    }
}
