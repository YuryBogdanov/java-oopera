package models.people;

public class Director extends Person {
    private int showsCount;

    public Director(String name, String surname, Gender gender, int showsCount) {
        super(name, surname, gender);
        this.showsCount = showsCount;
    }

    public String getDirectorInfo() {
        return "Режиссёр спектакля: " + getName() + " " + getSurname();
    }
}
