package perscholas.java_basic;

public class RoundingMethodDemo {
    public static void main(String[] args) {
        double d = 83.67;
        System.out.println(Math.ceil(d));  // return double & rounded up to its nearest integer
        System.out.println(Math.floor(d)); // return double and rounded down to its nearest integer
        System.out.println(Math.rint(d)); // return double but find the closest integers for these double numbers
        //Math.round() It is used to round of the decimal numbers to the nearest value.
        System.out.println(Math.round(d));  // 84;
        double a = 1.878;
        System.out.println(Math.round(a));  // 2
        // value equals to 5 after decimal
        double b = 1.5;
        System.out.println(Math.round(b));  // 2
        // value less than 5 after decimal
        double c = 1.34;
        System.out.println(Math.round(c));  // 1
    }
}
