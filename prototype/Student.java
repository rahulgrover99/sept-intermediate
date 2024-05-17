package prototype;

import lombok.Setter;

@Setter
public class Student implements Cloneable{

    private int age;
    private String name;
    private String batch;
    private double averageBatchPsp;
    private double studentPsp;

    public Student() {}

    Student(Student other) {
        this.age = other.age;
        this.averageBatchPsp = other.averageBatchPsp;
        this.studentPsp = other.studentPsp;
        this.batch = other.batch;
        this.name = other.name;
    }

    @Override
    protected Student clone() {
        return new Student(this);
    }

}
