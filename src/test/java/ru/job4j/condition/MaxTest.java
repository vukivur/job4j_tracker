package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void addTwo() {
        double result = Max.add(3, 5);
        double expect = 5;
        assertThat(result, is(expect));
    }

    @Test
    public void addThree() {
        double result = Max.add(3, 5, 7);
        double expect = 7;
        assertThat(result, is(expect));
    }

    @Test
    public void addFour() {
        double result = Max.add(3, 5, 7, 9);
        double expect = 9;
        assertThat(result, is(expect));
    }

    @Test
    public void addFourOneMore() {
        double result = Max.add(9, 5, 7, 3);
        double expect = 9;
        assertThat(result, is(expect));
    }
}
