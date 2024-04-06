package abstractclass;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Billa");

        System.out.println(Animal.counter);
        Animal dog = new Dog("Pogo");
        System.out.println(cat.counter);


        List<Animal> animals = List.of(cat, dog);

        for (Animal animal: animals) {
            System.out.println(animal.name);
            animal.makeSound();
            animal.walk();
        }
    }
}
