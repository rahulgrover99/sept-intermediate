package builder;

public class StudentSetter {
        private String name;
        private String university;
        private int age;
        private double psp;

    public StudentSetter() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public static void main(String[] args) {
        StudentSetter st = new StudentSetter();
        st.setAge(12);
        st.setUniversity("122");
    }
}


