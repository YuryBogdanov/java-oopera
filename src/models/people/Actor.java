package models.people;

import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) return false;
        if (obj == null) return false;
        if (this == obj) return true;

        Actor otherActor = (Actor) obj;

        return this.getName().equals(otherActor.getName())
                && this.getSurname().equals(otherActor.getSurname())
                && this.getHeight() == otherActor.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getGender(), height);
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (рост: " + height + " см)";
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

