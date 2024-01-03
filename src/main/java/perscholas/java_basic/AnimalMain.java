package perscholas.java_basic;

public class AnimalMain {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        // it’s fine because a Pig is a animal by inheritance
        Animal myPig = new Pig();  // Create a Pig object
        // it’s fine because a Dog is a animal by inheritance

        Animal myDog = new Dog();  // Create a Dog object
        Animal animal = new Animal();
        animal = myDog;
        animal.animalSound();
        animal = myPig;
        animal.animalSound();

//        myAnimal.animalSound();
//        myPig.animalSound();
//        myDog.animalSound();
    }
}
