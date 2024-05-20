package factorymethod;

public class SQL implements Query{

    String query;

    public SQL(String query) {
        this.query = query;
    }

    @Override
    public void execute() {
        System.out.println("Executing sql query.");
    }

    @Override
    public String getQuery() {
        return query;
    }
}
