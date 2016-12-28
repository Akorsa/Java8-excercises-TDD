package ru.akorsa.kata.map;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static ru.akorsa.kata.map.ToUpperCase.transform;
import static ru.akorsa.kata.map.ToUpperCase.transform7;
import static org.assertj.core.api.Assertions.assertThat;

public class ToUpperCaseSpec {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertThat(transform(collection)).hasSameElementsAs(expected);
        assertThat(transform7(collection)).hasSameElementsAs(expected);
    }
}
