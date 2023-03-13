package ru.jenia.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when756Then567() {
        int[] data = new int[] {7, 5, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 6, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when85469Then45689() {
        int[] data = new int[] {8, 5, 4, 6, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 5, 6, 8, 9};
        assertThat(result).containsExactly(expected);
    }
}