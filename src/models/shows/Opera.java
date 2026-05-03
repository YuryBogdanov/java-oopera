package models.shows;

import models.people.Actor;
import models.people.Director;
import models.people.Person;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title,
                 int duration,
                 Director director,
                 ArrayList<Actor> actorsList,
                 Person musicAuthor,
                 String librettoText,
                 int choirSize) {
        super(title, duration, director, actorsList, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
