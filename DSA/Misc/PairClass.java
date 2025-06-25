package DSA.Misc;

// Definition
// A Pair is a simple container to store two related objects together, typically called key and value or first and second. Java does not have a built-in Pair class in java.util, but you can use javafx.util.Pair or create your own.

// import javafx.util.Pair;
// This import comes from JavaFX, which is not included by default in JDK 11 and later versions. So the error is likely:
// If you really want to use javafx.util.Pair, you must add JavaFX libraries manually.


// Custom Class
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}

public class PairClass {

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "Apple");

        System.out.println("Key: " + pair.getKey());     // Output: Key: 1
        System.out.println("Value: " + pair.getValue()); // Output: Value: Apple
    }
}


