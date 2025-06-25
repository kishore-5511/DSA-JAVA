package DSA.Loops;
public class ForLoop {
    public static void main(String args[]) {
        // Baiscs
        for (int i = 1; i < 10; i++) {
            System.out.println("Hello Java!");
        }

        // print Square pattern
        for (int line = 1; line <= 4; line++) {
            System.out.println("****");
        }

        // Break Statement
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop.");

        // continue Statement
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
