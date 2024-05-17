package builder.production;

public class Main {

    public static void main(String[] args) {

     Student student = Student.getBuilder().setAge(12)
             .setName("Rahul").setUniversity("IITP")
             .setPsp(1.0)
             .setPsp(19.0).build();



//     Student.Builder builder = Student.getBuilder();
//
//     if (true) {
//         builder.setAge(12);
//         if (false) {
//             builder.setAge(10);
//         }
//     }

    }
}
