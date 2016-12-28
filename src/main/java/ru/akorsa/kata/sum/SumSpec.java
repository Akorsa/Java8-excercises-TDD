package ru.akorsa.kata.sum;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static ru.akorsa.kata.sum.Sum.calculate;
import static org.assertj.core.api.Assertions.assertThat;

public class SumSpec {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertThat(calculate(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }

}
