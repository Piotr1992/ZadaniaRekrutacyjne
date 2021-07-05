package UserId;

public class User {

    private int id;
    private String firstname;
    private String lastname;

    public User(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() { return this.id; }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstName() { return this.firstname; }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getLastName() {
        return this.lastname;
    }

}


















/*    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void wypisz(double a, double b) {
        System.out.println("a = " + a + ", b = " + b);
    }

}                   */
