package builder;

public class StudentBuilder {
    private String name;
    private String university;
    private int age;
    private double psp;


    /// Default Constructor
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setUniversity(String university) {
        this.university = university;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setPsp(double psp) {
        this.psp = psp;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    public Student build() {
        return new Student(this);
    }
}
