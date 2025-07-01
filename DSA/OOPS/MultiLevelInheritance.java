package DSA.OOPS;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog puppy = new Dog();
        puppy.eat();
        puppy.legs = 4;
        System.out.println(puppy.legs);
    }
}

// Multilevel Inheritance

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
    int legs;
}

class Dog extends Mammal {
    String breed;
}