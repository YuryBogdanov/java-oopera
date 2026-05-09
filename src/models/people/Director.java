package models.people;

public class Director extends Person {
    private int showsCount;

    public Director(String name, String surname, Gender gender, int showsCount) {
        super(name, surname, gender);
        this.showsCount = showsCount;
    }

    @Override
    public String toString() {
        return "Режиссёр спектакля: " + getName() + " " + getSurname();
    }

    public int getShowsCount() {
        return showsCount;
    }

    public void setShowsCount(int newShowsCount) {
        showsCount = newShowsCount;
    }
}
