package ru.akorsa.kata.groupBy;

import ru.akorsa.kata.common.Person;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static ru.akorsa.kata.groupBy.Grouping.groupByNationality;
import static ru.akorsa.kata.groupBy.Grouping.groupByNationality7;
import static org.assertj.core.api.Assertions.assertThat;

public class GroupungSpec {

    @Test
    public void groupByNationatilityShouldSeparatePeopleByNationality() {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = asList(sara, eva, viktor);
        Map<String, List<Person>> result = groupByNationality(collection);
        assertThat(result.get("Norwegian")).hasSameElementsAs(asList(sara, eva));
        assertThat(result.get("Serbian")).hasSameElementsAs(asList(viktor));

        result = groupByNationality7(collection);
        assertThat(result.get("Norwegian")).hasSameElementsAs(asList(sara, eva));
        assertThat(result.get("Serbian")).hasSameElementsAs(asList(viktor));
    }
}
