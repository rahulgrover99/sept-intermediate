package builder;

public class Main {

    public static void main(String[] args) {

        StudentBuilder studentBuilder = new StudentBuilder();

        studentBuilder.setName("Rahul");
        studentBuilder.setAge(25);
        studentBuilder.setUniversity("IITP");
        studentBuilder.setPsp(-1);

        Student student = new Student(studentBuilder);

//        student.setName();

        System.out.println(student);

    }
}
