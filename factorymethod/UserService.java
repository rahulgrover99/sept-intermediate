package factorymethod;

public class UserService {


    Database db;

    public UserService(Database db) {
        this.db = db;
    }


    public void createUser() {
        Query q  = db.createQuery("INSERT into USERS VALUES (1, 1, 1)");
        q.execute();
    }
}
