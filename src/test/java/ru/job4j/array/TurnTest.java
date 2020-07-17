package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void turnLength4() {
        int[] input = {0, 1, 2, 3};
        int[] expect = {3, 2, 1, 0};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }
    @Test
    public void turnLength3() {
        int[] input = {0, 1, 2};
        int[] expect = {2, 1, 0};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }
}