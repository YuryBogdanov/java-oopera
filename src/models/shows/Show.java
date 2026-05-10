package models.shows;

import models.people.Actor;
import models.people.Director;

import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> actorsList;

    public Show(String title,
                int duration,
                Director director,
                ArrayList<Actor> actorsList) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.actorsList = actorsList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getActorsList() {
        return actorsList;
    }

    public void setActorsList(ArrayList<Actor> actorsList) {
        // Здесь дополнительное приседание с созданием нового списка,
        // чтобы псследующие изменения этого списка не аффектили тот список, который передали.
        // Если тут было достаточно this.actorsList = actorsList - напишите в ревью, пожалуйста :)
        if (actorsList == null) {
            this.actorsList = new ArrayList<>();
        } else {
            this.actorsList = new ArrayList<>(actorsList);
        }
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void printActorsList() {
        System.out.println("Список актёров, задействованных в спектакле '" + title + "': ");
        System.out.println(actorsList);
    }

    public void addActor(Actor actor) {
        if (actorsList.contains(actor)) {
            System.out.println("Этот актёр уже задействован в спектакле");
        } else {
            actorsList.add(actor);
        }
    }

    public void replaceActor(String surnameToReplace, Actor replacementActor) {
        Actor actorToReplace = findActorBySurname(surnameToReplace);
        if (actorToReplace == null) {
            System.out.println("Искомый актёр не задействован в спектакле '" + title + "'");
            return;
        }
        actorsList.remove(actorToReplace);
        actorsList.add(replacementActor);
        System.out.println("В спектакле '" + title + "' актёр " + surnameToReplace + " заменён на актёра " +
                replacementActor.getSurname());
    }

    private Actor findActorBySurname(String surname) {
        for (Actor actor : actorsList) {
            if (actor.getSurname().equals(surname)) {
                return actor;
            }
        }
        return null;
    }
}
