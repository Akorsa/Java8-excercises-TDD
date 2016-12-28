package ru.akorsa.kata.filter;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static ru.akorsa.kata.filter.FilterCollection.transform;
import static ru.akorsa.kata.filter.FilterCollection.transform7;
import static org.assertj.core.api.Assertions.assertThat;

public class FilterCollectionSpec {
    @Test
    public void transformShouldFilterCollection() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My", "is", "Doe");
        assertThat(transform(collection)).hasSameElementsAs(expected);
        assertThat(transform7(collection)).hasSameElementsAs(expected);
    }
}
