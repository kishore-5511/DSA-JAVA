package DSA.OOPS;

public class AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // Animal a = new Animal();
        // Object of a abstract class cannot be created.

        Mustang myhorse = new Mustang();
        //Animal -> Horse -> Mustang
        System.out.println(myhorse);
    }
}

abstract class Animal {
    String color;
    Animal() {  // Constructor
        color = "Brown";
        System.out.println("Animal Constructor Called.");
    }

    // Non Abstract Function
    void eat() {
        System.out.println("Animals Eat.");
    }

    // Abstract Function
    abstract void walk();    
    // it cannot be defined here and it must be defined in subclasses.
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor Called.");
    }
    void changeColor() {
        color = "white";
    }
    void walk() {
        System.out.println("Horse walks on 4 legs.");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor Called.");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "White";
    }
    void walk() {
        System.out.println("Chicken walks on 2 legs.");
    }
}
