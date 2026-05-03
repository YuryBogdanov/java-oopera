import models.people.Actor;
import models.people.Director;
import models.people.Gender;
import models.people.Person;
import models.shows.Ballet;
import models.shows.Opera;
import models.shows.Show;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    public static void main(String[] args) {
        Actor firstActor = new Actor("Александра", "Урсуляк", Gender.FEMALE, 174);
        Actor secondActor = new Actor("Александр", "Дмитриев", Gender.MALE, 182);
        Actor thirdActor = new Actor("Екатерина", "Рогачкова", Gender.FEMALE, 170);

        Director firstDirector = new Director("Евгений", "Писарев", Gender.MALE, 1);
        Director secondDirector = new Director("Римас", "Туминас", Gender.MALE, 2);

        Person musicAuthor = new Person("Геннадий", "Гладков", Gender.MALE);
        Person choreograph = new Person("Юрий", "Григорович", Gender.MALE);

        Show drama = new Show("Зойкина квартира", 140, firstDirector, new ArrayList<>());
        Opera opera = new Opera(
                "Травиата",
                180,
                secondDirector,
                new ArrayList<>(),
                musicAuthor,
                "Большое, длинное либретто оперы",
                100
        );
        Ballet ballet = new Ballet(
                "Щелкунчик",
                170,
                firstDirector,
                new ArrayList<>(),
                musicAuthor,
                "Интересное, загадочное либретто балета",
                choreograph
        );

        assignActors(drama, new ArrayList<>(List.of(firstActor, secondActor)));
        assignActors(opera, new ArrayList<>(List.of(secondActor, thirdActor)));
        assignActors(ballet, new ArrayList<>(List.of(firstActor, thirdActor)));

        drama.printActorsList();
        opera.printActorsList();
        ballet.printActorsList();

        drama.replaceActor("Урсуляк", thirdActor);
        drama.printActorsList();

        opera.replaceActor("Иванов", firstActor);

        opera.printLibretto();
        ballet.printLibretto();
    }

    private static void assignActors(Show show, ArrayList<Actor> actors) {
        for (Actor actor : actors) {
            show.addActor(actor);
        }
    }
}
