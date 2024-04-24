package collections;

public class PrimitiveClass {
    String name;
    Integer id;

    public PrimitiveClass(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "PrimitiveClass{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
