package ru.akorsa.kata.filterMap;

import ru.akorsa.kata.common.Person;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static ru.akorsa.kata.filterMap.Kids.getKidNames;
import static ru.akorsa.kata.filterMap.Kids.getKidNames7;
import static org.assertj.core.api.Assertions.assertThat;

public class KidsSpec {

    @Test
    public void getKidNameShouldReturnNamesOfAllKidsFromList() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = asList(sara, eva, viktor, anna);
        assertThat(getKidNames(collection))
                .contains("Sara", "Anna")
                .doesNotContain("Viktor", "Eva");
        assertThat(getKidNames7(collection))
                .contains("Sara", "Anna")
                .doesNotContain("Viktor", "Eva");
    }

}
