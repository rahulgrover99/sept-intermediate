package factorymethod;

public class MongoDB extends Database{
    @Override
    public Query createQuery(String query) {
        return new NoSQL(query);
    }
}
