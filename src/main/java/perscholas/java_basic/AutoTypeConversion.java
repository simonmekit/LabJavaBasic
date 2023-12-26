package perscholas.java_basic;

public class AutoTypeConversion {
    public static void main(String[] args) {
        int x = 20;
        double y = 40.5;
        long p = 30;
        float q = 10.60f;
        // int z = x + y; (1) // Error; cannot convert from double to int.
        double z = x + y;
                System.out.println("Sum of two numbers: " + z);
        double w = y + q;
        System.out.println("Sum of double and float: " + w);

        //float l = q + y; // cannot convert double to float
        //float i = x + y; // cannot convert double to float

        long k = x + p;
        System.out.println("Sum of long and int: " + k);

        // long r = p - q; // (2) // Error; cannot convert from float to long.
        float r = p - q;
        System.out.println("Subtraction of two numbers: " + r);

        char a = 'a';
        System.out.println("Character a: " + a);
        a = 650;
        System.out.println("Character a: " + a);

        byte bt = 10;
        System.out.println("Byte content - integer literal: " + bt);
        //bt = "bt"; //error: required by found string
        //bt = 'bt'; //error: too many character in Character literal
        bt = 'b';
        System.out.println("Byte content - character: " + bt);

        int n = 2 * bt;
        System.out.println("Byte autoconvertion to int: " + n);

        //short m = 3 * bt; //error cannot convert int to short
        short m = bt;
        System.out.println("Byte autoconversion to short: " + m);

    }
}
