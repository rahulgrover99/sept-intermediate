package builder.production;

public class Student {

    private String name;
    private String university;
    private int age;
    private double psp;

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.psp = builder.psp;
        this.university = builder.university;
    }

    public static Builder getBuilder() {
        return new Builder();
    }


    public static class Builder {
        private String name;
        private String university;
        private int age;
        private double psp;

        public Student build() {
            return new Student(this);
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }
    }
}
