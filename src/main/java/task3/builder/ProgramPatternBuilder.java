package task3.builder;

public class ProgramPatternBuilder {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .firstName("Aliaksandra")
                .lastName("Ryzhyk")
                .age(32)
                .salary(100.00)
                .build();
        System.out.println(user);
    }
}

