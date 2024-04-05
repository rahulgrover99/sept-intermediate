package abstractclass;

public abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }


    void walk() {
        System.out.println(name + " is walking");
    }

    abstract void makeSound();

}
