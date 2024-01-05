package perscholas.generics;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        //adding elem
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        //Adding elements at particular index
        animals.add(2, "Elephant");
        System.out.println(animals);
    }
}
