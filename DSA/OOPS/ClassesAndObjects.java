package DSA.OOPS;

public class ClassesAndObjects {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // Created a Pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        // System.out.println(p1.tip);
        System.out.println(p1.getTip()); // this is used when it is private.
        p1.color = "Yellow";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Kishore Gowda";
        // myAcc.password = "abcdrfghijk";
        // here we cant set it directly because its of private class
        myAcc.setPassword("abcdefghijk");
        System.out.println(myAcc.getPassword());
    }
}

// Acsess Modifiers/Specifier
class BankAccount {
    public String username;
    private String password;

    // Setters
    void setPassword(String pass) {
        password = pass;
    }

    // Gettters
    String getPassword() {
        return this.password;
    }
}

class Pen {
    String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float gpa;

    void calculatePercentage(int sub1, int sub2, int sub3) {
        gpa = (sub1 + sub2 + sub3) / 3;
    }
}