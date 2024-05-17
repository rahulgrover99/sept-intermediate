package prototype;


public class AdvancedStudent extends Student{
    private String company;

    public AdvancedStudent(String company) {
        this.company = company;
    }

    AdvancedStudent(AdvancedStudent other) {
        super(other);
        this.company = other.company;
    }


    @Override
    public AdvancedStudent clone() {
        return new AdvancedStudent(this);

    }
}
