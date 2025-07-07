package DSA.Pattern;

public class Character {
    public static void main(String args[]) {
        int n = 6;
        char ch = 'A';
        for (int line = 1; line <= n; line++ ) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;  // here java automatically promotes char to int bcoz its considered as evaluating an expression
            }
            System.out.println();
        }
    }
}


// Output
// A
// BC
// DEF
// GHIJ
// KLMNO
// PQRSTU