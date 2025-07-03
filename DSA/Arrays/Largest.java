// import java.util.*;
public class Largest {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -INFINITY
        int smallest = Integer.MAX_VALUE; // +INFINITY

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Samllest value is: " + smallest);
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 5, 7, 9, 3, 2 };

        System.out.println("Largest value is: " + getLargest(numbers));
    }
}
