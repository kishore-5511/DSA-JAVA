package DSA.FunctionsandMethods;

import java.util.*;

public class Function {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void calculateSum(int a, int b) { // parameters or formal parameters (Function definition)
        int sum = a + b;
        System.out.println("Sum is : " + sum);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }

    // Binary Coefficient  => ncr = n!/(r!(n-r)!)
    public static int bincoeff(int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nrFact = factorial(n - r);

        int binCoeff = nFact / (rFact * nrFact);
        return binCoeff;
    }

    // Function overloading
    public static int sum(int a, int b) {
        return a + b;
    }

    // Function overloading using number of parameters
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Function overloading using data types
    public static float sum(float a, float b) {
        return a + b;
    }

    public static boolean isprime(int n) {
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }

    // all primes in a range.
    public static void primerange(int n) {
        System.out.println("Primes btwn 2 to n are : ");
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void BinToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("\nDecimal of " + myNum + " = " + decNum);
    }

    public static void DecToBin(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while(decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            decNum = decNum/2;
        }
        System.out.println("Binary of " + myNum + " = " + binNum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        printHelloWorld(); // function call
        calculateSum(a, b); // arguements or actual parameters (function call)
        swap(a, b);
        int prod = multiply(a, b);
        System.out.println("a * b = " + prod);
        int fact = factorial(a);
        System.out.println("Factorial = " + fact);
        int bincoeff = bincoeff(a, b);
        System.out.println("Binomial Coefficient : " + bincoeff);
        System.out.println("Function Overloading");
        System.out.println(sum(3, 5));
        System.out.println(sum(3.2f, 4.8f));
        System.out.println(sum(3, 5, 5));
        boolean prime = isprime(18);
        System.out.println("Entered number is prime : " + prime);
        primerange(100);
        BinToDec(10010);
        DecToBin(18);
        sc.close();
    }
}
