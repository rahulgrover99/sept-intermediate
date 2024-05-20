package factorymethod;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService(new MySql());
        userService.createUser();

    }
}
