// Subclass extending Animal
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();  // Output: Animal makes a sound

        Dog dog = new Dog();
        dog.makeSound();  // Output: Bark
    }
}
