package ru.akorsa.kata.partition;

import ru.akorsa.kata.common.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;

public class Partitioning {

    public static Map<Boolean, List<Person>> partitionAdults7(List<Person> people) {
        Map<Boolean, List<Person>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());
        for (Person person : people) {
            map.get(person.getAge() >= 18).add(person);
        }
        return map;
    }

    // Partition stream of people into adults (age => 18) and kids
    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        return people.stream()
                .collect(partitioningBy(p -> p.getAge() >= 18));
    }
}
