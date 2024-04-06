package abstractclass;

public abstract class Animal {
    String name;
    static int counter = 0;

    Animal(String name) {
        this.name = name;
        counter++;
    }


    void walk() {
        System.out.println(name + " is walking");
    }

    abstract void makeSound();

}
