package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
    private List<Person> persons;

    public PersonRepository(List<Person> persons) {
        this.persons = persons;
    }

    public Optional<Person> getPersonById(String id) {
        for (Person person : persons) {
            if (person.id().equals(id)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public int numberOfPeopleByGender(Gender gender) {
        int counter = 0;
        for (Person person : persons) {
            if (person.genderOfPerson().equals(gender)) {
                counter++;
            }
        }
        return counter;
    }
}
