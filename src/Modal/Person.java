package Modal;

public class Person {

    private String name;
    private String Email;
    private String Phone;

    public Person() {
    }

    public Person(String name, String email, String phone) {
        this.name = name;
        Email = email;
        Phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
