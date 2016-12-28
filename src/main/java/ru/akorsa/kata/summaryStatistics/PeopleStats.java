package ru.akorsa.kata.summaryStatistics;

import ru.akorsa.kata.common.Person;

import java.util.IntSummaryStatistics;
import java.util.List;

public class PeopleStats {

    public static Stats getStats7(List<Person> people) {
        long sum = 0;
        int min = people.get(0).getAge();
        int max = 0;
        for (Person person : people) {
            int age = person.getAge();
            sum += age;
            min = Math.min(min, age);
            max = Math.max(max, age);
        }
        return new Stats(people.size(), max, min, sum);
    }

    public static IntSummaryStatistics getStats(List<Person> people) {
        return people.stream()
                .mapToInt(Person::getAge)
                .summaryStatistics();
    }
}
