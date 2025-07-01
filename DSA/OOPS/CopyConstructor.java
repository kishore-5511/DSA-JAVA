package DSA.OOPS;

public class CopyConstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Kishore";
        s1.roll = 18;
        s1.password = "abcd";

        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 90;

        Student s2 = new Student(s1); //Everything is copied here.
        s2.password = "xyz";

        // here the change also refeclted in s2 all though its changed after copying bcoz here array is not copied its just refernced.
        s1.marks[1] = 69;

        System.out.println(s1.password);
        System.out.println(s2.password);

        for(int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Shallow copy Constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // Deep Copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {    
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        System.out.println("Constuctor is called...");
    }
}