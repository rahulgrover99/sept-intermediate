package builder.lombok;

public class Main {

    public static void main(String[] args) {

        Student student = Student.builder().name("asnas")
                .age(12).university("SJSIA").build();

    }
}
