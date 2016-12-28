package ru.akorsa.kata.summaryStatistics;

import ru.akorsa.kata.common.Person;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static ru.akorsa.kata.summaryStatistics.PeopleStats.getStats;
import static ru.akorsa.kata.summaryStatistics.PeopleStats.getStats7;
import static org.assertj.core.api.Assertions.assertThat;

public class PeopleStatsSpec {

    Person sara = new Person("Sara", 4);
    Person viktor = new Person("Viktor", 40);
    Person eva = new Person("Eva", 42);
    List<Person> collection = asList(sara, eva, viktor);

    @Test
    public void getStatsShouldReturnAverageAge() {
        assertThat(getStats(collection).getAverage())
                .isEqualTo((double)(4 + 40 + 42) / 3);
        assertThat(getStats7(collection).getAverage())
                .isEqualTo((double)(4 + 40 + 42) / 3);
    }

    @Test
    public void getStatsShouldReturnNumberOfPeople() {
        assertThat(getStats(collection).getCount())
                .isEqualTo(3);
        assertThat(getStats7(collection).getCount())
                .isEqualTo(3);
    }

    @Test
    public void getStatsShouldReturnMaximumAge() {
        assertThat(getStats(collection).getMax())
                .isEqualTo(42);
        assertThat(getStats7(collection).getMax())
                .isEqualTo(42);
    }

    @Test
    public void getStatsShouldReturnMinimumAge() {
        assertThat(getStats(collection).getMin())
                .isEqualTo(4);
        assertThat(getStats7(collection).getMin())
                .isEqualTo(4);
    }

    @Test
    public void getStatsShouldReturnSumOfAllAges() {
        assertThat(getStats(collection).getSum())
                .isEqualTo(40 + 42 + 4);
        assertThat(getStats7(collection).getSum())
                .isEqualTo(40 + 42 + 4);
    }
}
