package ru.jenia.condition;

import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void whenA00toB20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double result = a.distance(b);
        double expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenA10toB20Then1() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        double result = a.distance(b);
        double expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenA11toB22Then1dot4142() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        double result = a.distance(b);
        double expected = 1.4142;
        Assert.assertEquals(expected, result, 0.0001);
    }

    @Test
    public void whenA111toB222Then1dot7320() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(2, 2, 2);
        double result = a.distance3d(b);
        double expected = 1.7320;
        Assert.assertEquals(expected, result, 0.0001);
    }
}