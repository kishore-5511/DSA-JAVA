package DSA.Recursion;

public class RemoveDuplicates {

    public static void duplicate(String str, int i, StringBuilder newStr, boolean map[]) {
        if(i == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(i);
        if(map[currChar - 'a'] == true) {
            duplicate(str, i+1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            duplicate(str, i+1, newStr, map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnaacollege";
        duplicate(str, 0, new StringBuilder(), new boolean[26]);
    }
}
