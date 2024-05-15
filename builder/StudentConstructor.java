package builder;

public class StudentConstructor {

    private String name;
    private String university;
    private int age;
    private double psp;


    public StudentConstructor(String name) {
        this(name, 12);
    }

    public StudentConstructor(String name, String university) {
        this.name = name;
        this.university = university;
    }

    public StudentConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


// Pros:
//1. validations could be done.

// Cons:
// 1. Not readable, error prone
// 2. 2^n constructors