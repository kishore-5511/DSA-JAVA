// Convert uppercase characters to lowercase using bits

package DSA.Assignments.BitManipulation;

public class q4 {
    public static void main(String args[]) {
        for ( char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char)(ch | ' '));
        }
    }
}

// logic
// A' = ASCII 65 = 0100 0001

// 'a' = ASCII 97 = 0110 0001

// What’s ' ' (space) in ASCII?
// ' ' (space) has ASCII value 32.

// Binary: 0010 0000
