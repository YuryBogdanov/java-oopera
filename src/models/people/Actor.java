package models.people;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        Actor otherActor = (Actor) obj;

        return this.getName().equals(otherActor.getName())
                && this.getSurname().equals(otherActor.getSurname())
                && this.getHeight() == otherActor.getHeight();
    }

    public String getActorInfo() {
        return getName() + " " + getSurname() + "(рост: " + height + " см)";
    }

    public int getHeight() {
        return height;
    }
}

