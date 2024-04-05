package x;


public class Student {

    private String name;
    public int id;
    protected double psp;
    String batch; // package private


    public Student(String name) {
        System.out.println(this);
        this.name = name;
    }

    public Student() {
        System.out.println("No args constructor called");
    }

    Student(Student other) {
        this.id = other.id;
        this.name = other.name;
        this.batch = other.batch;
        this.psp = other.psp;

    }


    // package private
    void changeBatch() {
        System.out.println("Request received for changing of batch for "  + name);
        name = "fun";
        id = 1;
        psp = 1.1;
    }

    int getPsp() {
        return (int)psp;
    }

}
