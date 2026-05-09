package models.people;

public class Person {
    private String name;
    private String surname;
    private Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String newSurname) {
        surname = newSurname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender newGender) {
        gender = newGender;
    }
}
