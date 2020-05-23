package pl.javapoz25.animals;

public class Cow implements Animal {

    private String sound;

    public Cow() {
        this.sound = "Mooo";
    }

    public String makeSound() {
        return this.sound;
    }
}

