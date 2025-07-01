package DSA.OOPS;

public class HierarchialInheritance {
    public static void main(String args[]) {
        
    }
}

class Animal {
    int color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("Breaths");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Fly");
    }
}
