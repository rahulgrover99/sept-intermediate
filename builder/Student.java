package builder;

public class Student {

    private String name;
    private String university;
    private int age;
    private double psp;

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }


    public Student(StudentBuilder sb) {

        this.name = sb.getName();
        this.university = sb.getUniversity();;
        this.psp = sb.getPsp();
        this.age = sb.getAge();

        if (psp < 0) throw new IllegalArgumentException("Bad");
    }
}
