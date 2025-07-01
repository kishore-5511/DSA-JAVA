package DSA.OOPS;

public class Constructors {
    public static void main(String[] args) {
        // Automatic selection of constructors based on parameters is called constructor overloading which is an example of polymorphism. 
        Student s1 = new Student();
        System.out.println(s1);
        Student s2 = new Student("Kishore");
        System.out.println(s2.name);
        Student s3 = new Student(18);
        System.out.println(s3.roll);
    }
}

class Student {
    String name;
    int roll;

    // java creates constructor automatically while object creation if its not created but there will be parameters passed

    //Non-Parameterized
    Student() {
        System.out.println("Constructor is called...");
    }

    // Parameterized
    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}