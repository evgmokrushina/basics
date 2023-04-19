package ru.jenia.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax6To6Then6() {
        int left = 6;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To8To3Then8() {
        int first = 2;
        int second = 8;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax9To5To2To12Then12() {
        int first = 9;
        int second = 5;
        int third = 2;
        int fourth = 12;
        int result = Max.max(first, second, third, fourth);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }
}