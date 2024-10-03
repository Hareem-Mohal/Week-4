public class Person {
    private String name;
    private String email;
public Person(String name, String email) {
    this.name = name;
    this.email = this.email;
}
public Person(String name) {
    this(name,null);
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Name: %10s\n EmailId: %s", name, email);
    }
}
