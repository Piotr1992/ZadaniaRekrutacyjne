package StudentPresences;

public class Student {

    private String firstName;
    private String lastName;

    Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

}
