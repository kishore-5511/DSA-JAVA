package DSA.Strings;

public class Compare {
    public static void main(String args[]) {
        String s1 = "virat";
        String s2 = "virat"; // here s2 is pointing to the previously created virat it doesnot create again.
        String s3 = new String("virat");

        // The whole process is called as interning.
        if(s1 == s2) {
            System.out.println("Strings are Equal."); 
        } else {
            System.out.println("Strings are not equal.");  
        }

        if(s1 == s3) {  
            System.out.println("Strings are Equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        if(s1.equals(s3)) {
            System.out.println("Strings are Equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }
}
