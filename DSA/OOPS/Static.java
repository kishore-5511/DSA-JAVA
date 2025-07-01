package DSA.OOPS;

public class Static {
    public static void main(String[] args) {
        // Student s1 = new Student();
        Student.schoolName = "SDM";

        // Student s2 = new Student();
        // System.out.println(s2.schoolName);
        System.out.println(Student.schoolName);

        // Student s3 = new Student();
        Student.schoolName = "PES";

        // System.out.println(s1.schoolName);
    }
}

class Student {
    String name;
    int roll;

    static String schoolName;

    static int percentage(int math, int phy, int chem) {
        return (math+phy+chem)/3;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
