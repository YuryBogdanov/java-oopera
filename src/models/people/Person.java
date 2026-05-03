package models.people;

public class Person {
    private String name;
    private String surname;
    private Gender gender;
}

enum Gender {
    MALE,
    FEMALE
}
