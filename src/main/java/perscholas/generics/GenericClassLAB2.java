package perscholas.generics;

public class GenericClassLAB2 <T extends Number>{
    public void display() {
        System.out.println("This is a bounded type generics class.");
    }
    public static void main(String[] args) {
        // create an object of GenericsClass
        GenericClassLAB2<Number> obj = new GenericClassLAB2<>();
        obj.display();
    }
}
