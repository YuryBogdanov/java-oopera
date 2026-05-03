package models.shows;

import models.people.Actor;
import models.people.Director;
import models.people.Person;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private final Person choreographer;

    public Ballet(String title,
                  int duration,
                  Director director,
                  ArrayList<Actor> actorsList,
                  Person musicAuthor,
                  String librettoText,
                  Person choreographer) {
        super(title, duration, director, actorsList, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
