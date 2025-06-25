package DSA.Strings;

public class StringCompression {

    public static String compression(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;  // We are using Integer class here because further we are going to convert this into string.
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "aaaabbbbccccdeeefff";
        System.out.println(compression(str));
    }
}
