package task3.builder;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.salary = userBuilder.salary;
    }

    @Override
    public String toString() {
        return "User: " +
                "firstName = " + firstName +
                ", lastName = " + lastName +
                ", age = " + age +
                ", salary = " + salary;
    }

    static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private double salary;

        private String getFirstName() {
            return firstName;
        }

        private String getLastName() {
            return lastName;
        }

        private int getAge() {
            return age;
        }

        private double getSalary() {
            return salary;
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder salary(double salary) {
            this.salary = salary;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
