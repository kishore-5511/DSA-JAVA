package DSA.Strings;

import java.util.*;

public class Basics {

    public static void charat(String ironman) {
        for(int i = 0; i < ironman.length(); i++) {
            System.out.print(ironman.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz@#1234");
        System.out.println(arr);
        System.out.println(str);
        System.out.println(str2);

        // Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine(); 
        System.out.println(name);

        String fullName = "Kishore Gowda";
        System.out.println(fullName.length());

        //concatenation
        String firstname = "Tony";
        String lastname = "Stark";
        String ironman = firstname + " " + lastname;
        System.out.println(ironman);

        charat(ironman);

        sc.close();
    }
}


