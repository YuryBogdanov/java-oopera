package models.shows;

import models.people.Actor;
import models.people.Director;

import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> actorsList;

    public Show(String title, int duration, Director director, ArrayList<Actor> actorsList) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.actorsList = actorsList;
    }
}
