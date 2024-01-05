package perscholas.generics;

public class GenericsClass<T>{
    //variable type
    private T data;
    public GenericsClass(T data){
        this.data = data;
    }
    //method that returns T type variable
    public T getData(){
        return this.data;
    }
}
