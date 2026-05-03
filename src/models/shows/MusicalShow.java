package models.shows;

import models.people.Actor;
import models.people.Director;
import models.people.Person;

import java.util.ArrayList;

public class MusicalShow extends Show {
    private Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title,
                       int duration,
                       Director director,
                       ArrayList<Actor> actorsList,
                       Person musicAuthor,
                       String librettoText) {
        super(title, duration, director, actorsList);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
}
