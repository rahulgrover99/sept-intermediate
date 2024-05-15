package builder;

import java.util.HashMap;

public class StudentHM {

    private String name;
    private String university;
    private int age;
    private double psp;

    StudentHM(HashMap<String, Object> parameters) {
        this.name = (String)parameters.get("name");
        this.age = (Integer) parameters.get("age");
        this.university = (String) parameters.get("university");
        if (parameters.containsKey("psp")) {
            this.psp = (Double) parameters.get("psp");
        }


        // Validations here
    }

    public static void main(String[] args) {


        HashMap<String, Object> hm= new HashMap<>();
        hm.put("name", "rahul");
        hm.put("age", 12);
        hm.put("university", "iit");


        StudentHM studentHM = new StudentHM(hm);

        System.out.println(studentHM);
    }
}
