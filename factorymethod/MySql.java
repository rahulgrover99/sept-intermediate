package factorymethod;

public class MySql extends Database{
    @Override
    public Query createQuery(String query) {
        return new SQL(query);
    }
}
