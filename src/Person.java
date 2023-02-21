public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String password;

    public Person(String firstName, String lastName, int age, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    public void check() {
        System.out.println("Starting check...");
    }

}
