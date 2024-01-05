package perscholas.generics;

public class GenericsMethodRunner {
    public static void main(String[] args) {
        GenericMethodDemo dObj = new GenericMethodDemo();
        dObj.genericsMethod(25); // passing int
        dObj.genericsMethod("Per Scholas"); // passing String
        dObj.genericsMethod(2563.5); // passing float
        dObj.genericsMethod('H'); // passing Char
    }
}
