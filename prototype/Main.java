package prototype;

import polymorphism.A;

public class Main {
    public static void main(String[] args) {


        Student student = new AdvancedStudent("Google");
        student.setName("abc");
        student.setStudentPsp(10);
        student.setAverageBatchPsp(50);
        student.setBatch("intermediate");
        student.setAge(30);


        Student copy = student.clone();

        copy.setName("xyz");
        copy.setAge(26);

//        Student copy2 = new Student(copy);

        System.out.println(copy);

        copy = new Student(student);


    }

}
