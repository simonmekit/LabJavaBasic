package perscholas.generics;

public class GenericMethodDemo {
    public <T> void genericsMethod(T data){
        System.out.println("Generics Method: ");
        System.out.println("Data passed: " + data);
    }
}
