package inheritance;

public class Learner extends User{

    double psp;
    String batch;
    String name;

//    Learner(String name, String email) {
//        super(name, email);
//        psp = 1.1;
//        batch = "intermediate";
//        System.out.println("Constructor for instructor called.");
//    }


    void solveProblem() {
        System.out.println(super.name + " solved a problem");
        this.login();;
        login();
        super.login();
    }

}
