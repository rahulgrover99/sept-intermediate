package factorymethod;

public abstract class Database {


    public void connect() {
        System.out.println("Connected to a db.");
    }

    public abstract Query createQuery(String query);

}
