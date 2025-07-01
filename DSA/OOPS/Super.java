package DSA.OOPS;

public class Super {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("Animal Constructor is Called.");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "Brown";
        // super();
        System.out.println("Horse Constructor is Called.");
    }
}
