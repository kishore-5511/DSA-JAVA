public class Reverse {

    public static void reverse_array(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;
        
        while (last > first) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse_array(numbers);

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

// Without any use of extra space.
// Time Complexity - O(n)
// Space Complexity - O(1)