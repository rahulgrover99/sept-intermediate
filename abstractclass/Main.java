package abstractclass;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Billa");

        Animal dog = new Dog("Pogo");


        List<Animal> animals = List.of(cat, dog);

        for (Animal animal: animals) {
            animal.makeSound();
            animal.walk();
        }
    }
}
