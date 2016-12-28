package ru.akorsa.kata.partition;

import ru.akorsa.kata.common.Person;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static ru.akorsa.kata.partition.Partitioning.partitionAdults;
import static ru.akorsa.kata.partition.Partitioning.partitionAdults7;
import static org.assertj.core.api.Assertions.assertThat;

public class PartitioningSpec {

    @Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, viktor);

        Map<Boolean, List<Person>> result = partitionAdults(collection);

        Map<Boolean, List<Person>> result2 = partitionAdults7(collection);

        assertThat(result.get(true)).hasSameElementsAs(asList(viktor, eva));
        assertThat(result.get(false)).hasSameElementsAs(asList(sara));
        assertThat(result2.get(true)).hasSameElementsAs(asList(viktor, eva));
        assertThat(result2.get(false)).hasSameElementsAs(asList(sara));
    }

}
