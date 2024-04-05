package x;

public class SamePackage {


    public static void main(String[] args) {

        Student student = new Student("Rahul");
        Student other = new Student();
        student.changeBatch();
        student.batch = "intermediate";
        student.id = 1;
        student.psp = 1.1;

        System.out.println(student);


        Student copy = new Student(student);
        System.out.println("Address of the copy:: " + copy);

        Student copy2 = new Student("Rahul");

//        student.name = "rahul";

    }
}
