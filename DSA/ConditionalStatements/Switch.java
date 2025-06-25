package DSA.ConditionalStatements;
import java.util.*;
public class Switch {
    public static void main(String args[]) {
        int number = 2;
        switch(number) {
            case 1 : System.out.println("Money");
                     break;
            case 2 : System.out.println("Money");
                     break;
            case 3 : System.out.println("Money");
                     break;
            default : System.out.println("Is Everything!");
        }

        // Calculator 
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);  
        // charAt(0) this considers only the first character entered by the user all other character enterd after that is ignored.

        switch(operator) {
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                        break;
            case '*' : System.out.println(a*b);
                        break;
            case '/' : System.out.println(a/b);
                        break;
            case '%' : System.out.println(a%b);
                        break;
            default : System.out.println("Inavlid Operator.");
        }

        sc.close();

    }
}
