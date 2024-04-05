package inheritance;

public class User {
    String email;
    String password;

    String name;


    User(String name, String email) {
        this.name = name;
        this.email = email;
        System.out.println("Constructor for User called.");
    }

    User() {}

    void login() {
        System.out.println("Logging in the user.");
    }


}
