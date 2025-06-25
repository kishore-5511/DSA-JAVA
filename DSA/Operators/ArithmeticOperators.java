package DSA.Operators;
public class ArithmeticOperators {
    public static void main(String args[]) {

        // Binary Operators

        int a = 5;
        int b = 10;
        System.out.println("Add = " + (a+b));
        System.out.println("Subtract = " + (a-b));
        System.out.println("Multiply = " + (a*b));
        System.out.println("Divide = " + (a/b));
        System.out.println("Modulo(Remainder) = " + (a%b));

        // Unary Operators

        int c = 18;
        int d = ++c;
        System.out.println(c); // 19 is printed.
        System.out.println(d); // 19 is printed

        int e = 10;
        int f = e++;
        System.out.println(e); // 11 is printed.
        System.out.println(f); // 10 is printed

        int x = 10;
        int y = --x;
        System.out.println(x); // 9 is printed.
        System.out.println(y); // 9 is printed.

        int u = 10;
        int v = u--;
        System.out.println(u); // 9 is printed.
        System.out.println(v); // 10 is printed.

    }
}