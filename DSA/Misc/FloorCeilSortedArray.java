package DSA.Misc;

public class FloorCeilSortedArray {

    public static void FloorCeil(int num[], int x) {
        int start = 0;
        int end = num.length - 1;
        int floor = -1;  // If no floor exists
        int ceil = -1;   // If no ceil exists

        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == x) {
                floor = num[mid];
                ceil = num[mid];
                break; // found exact match
            } else if (x > num[mid]) {
                floor = num[mid];  // possible floor
                start = mid + 1;
            } else {
                ceil = num[mid];   // possible ceil
                end = mid - 1;
            }
        }

        System.out.println("Floor: " + (floor == -1 ? "Doesn't exist" : floor));
        System.out.println("Ceil: " + (ceil == -1 ? "Doesn't exist" : ceil));
    }

    public static void main(String args[]) {
        int num[] = {3, 4, 4, 7, 8, 10};
        int x = 5;
        FloorCeil(num, x);
    }
}
