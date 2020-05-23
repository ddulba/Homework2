package pl.javapoz25.animals;

public class MainAnimals {

    public static void main (String[] args) {

        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();

        Animal[] animals = {cat, cow, dog};

        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
    }
}
