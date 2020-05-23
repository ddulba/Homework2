package pl.javapoz25.animals;

public class Dog implements Animal {

    private String sound;

    public Dog() {
        this.sound = "Woof";
    }

    public String makeSound() {
        return this.sound;
    }
}

