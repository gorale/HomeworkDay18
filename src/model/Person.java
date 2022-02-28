package model;

public class Person {
    private String firstname;
    private String lastname;
    private String passportId;
    private int age;
    private String gender;
    private String nationality;

    public Person(String firstname, String lastname, String passportId, int age, String gender, String nationality) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.passportId = passportId;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }

    public Person() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public  void display() {
        System.out.print("Firstname: " + firstname + "\n"
                + "Lastname: " + lastname + "\n"
                + "Passport Id: " + passportId + "\n"
                + "age: " + age + "\n"
                + "gender: " + gender + "\n"
                + "nationality: " + nationality);
    }

}
