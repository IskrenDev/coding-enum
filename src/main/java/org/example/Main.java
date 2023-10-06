package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(getWorkingDayOrWeekend(DaysOfWeek.SATURDAY));

        List<Person> personList = new ArrayList<>();
        PersonRepository personRepository = new PersonRepository(personList);

        Person person1 = new Person("1", "Aljoscha", DaysOfWeek.FRIDAY, Gender.MALE);
        Person person2 = new Person("2", "Iskren", DaysOfWeek.THURSDAY, Gender.MALE);
        Person person3 = new Person("3", "Alex", DaysOfWeek.SATURDAY, Gender.MALE);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println(personRepository.getPersonById("3"));
        System.out.println(personRepository.numberOfPeopleByGender(Gender.MALE));
    }

    public static String getWorkingDayOrWeekend(DaysOfWeek day) {
        switch (day) {
            case MONDAY: return "Monday";
            case TUESDAY: return "Tuesday";
            case WEDNESDAY: return "Wednesday";
            case THURSDAY:  return "Thursday";
            case FRIDAY: return "Friday";
            case SATURDAY:
            case SUNDAY: return "Weekend";
            default: return "Invalid day";
        }
    }
}