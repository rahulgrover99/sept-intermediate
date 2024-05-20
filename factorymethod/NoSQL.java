package factorymethod;

public class NoSQL implements Query{
    String query;

    public NoSQL(String query) {
        this.query = query;
    }

    @Override
    public void execute() {
        System.out.println("Executed a no sql query.");
    }

    @Override
    public String getQuery() {
        return query;
    }
}
