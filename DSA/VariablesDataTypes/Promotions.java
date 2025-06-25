// Type Promotions in Expressions
public class Promotions {
    public static void main(String args[]) {

        // 1. Java Automatically promotes each byte, short, or char operand to int when evaluating an expressionn.
        // 2. If one operand in long, float or double the whole exoression is promoted to long, float, or double respectively.

        char a = 'a';
        char b = 'b';
        // char c = a - b;  //error bcoz here a and b are converted to int and it is tried to store in char.

        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(a);
        System.out.println(b-a);

        short l = 5;
        byte m = 32;
        char n = 'n';
        int i = l + m + n;   // here n is converted to int.
        System.out.println((int)n);
        System.out.println(i);

        int x = 10;
        float y = 20.25f;
        long z = 25;
        double w = 99;
        double ans = w + x + y + z;  // here x,z,w are converted to highest type that is float.
        System.out.println(ans);

    }
}
