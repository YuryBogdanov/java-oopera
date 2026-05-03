package models.shows;

import models.people.Actor;
import models.people.Director;

import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors; // тут лучше actorsList
}
