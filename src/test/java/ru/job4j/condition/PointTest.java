package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distance() {
        Point first = new Point(2, 7);
        Point second = new Point(-2, 7);
        double expect = 4;
        double result = first.distance(second);
        assertThat(result, is(expect));
    }

    @Test
    public void distance3d() {
        Point first = new Point(1, 2, 3);
        Point second = new Point(-7, -2, 4);
        double expect = 9;
        double result = first.distance3d(second);
        assertThat(result, is(expect));
    }
}
