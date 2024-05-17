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

        Student stu = new Student();
        stu.setName("abc");
        stu.setStudentPsp(10);
        stu.setAverageBatchPsp(50);
        stu.setBatch("intermediate");
        stu.setAge(30);



        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.register("adv", student);
        studentRegistry.register("general", stu);

        fillRegistry(studentRegistry);




        Student copy = studentRegistry.get("adv").clone();
        Student copy2 = studentRegistry.get("sid").clone();
        Student copy3 = studentRegistry.get("isid").clone();

        copy.setName("xyz");
        copy.setAge(26);

//        Student copy2 = new Student(copy);

        System.out.println(copy);

        copy = new Student(student);


    }


    private static void fillRegistry(StudentRegistry studentRegistry) {
        Student siddharth = studentRegistry.get("general").clone();
        siddharth.setName("Siddharth");
        siddharth.setAge(24);
        siddharth.setStudentPsp(91.0);

        Student intelligentSiddharth = studentRegistry.get("general").clone();
        intelligentSiddharth.setName("Siddharth");
        intelligentSiddharth.setAge(24);
        intelligentSiddharth.setStudentPsp(91.0);


        studentRegistry.register("sid", siddharth);
        studentRegistry.register("isid", intelligentSiddharth);


    }

}
