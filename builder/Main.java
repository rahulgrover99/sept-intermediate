package builder;

public class Main {

    public static void main(String[] args) {
//        StudentBuilder studentBuilder = new StudentBuilder();
        StudentBuilder studentBuilder = Student.getBuilder();

        studentBuilder.setName("Rahul");
        studentBuilder.setAge(25);
        studentBuilder.setUniversity("IITP");
        studentBuilder.setPsp(100);

//        Student student = new Student(studentBuilder);
        Student student = studentBuilder.build();

        studentBuilder.setPsp(90);

//        student.setName();

        System.out.println(student);

        Student st = Student.getBuilder()
                .setName("bleh")
                .setUniversity("sjaiass")
                .setPsp(70.0)
                .setAge(30)
                .build();

    }

}
