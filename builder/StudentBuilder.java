package builder;

public class StudentBuilder {
    private String name;
    private String university;
    private int age;
    private double psp;


    /// Default Constructor
    public void setName(String name) {
        this.name = name;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
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
}
