package pl.javapoz25.animals;

public class Cat implements Animal {

    private String sound;

    public Cat() {
        this.sound = "Meow";
    }

    public String makeSound() {
        return this.sound;
    }
}
