// Data Types in Java
public class DataTypes {
    public static void main(String args[]) {
        byte b = 127;  // can store only 256 numbers from -128 to 127.
        System.out.println(b);
        char ch = 'b';
        System.out.println(ch);
        boolean var = false;
        System.out.println(var);
        // float price = 10.5;  
        //it throws an error bcoz java considers 10.5 as double and double cant be converted to float automatically.
        // alternative solutions
        // float price = 10.5f;
        // float price = float(10.5);
        double price = 10.5;
        System.out.println(price);
        int number = 15;
        System.out.println(number);
        //long is longer form of int 
        // short is the shorter form of int
        // double is longer form of float
    }
}
