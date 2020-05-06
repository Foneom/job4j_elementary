package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5then0() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int rslt = findLoop.indexOf(input, value);
        int expect = 0;
        assertThat(rslt, is(expect));
    }
    @Test
    public void whenArrayHas6then0() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 6;
        int rslt = findLoop.indexOf(input, value);
        int expect = 0;
        assertThat(rslt, is(expect));
    }

}