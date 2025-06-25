import java.util.*;
public class BasicInputs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);   
        // This is kind of prerequsities for taking a input it is called as scanner object and the import part also.

        String input = sc.next();  // Here it gets terminated after encountering a space or null character.
        System.out.println(input);
        sc.nextLine();
        
        int number = sc.nextInt();    // for integers
        System.out.println(number);
        sc.nextLine();
        // When you use sc.nextInt() (or sc.next()), they don’t consume the newline character (\n) after pressing Enter.So when you call sc.nextLine() immediately after sc.nextInt(), it reads the remaining newline in the input buffer — not the full sentence you expect.
        
        String name = sc.nextLine();   // Using nextLine we can store a complete string or sentence.
        System.out.println(name);

        float price = sc.nextFloat(); // for taking floating values as input.
        System.out.println(price);

        sc.close();

     }
}
